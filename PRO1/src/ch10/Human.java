package ch10;

//이 클래스는 Animal인터페이스의 구현클래스이다
//Animal인터페이스에서 선언한 추상메서드 반드시 구현해야만 한다-> 오버라이딩
public class Human implements Animal {

	@Override
	public String sound() {
		return "Human에서 구현한 sound()";
	}
	
	public void write() {
		System.out.println("Human write()");
	}

}
