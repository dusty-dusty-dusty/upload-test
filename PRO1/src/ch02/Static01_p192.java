package ch02;

//static(p192) - 클래스의, 공통적인
/*정적 멤버: 정적필드,정적메서드
- static 키워드를 추가해 정적 필드와 정적 메소드로 선언
- 클래스가 메모리로 로딩되면 정적 멤버를 바로 사용할 수 있음 
- 클래스 이름과 함께 도트(.) 연산자로 접근
- 정적 필드와 정적 메소드는 객체 참조 변수로도 접근
*/

public class Static01_p192 {
	//[접근제어자] [제어자] 타입 필드명[=초기값]
	       int a = 100;	//필드 전역변수 non-static
	static int b = 1000;//
	
	//[접근제어자] [제어자] 리턴타입 메서드명(매개변수변수리스트){}
	void test(){
		a=500;
		b=5000;
	}
	
	public static void main(String[] args) {
		//a=500;
		//b=5000;
	}

}


