package ch05;

//이 클래스는 Car02 클래스의 실행 클래스입니다.

public class Car02_main {
	
	public static void main(String[]args) {
		//클래스의 객채생성
		//new 클래스명
		
		//참조변수 선언
		//타입 변수명
		//Car02 c;
		
		//Car02크래스의 객새생성 및 참조변수에 할당
		//클래스명 변수명 = new 클래스명 클래스명();
		Car02 c=new Car02();
		System.out.println("Car02타입의 참조변수 c="+c);
		//ch05.Car02@6f2b958e
		//System.out.println(c.company);
		//The field Car02.company is not visible
		//원인 car 클래스의 compant필드는 접근을 제한ㅍ
		
		//System.out.println("변경전 c.maxSpeed="+c.maxSpeed);
		//c.maxSpeed =400;
		//System.out.println("변경 후 c.maxSpeed="+c.maxSpeed);
		
		c.m1();
		c.m2("홍길동");
		char result3 = (char)c.m3(); // (char)65 -> 'A'
		//int result3 =(char) c.m3(); //65
		System.out.println("c.m3()의 리턴값 result3="
		+result3);
		String result=c.m4("계란","밀");
		System.out.println("c.m4()의 리턴값 result4="+result);
	}	
}
