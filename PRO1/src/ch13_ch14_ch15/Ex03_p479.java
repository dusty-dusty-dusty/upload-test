package ch13_ch14_ch15;

/*람다식 예)
int add(int x, int y) {
    return x + y;
}

//위의 메서드를 람다 표현식을 이용해 아래와 같이 단축 시킬수 있다. 
//(메서드 반환 타입, 메서드 이름 생략)
(int x, int y) -> {
	return x + y; 
};

//매개변수 타입도 생략 할 수 있다.
(x, y) -> {
	return x + y;
};

//함수에 리턴문 한줄만 있을 경우 더욱 더 단축 시킬 수 있다. 
//(중괄호, return 생략)
(x, y) -> x + y;
*/
public class Ex03_p479 {
	
	public static void main(String[] args) {
/*		
		MyFunction obj = new MyFunction(){
			//오버라이딩
			public int max(int a, int b) {  
				return (a>b) ? a : b;
			}
		};
		//참조변수.메서드명()
		int result = obj.max(100, 9999);  //함수형 인터페이스에 선언한 메서드호출
		System.out.println("result = "+result);
*/

		MyFunction obj = (a,b)->a > b ? a : b;  //람다식
		//함수형인터페이스MyFunction 타입의 참조변수obj로 람다식을 참조할 수 있음.
		int result = obj.max(10000, 9999);  //함수형 인터페이스에 선언한 메서드호출
		System.out.println("result = "+result);
	}//main
}//class

//함수형 인터페이스 - 단 하나의 추상 메서드만 선언된 인터페이스
//함수형 인터페이스 타입의 참조변수로 람다식을 참조할 수 있음.
//(단, 함수형 인터페이스의 메서드와 람다식의 매개변수 개수와 반환타입이 일치해야 함.)
interface MyFunction{
	//상수
	//추상메서드 - public abstract 리턴유형 메서드명(매개변수리스트);
	public abstract int max(int a, int b);
}





