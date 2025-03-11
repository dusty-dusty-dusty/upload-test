package ch05;

public class Person02_main {

	public static void main(String[] args) {
		// Person02클래스의 객체생성
		// 객체 생성 할 때 마다 서로 다른 heap영역의 주소에 위치
		Person02 p1 = new Person02();  		//ch05.Person02@626b2d4a
		Person02 p2 = new Person02("유관순"); //ch05.Person02@5e91993f
		Person02 p3 = new Person02(150.9);  //ch05.Person02@1c4af82c
		Person02 p4 = new Person02(14);		//ch05.Person02@379619aa
		
		System.out.println("p1 ="+p1);//fullName=null, height=0.0, age=0
		System.out.println("p2 ="+p2);//fullName=유관순, height=0.0, age=0
		System.out.println("p3 ="+p3);//fullName=null, height=150.9, age=0
		System.out.println("p4 ="+p4);//fullName=null, height=0.0, age=14
		
	}

}
