package ch08;

//이 클래스는 Animal클래스의 하위클래스이다
public class Cat extends Animal {

	//그루밍한다()
	void grooming(){
		System.out.println("Cat-grooming()");
	}
	
	@Override
	String sound() {
		return "Cat sound()-야옹";
	}
}
