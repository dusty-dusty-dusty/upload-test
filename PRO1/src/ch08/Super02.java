package ch08;

//super - 상위 클래스를 호출하는 참조변수
//super() - p255. 명시적으로 상위 클래스 생성자 호출
//class extends 상위클래스명
public class Super02 {
}

class GrandMother01{
	GrandMother01(){ 
		System.out.println("GrandMother01()기본생성자");
	}
	GrandMother01(String str){ 
		System.out.println("GrandMother01(String str)="+str);
	}
}

class Mother01  extends GrandMother01{
	Mother01(){ 
		System.out.println("Mother01()기본생성자");
	}
	Mother01(String str){ 
		super(str);
		System.out.println("Mother01(String str)="+str);
	}
}

class Daughter01 extends Mother01{
	//필드
	//생성자
	Daughter01(){ 
		super("딸Daughter01이->엄마Mother01에게 드리는선물");
		System.out.println("Daughter01()기본생성자"); 
	}
	//method

}
