package ch08;

public class Human extends Animal {

	//글을 쓴다
	void write(){
		System.out.println("Human-write()");
	}
	
	@Override
	String sound() {
		return "Human sound()-말한다";
	}
}
