package ch13_ch14_ch15;

interface PrintString{	
	void showString(String str);
}


public class Ex02 {

	public static void main(String[] args) {
		//람다 표현식을 사용하여 PrintString 인터페이스의 showString 메서드를 구현
		PrintString lambdaStr = s->System.out.println(s);
		lambdaStr.showString("hello lambda_1");
		
		showMyString(lambdaStr);
	}//main
	
	public static void showMyString(PrintString p) {
		p.showString("hello lambda_2");
	}
	
	public static PrintString returnString() {
		//람다 표현식을 사용하여 PrintString 인터페이스의 showString 메서드를 구현
		//매개변수 s를 받아서 "world" 문자열과 결합하여 출력
		return s->System.out.println(s + "world");
	}
}


/*람다 표현식을 사용하여 PrintString 인터페이스의 showString 메서드를 구현를 하지않는 다면...
PrintString lambdaStr = s->System.out.println(s);
lambdaStr.showString("hello lambda_1");

interface PrintString {	
// showString 메서드 선언: String 타입의 매개변수를 받아서 반환값이 없는 메서드
void showString(String str);
}

public class Ex02 { // Ex02 클래스 정의

public static void main(String[] args) { // main 메서드 시작
	// 람다 표현식을 사용하여 PrintString 인터페이스의 showString 메서드를 구현
	PrintString lambdaStr = s -> System.out.println(s);
	// lambdaStr 객체를 사용하여 "hello lambda_1" 문자열을 출력
	lambdaStr.showString("hello lambda_1");
	
	// showMyString 메서드를 호출하고 lambdaStr을 인자로 전달
	showMyString(lambdaStr);
	
	
} // main 메서드 끝

// PrintString 타입의 매개변수를 받아서 문자열을 출력하는 메서드
public static void showMyString(PrintString p) {
	// p 객체의 showString 메서드를 호출하여 "hello lambda_2" 문자열을 출력
	p.showString("hello lambda_2");
}

// PrintString 타입의 객체를 반환하는 메서드
public static PrintString returnString() {         
	// 람다 표현식을 사용하여 PrintString 인터페이스의 showString 메서드를 구현
	// 매개변수 s를 받아서 "world" 문자열과 결합하여 출력
	return s -> System.out.println(s + " world");
}
}
*/