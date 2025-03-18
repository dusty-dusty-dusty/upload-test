package ch08;

public class Bird extends Animal {

	//알을 낳는다
	void layEggs(){
		System.out.println("Bird-layEggs()");
	}

	@Override
	String sound() {
		return "Bird sound()-꾀꼴짹";
	}
}
