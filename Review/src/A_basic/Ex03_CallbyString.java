package A_basic;

/*
 * 	Call by reference
 * 		: 함수의 인자로 참조형이 전달될때
 * 
 * 		=> 주소가 복사됨
 */
public class Ex03_CallbyString {

	public static void main(String[] args) {
		
		String a = "안녕";   //new String("안녕"); - new 생략가능
		String b = "홍길동";  //new String("홍길동"); - new 생략가능
		
		add(a, b);
		System.out.println("[2] A="+a+ ",B="+b);
	}
	
	static void add(String a, String b){
		a+=b; 
		
		System.out.println("[1] A="+a+",B="+b);
	}
}
