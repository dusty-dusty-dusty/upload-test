package ch02;

/*자료형
 * -논리형 : boolean 
 * -char : char
 * -정수 : byte(1)< short(2) < int(기본 4) < long(8)
 * -실수 : float(4) < double(기본 8)
 * 
 * byte(1) : -128 ~ 127
 * 
 * 변수선언문법 > 데이터타입 변수명;
 * 값할당 변수명 = 값;
 * 
 * 변수선언 및 초기화 데이터 타입 변수명 = 초기값;
 * 				데이터 타입 변수명 [= 초기값];
 */
public class Ex04_48 {

	public static void main(String[] args) {
		// byte 타입의 변수 b에 초기값 0을 할당
		byte b = 0;
		System.out.println("b="+b);
		b = -128;
		System.out.println("b="+b);
		b = 127;
		System.out.println("b="+b);
		//b = 128;
		//Type mismatch: cannot convert from int to byte
		//byte로 선언된 변수b에 할당할 수 있는 값의 범위는 -128 ~ 127
		//따라서 128은 정수. 정수의 기본타입은` int
		//int로 취급되는 128을 변수b에 넣을 수 없기에 에러발생
		//해결방법 =>(128을 꼬옥 할당해야한다면) 강제형변환
		//강제형 변환 문법 변수명=(강제로변환할 타입 작성)값;
		//(int)b; //강제형변환. byte타입b가 int타입으로 강제 형변환
		int n=(int)b; // 강제형변환.
		System.out.println("n="+n);
		
		int n2=b;
		System.out.println("n2="+n2);
		
		int n3=b+1;
		System.out.println("n3="+n3);
		
		//자동형변환 : 작은타입이 큰타입으로 변환되는 경우
		//정수: byte(1)<short(2)<int(기본.4)<long(8)
		//실수: float(4)<double(기본.8)
		short n20=b; //자동형변환 byte(1)->short(2)
		System.out.println("n20=b결과:"+n20); //
		long n21=b; //자동형변환 byte->long(8)
		System.out.println("n21결과:"+n21); //
		float n22=b; //자동형변환 byte->float(4)
		System.out.println("n22결과:"+n22); //
		double n23=b;//자동형변환 byte->double(8)
		System.out.println("n23결과:"+n23); //
		
		//----------------------------------------------------------------------------
		//강제형변환문법 타입 변수명=(강제변환할타입)변수;
		n20=(short)n21; //<long(8)->short(2)
		System.out.println("n20="+n20); //127
		n22=(float)n23; //double(8)->float(4)
		System.out.println("n22="+n22); //127.0
		
		double v1 = 3.14;
		//int v2 = v1;
		//불가능 함 왜냐하면 int는 정수인데 3.14는 실수임
		//소수점 뒤에 자리를 날리는 코드 or 3.14를 정수로 만들어야함
		//강제형변환을 해야함 변수명=(강제변환할타입)변수;
		int v2=(int)v1; //int는 정수라서 소수점을 버릴수 있음
		System.out.println("v2="+v2);
		
		//----------------------------------------------------------------------------
		// float 타입 : f, f
		// double 타입 : d, D
		// long 타입 : l, L
		double a = 3.141592; // 자바의 실수 기본형은 double
		double b1 = 3.141592d; //리터럴형변환
		double b2 = 3.141592; //리터럴형변환
		
		//float c1 = 1.0;//자바의 실수기본형은 double인데 float타입으로 저장하려니 x
		float c1 = 1.0f; //리터럴형변환
		float c2 = (float)1.0; //강제형변환
		
		int i = 100; //자바의 정수기본형은 int
		long ji = 100; //왜? 자동형 변환 int4 > long8
		long j2 = 100l; // 리터럴
		long j3 = 100L; // 리터럴형변환
		
	}

}
