package A_basic;

/*
 * call by value
 * 
 * 		: 함수의 인자로 기본형이 전달될 때
 * 
 * 		-> 파라메터로 값만 복사되는 경우
 */

public class Ex01_CallByValue {

	public static void main(String[] args) {
		
		int a = 10, b = 20;
		add(a, b);
		System.out.println("[2]A="+ a + ",B=" + b); //30 20
	}
	
	static void add(int a, int b){
		a+=b;
		System.out.println("[1]A="+ a + ",B=" + b); //30  20
	}
	
}
