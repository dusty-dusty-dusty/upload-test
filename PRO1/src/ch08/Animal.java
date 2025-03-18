package ch08;

//이 클래스는 고양이Cat,사람Human,개Dog,새Bird의 상위클래스이다
public class Animal {
	//[접근제어자] [제어자] 타입 field명[=초기값]
	private char gender; //성별
	private int age;//나이
	private double height; //키

	//constructor
	//[접근제어자] 클래스명(){}
	
	//method
	//[접근제어자] [제어자] 리턴타입 메서드명(매개변수리스트){}
	//먹는다
	void eat(String food){
		System.out.println("Animal-eat()food="+food);
	}
	
	//잔다
	void sleep(){
		System.out.println("Animal-sleep()");
	} 
	
	//소리낸다
	String sound(){
		return "Animal-sound()";
	}

	public void move(Animal animal) {
		// TODO Auto-generated method stub
		
	} 
}
