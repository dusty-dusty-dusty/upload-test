package ch09;

//final(p314) - 마지막의, 변경될 수 없는
//class, method, 변수앞에서 사용될 수 있다
public class Final01_p314 {

	//필드
	//[접근제어자] [제어자] 타입 필드명[=초기값]
	int a = 10;
	final int b = 10;  //필드(field). 전역변수. 멤버변수. 인스턴스변수. non-static
	
	//method
	void m1() {
		a = 100;
		//b = 500;
		//The final field Final01_p314.b cannot be assigned
		
		int a1 = 10;		//지역변수(local variable)
		final int b1 = 10;
		a1 = 100;
		//b1 = 500;
		//The final local variable b1 cannot be assigned. 
		//It must be blank and not using a compound assignment
	}
	
}

//[접근제어자] [제어자] class 클래스명{}
final class Father01{}
//class Sun01 extends Father01{} 
//The type Sun01 cannot subclass the final class Father01



class Mother01{
	//[접근제어자] [제어자] 리턴타입 메서드명(매개변수리스트){}
	void dancing() { System.out.println("Mother01-dancing():한국무용"); }
	final void running() {}
}

class Daughter01 extends Mother01{
	//필드
	//method
	@Override
	void dancing() {System.out.println("Daughter01-dancing():한국무용+팝핀"); }
	//@Override
	//void running() {} //Cannot override the final method from Mother01
}



