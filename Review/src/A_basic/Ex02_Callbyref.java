package A_basic;

/*
 * 	Call by reference
 * 		: 함수의 인자로 참조형이 전달될때
 * 
 * 		=> 주소가 복사됨
 */
public class Ex02_Callbyref {

	public static void main(String[] args) {
		
		StringBuilder a = new StringBuilder("안녕");
		StringBuilder b = new StringBuilder("홍길동");
		
		add(a, b);
		System.out.println("[2] A="+a+ ",B="+b);
	}
	
	static void add(StringBuilder a, StringBuilder b){
		a.append(b);
		
		System.out.println("[1] A="+a+",B="+b);
	}
}
