package ch05;


//이 클래스는 Car01클래스의 실행클래스이다.
public class Car01_main {
	
	public static void main(String[]args) {
		//Car01클래스의 필드의 값을 조회
		//=> showInfo() 호출
		
		Car01 car = new Car01();
		System.out.println(car);
		car.showInfo();
		System.out.println("car.showInfo()호출 후");
		car.drive();
		car.stop();

	}
		
		
}
