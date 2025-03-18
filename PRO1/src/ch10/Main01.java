package ch10;

//실행클래스
public class Main01 {

	public static void main(String[] args) {
		//다형성
		//부모클래스 참조변수 = new 자식클래스();
		//인터페이스 참조변수 = new 구현클래스();
		Animal animal = new Human();
		System.out.println("(1)animal.sound()="+animal.sound() ); //Human에서 구현한 sound()
		
		animal = new Dog();
		System.out.println("(2)animal.sound()="+animal.sound() ); //?
		
		//Human객체생성
		Human human = new Human();
		human.write(); //Human write()
		System.out.println( human.sound() ); //Human에서 구현한 sound()

		//Dog객체생성
		Dog dog = new Dog();
		dog.gard(); //Dog gard()
		System.out.println(dog.sound() ); //Dog에서 구현한 sound()
	}

}