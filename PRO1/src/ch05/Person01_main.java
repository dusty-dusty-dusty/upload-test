package ch05;

//이 클래스는 Person01클래스의 실행클래스이다.

public class Person01_main {

	public static void main(String[] args) {
		//Person01클래스으 객체생성하여 (주소)확인
		//클래스명 참조변수 = new 클래스명();
		Person01 p1 = new Person01();
		System.out.println("p1="+p1);//p1=ch05.Person01@6f2b958e
		
		//String 1개인 생성자호출하여 객체생성
		Person01 p2 = new Person01("문자~");
		System.out.println("p2="+p2);
	}

}
