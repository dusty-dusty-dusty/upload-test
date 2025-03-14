package ch02;

/*연산자의 우선순위
 * 괄호의 우선순위가 제일 높다
 * 산술> 비교 > 논리 > 대입
 * 단항 > 이항 > 삼항
 * 연산자의 연산 진행방향은 왼쪽에서 오른쪽 , 단 단항 대입 연산자만 오른쪽에서 왼쪽
 */

/*자료형
 * -논리형 : boolean 
 * -char : char
 * -정수 : byte(1)< short(2) < int(기본 4) < long(8)
 * -실수 : float(4) < double(기본 8)
 * CTRL + Shfit + /: 다중라인 주석문 적용
   CTRL + Shfit + \: 다중라인 주석문 해제
   CTRL + /: 한줄 주석문
 */ 

public class Ex05_63 {
	
	public static void main(String[] args) {
		
		char c22 = '!';
		int result22= c22 + c22;
		System.out.println("int result22="+result22);
		System.out.println((char)result22);
		
		//-----------------------
		int c11 = 'a';
		System.out.println("int c11="+c11);
		int result21 = c11 * 2;
		System.out.println("int result21="+result21);
		
		//-----------------------
		byte a11 =50;
		short b11 = 5;
		int result11 = a11 - b11;
		//a11 - b11
		//a11
		//byte> int
		//int
		//    b11
		// 	  short->int
		//    int
		//int - int
		System.out.println("result11="+result11);
		
		
	//----------------------------------			
		int a1 = 50;
		int b1 = 5;
		int result1 = a1+ b1; //int+int
		System.out.println("result1 = "+result1);
	//----------------------------------
		byte a2 = 50;
		byte b2 = 5;
		
		int result2 = a2+ b2; //int+int
		System.out.println("result2 = "+result2);

		long result3 = a2 + b2;
		System.out.println("result3 = "+result3);

		byte result4 = (byte)(a2 + b2);
		System.out.println("result4 = "+result4);
		
	//----------------------------------
		int a =50;
		int b =5;
		int result = a + b;
		System.out.println("result="+result);
	
	}
	
}
