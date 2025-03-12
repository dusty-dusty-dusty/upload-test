package ch08;

//super-상위 클래스를 호출하는 참조변수
//class extends 상위클래스명
public class Super01_p254 {
}

class father01{
	int a = 100;
	void swimming () {}
	void sing() {System.out.println("발라드잘부른다.");}
}

class sun01 extends father01{
	//필드
	//int a = 100;
	String b="필드추가";
	//constructor
	//method
	void test() {
		this.a = 200;
		super.a =300;
		this.swimming();
		super.swimming();
	}
	//vioi swimming
	public void sing() {System.out.println("발라드+랩 잘 부른다.");}
}