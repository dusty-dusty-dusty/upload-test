package ch03;

//
//산술연산자(p72~) + - * /(나누기)  %(나머지) 
public class Ex01_p72 {

	public static void main(String[] args) {
		int a = 50;
		int b = 5;
		int result = 5 + b;  //int+int
		System.out.println("result = "+result);//55
		int result2 = a - b;
		System.out.println("result2 = "+result2);//45
		int result3 = a * b;
		System.out.println("result3 = "+result3);//250
		int result4 = a / b;
		System.out.println("result4 = "+result4);//10
		int result5 = a % b;
		System.out.println("result5 = "+result5);//0
		
	}

}
