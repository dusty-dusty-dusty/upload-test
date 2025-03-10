package ch02;

/*p63
  *자료형
 *-논리형 : boolean
 *-char : char
 *-정수 : byte(1)<short(2)<int(기본.4)<long(8)
 *-실수 : float(4)<double(기본.8)
 *byte(1) : -128 ~ 127
 */
public class Ex05_p63 {
 
	public static void main(String[] args) {
		char c22 = '!'; //33
		//int 타입으로자동변환되어연산수행
		int result22= c22 + c22;  
		//char
		//int
		//33 + 33 //66
		System.out.println("int result22="+result22);//66
		System.out.println((char)result22);//B
		//-------------------------
		int c11 = 'a';
		System.out.println("int c11="+c11);//97
		int result21 = c11 * 2; //97*2
		System.out.println("int result21="+result21);//194 
		//-------------------------
		byte a11 = 50;
		short b11 = 5;
		int result11 = a11 - b11; 
		//a11 - b11
		//a11
		//byte->int
		//int
		
		//      b11
		//		short->int
		//		int
		
		//int - int
		System.out.println("result11 = "+result11);//45
		
		//---------------------------------------
		byte a1 = 50;
		byte b1 = 5;	
		//byte result1 = a1 + b1;  //에러발생
		//에러메세지 : Type mismatch: cannot convert from int to byte
		// a1 + b1 
		//byte  byte
		//int   int 
		//    +
		//int + int
		// a1 + b1 결과를 byte result1에 할당
		//원인: a1 + b1 결과는 int인데 byte타입인 result1에 할당하려니 문제 발생
		//해결방법 : type을 변환하자
		long result1 = a1 + b1;  // long = int
		System.out.println("result1 = "+result1);//55
		int result2 = a1 + b1;  //문제없다
		System.out.println("result2 = "+result2);//55
		byte result3 = (byte)(a1+b1);
		System.out.println("result3 = "+result3);//55
		
		
		//------------------------------------
//		int a = 50;
//		int b = 5;
//		int result = a + b;  //int+int
//		System.out.println("result = "+result);//55
	}

}







