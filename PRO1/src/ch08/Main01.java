package ch08;

public class Main01 {

	public static void main(String[] args) {
		//클래스명 참조변수 = new 클래스명();
		//Animal객체생성
		Animal animal = new Animal();
		System.out.println("animal.sound()="+animal.sound());//Animal-sound()
		animal.move(animal);//ch08.Animal@626b2d4a가 움직여요
		
		
		//동물=사람
		//부모클래스명 참조변수 = new 자식클래스명();  //다형성
		animal = new Human();
		//animal.write();//문제발생
		//The method write() is undefined for the type Animal
		//부모클래스에 선언된  field와 method를 호출할 수 있다
		//여기에서는 부모클래스인 animal에 write()는 선언되어 있지않기때문에 문제발생
		System.out.println( animal.sound() ); //Human sound()-말한다
		//마지막으로 오버라이딩된 메서드를 호출한다
		//여기에서는  부모클래스인 animal에 sound()가 있지만
		//Human에서 마지막으로 오버라딩한 sound()가ㅣ 호출되었다
		animal.move(animal);//ch08.Human@1c4af82c가 움직여요
		
		//동물=개
		//조상클래스명 참조변수 = new 자손클래스명();
		animal = new Dog();
		animal.sleep();  //Animal-sleep()
		System.out.println( animal.sound() );//Dog sound()-멍멍~
		animal.move(animal);//ch08.Dog@cac736f가 움직여요
				
		//동물=고양이
		//super클래스명 참조변수 = new sub클래스명();
		animal = new Cat();
//		animal.grooming(); //문제발생.
//		The method grooming() is undefined for the type Animal
		System.out.println( animal.sound() ); //Cat sound()-야옹
		animal.move(animal);//ch08.Cat@156643d4가 움직여요
		
		//동물=새
		animal = new Bird();
//		animal.layEggs();//문제발생.
		//The method layEggs() is undefined for the type Animal
		System.out.println( animal.sound() ); //Bird sound()-꾀꼴짹
		animal.move(animal);//ch08.Bird@7de26db8가 움직여요
		
		
		
		System.out.println("\n--------------------");
		//사람객체생성
		Human h = new Human();
		h.write();
		System.out.println( h.sound() ); //Human sound()-말한다
		
		System.out.println("\n--------------------");
		//개객체생성
		Dog dog = new Dog();
		dog.sleep();
		System.out.println( dog.sound() );
		
		System.out.println("\n--------------------");
		//고양이객체생성
		Cat cat = new Cat();
		cat.grooming();
		System.out.println( cat.sound() );
		
		System.out.println("\n--------------------");
		//새객체생성
		Bird bird = new Bird();
		bird.layEggs();
		System.out.println( bird.sound() );
	}

}
