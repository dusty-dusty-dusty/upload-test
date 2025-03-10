package ch02;

public class Ex03_p47 {

	//진입함수
	public static void main(String[] args) {
		System.out.println("main 메서드 진입");
		main2(); //method호출- main2라는 이름의 메서드를 호출
		System.out.println("main 메서드 끝부분이야~. 오늘 수업도 수고하셨어요!! 낼 봐요~~");
	}
	
	//method선언 - main2라는 이름의 메서드를 선언
	public static void main2() {
		System.out.println("~~~~main2 메서드 진입");
	}
}
