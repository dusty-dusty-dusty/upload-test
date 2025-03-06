package ch02;

public class Ex03_47 {
	
	//진입함수, 진입메서드
	public static void main(String[] args) {
		System.out.println("main 메서드 진입");
		main2();//method 호출 - main2라는 이름의 메서드를 호출
		System.out.println("main 메서드 끝부분임");
	}
	
	
	//method선언 - main 라는 이름의 메서드를 선언
	public static void main2() {
		System.out.println("main2 메서드 진입1");
		System.out.println("main2 메서드 진입2");
	}	
}
