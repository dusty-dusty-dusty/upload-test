package ch16;

public class Ex02_p600 {
	public static void main(String args[]) {
		//스레드 생성 및 시작
		Thread1 th1 = new Thread1(); //스레드 생성
		Thread2 th2 = new Thread2(); //스레드 생성
		th1.start(); //스레드를 시작
		th2.start(); //스레드를 시작

//		//스레드 일시 정지
//		try {
//			Thread.sleep(6000);	//메인 스레드가 2초 동안 일시 정지됨. 1ms=1/1000초 1000ms=1초
//			//그 동안 th1과 th2 스레드는 계속 실행
//		} catch(InterruptedException e) {}

		System.out.print("<<main쓰레드>>");
	} //main쓰레드
}

class Thread1 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print("-");
			//스레드 일시 정지
			try {
				Thread.sleep(500);	//메인 스레드가 2초 동안 일시 정지됨. 1ms=1/1000초 1000ms=1초
				//그 동안 th1과 th2 스레드는 계속 실행
			} catch(InterruptedException e) {}
		}
		
		System.out.print("<<th1쓰레드>>");
	}//run()
}

class Thread2 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) System.out.print("|");
		System.out.print("<<th2쓰레드>");
	}//run()
}