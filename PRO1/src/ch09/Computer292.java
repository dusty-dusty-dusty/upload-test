package ch09;

/*추상클래스(p292)- abstract class
- 클래스가 설계도라면 추상클래스는 ‘미완성 설계도’
- 추상메서드(미완성 메서드)를 포함하고 있는 클래스
- 추상메서드 : 선언부만 있고 {}구현부(몸통, body)가 없는 메서드
- 일반메서드가 추상메서드를 호출할 수 있다.(호출할 때 필요한 건 선언부)
- 완성된 설계도가 아니므로 인스턴스를 생성할 수 없다
- 다른 클래스를 작성하는 데 도움을 줄 목적으로 작성된다.

*추상메서드(abstract method)란?
- 선언부만 있고 구현부(몸통, body)가 없는 메서드
- 꼭 필요하지만 자손마다 다르게 구현될 것으로 예상되는 경우에 사용
- 추상클래스를 상속받는 자손클래스에서 추상메서드의 구현부를 완성한다
*/

//이 클래스는 (Desktop293)클래스와 (Notebook296)의 부모클래스이다
//[접근제한자] [제어자] class 클래스명{}
public abstract class Computer292 {
	//[접근제한자] [제어자] 타입 필드명[=초기값]
	
	//[접근제한자] [제어자] 리턴유형 메서드명(매개변수리스트){}
	void turnOn(){ System.out.println("Computer292의 turnOn()"); }
	abstract void camera();//추상메서드(abstract method)란?
}

class Desktop293 extends Computer292{
	@Override
	void camera(){ System.out.println("Desktop293의 camera()-설치해야해요"); }
}

class Notebook296 extends Computer292{
	@Override
	void camera(){ System.out.println("Notebook296의 camera()-내장되어있지요"); }
}






