package ch02;

/*자료형
 *-논리형 : boolean
 *-char : char
 *-정수 : byte(1)<short(2)<int(기본.4)<long(8)
 *-실수 : float(4)<double(기본.8)
 *
 *byte(1) : -128 ~ 127
 *
 *변수선언문법> 데이터타입 변수명;
 *값할당       변수명=값;
 *
 *변수선언 및 초기화 데이터타입 변수명=초기값;
 *               데이터타입 변수명[=초기값];
 */
public class Ex04_p49 {

	public static void main(String[] args) {
		// byte타입의 변수b에 초기값0을 할당
		byte b = 0;
		System.out.println("b="+b);
		b = -128;
		System.out.println("b="+b);
		b = 127;
		System.out.println("b="+b);
		//b = 128;
		//에러.Type mismatch: cannot convert from int to byte
		//byte로 선언된 변수b에 할당할 수 있는 값의 범위는 -128 ~ 127
		//따라서 128은 정수. 정수의 기본타입은 int
		//int로 취급되는 128을 변수b에 넣을 수 없기에 에러발생
		
		//강제형변환문법  타입 변수명=(강제변환할타입)변수;
		//(int)b; //강제형변환. byte타입b가 int타입으로 강제 형변환
		int n=(int)b; //강제형변환.
		System.out.println("n="+n);
		int n2=b; //자동형변환
		System.out.println("n2="+n2); //127
		int n3=b+1; //자동형변환(연산식에서 자동 타입변환)
		     //127+1  
		     //128
		  //n3=128
		System.out.println("n3="+n3); //128
		
		//-----------------------------------------------------
		//자동형변환 : 작은타입이 큰타입으로 변환되는 경우
		//정수: byte(1)<short(2)<int(기본.4)<long(8)
		//실수: float(4)<double(기본.8)
		short n20=b; //자동형변환  byte(1)->short(2)
		System.out.println("n20=b결과:"+n20);  //127
		long n21=b;  //자동형변환  byte->long(8)
		System.out.println("n21결과:"+n21); //127
		float n22=b; //자동형변환  byte->float(4)
		System.out.println("n22결과:"+n22); //127.0
		double n23=b;//자동형변환  byte->double(8)
		System.out.println("n23결과:"+n23); //127.0
		
		//-----------------------------------------------------
		//강제형변환 : 큰타입이 작은타입으로 강제적으로 변환=>값의 손실을 주의
		//n20=n21; //<long(8)->short(2)
		//Type mismatch: cannot convert from long to short
		
		//강제형변환문법  타입 변수명=(강제변환할타입)변수;
		n20=(short)n21; //<long(8)->short(2)  정수간의 강제타입변환
		System.out.println("n20="+n20); //127
		n22=(float)n23; //double(8)->float(4) 실수간의 강제타입변환 
		System.out.println("n22="+n22); //127.0
		
		double v1 = 3.14;
		//int  v2 = v1;  
		//불가?왜?Type mismatch: cannot convert from double to int
		//해결방법은?강제형변환
		//해결코드는?타입 변수명=(강제변환할타입)변수;    
		int v2=(int)v1;  
		System.out.println("v2="+v2); //v2결과는?3
		
		//-----------------------------------------------------
		// float타입 : f, F
		// double타입 : d, D
		// long타입: l, L
		double a = 3.141592;  //자바의 실수기본형은 double
		double b1 = 3.141592d;//리터럴형변환
		double b2 = 3.141592D;//리터럴형변환
		
		//float c1 = 1.0;//자바의 실수기본형은 double인데 float타입으로 저장하려니 x
		float c1 = 1.0F; //리터럴형변환
		float c2 = (float)1.0; //강제형변환
		
		int i = 100;//자바의 정수기본형은 int
		long j1 = 100; //왜? 자동형변환 int(4)->long(8)
		long j2 = 100l; //리터럴형변환
		long j3 = 100L; //리터럴형변환
		

	}

}



