package ch05;


//이 클래스는 Car01클래스의 실행클래스이다
/*메서드호출 :
 *문법> 참조변수.메서드명() 
 *  예> car.showInfo();
 */
public class Car01_main {

	public static void main(String[] args) {//진입함수
		//Car01클래스의 필드의 값을 조회
		//=> showInfo() 호출
		
		//new Car01() : Car01클래스의 객체를 생
		//Car01 car: Car01타입의 참조변수 car선언
		//Car01 car = new Car01(); Car01클래스의 객체를 생성하고 그 주소를 참조변수 car에 할당
		Car01 car = new Car01();
		
		System.out.println("참조변수 car에 할당된 주소="+car);//참조변수 car에 할당된 주소를 출력
		//ch05.Car01@1c4af82c
		System.out.println("car.toString()="+car.toString());//ch05.Car01@1c4af82c
		
		car.showInfo(); //참조변수 car에 할당된 주소를 참조(reference)하여  Car01클래스의 showInfo()메서드를 호출
		System.out.println("car.showInfo()호출 후");
		
		car.drive(); //Car01클래스의 drive()메서드를 call

		car.stop();
	}

}








