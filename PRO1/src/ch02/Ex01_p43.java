package ch02;

//변수(p43)
/*변수란(variable)? 메모리 공간에 부여진 이름 , 변하는 값
 * 변수선언 문법>타입 변수명 = 값;
 */
public class Ex01_p43 {

	public static void main(String[] args) {
		boolean v = true; //boolean타입의 변수v선언 및 true값 초기화
		System.out.println(v);//boolean   논리형
		//boolean v = false;//에러발생.
		//에러발생원인 duplicate local variable v
		//변수명 v가 중복
		//해결방법 : 중복되지 않은 변수명 선언
		boolean v2 = false;
		System.out.println(v2);
		
		System.out.println(false);//boolean  
		System.out.println('a');//character= 1글자 ''로 감싸야함
		System.out.println("a");//같은 1글자라도 이건 스트링이다.
		System.out.println(3.14);//숫자 - 실수 (float long)
		System.out.println(100);//숫자 - 정수 (byte short int long)
		
		System.out.println("-------------------");
		System.out.println("김주현"); //문자열. (String. 1글자 이상의 문자)
		System.out.println("님, 환영");
		System.out.print("현빈");
		System.out.println("님, 환영");
		
		char v3 = 'a';
		System.out.println(v3);
		
		String v4 = "a";
		System.out.println(v4);
		
		double v5 = 3.14;
		System.out.println(v5);
		
		int v6 = 1000;
		System.out.println(v6);
				
		String v7 = "현빈";
		System.out.print(v7);
		System.out.println ("님, 환영");
		
		String v8 = "현빈";
		System.out.println(v8+"님, 환영");
		
		String v11 = "잘생긴";
		System.out.println(v11+v7+v8+"하이요"+v6);
		
		
		System.out.println("-------------------");
		System.out.println("김주현"); //문자열. (String. 1글자 이상의 문자)
		System.out.println("님, 환영");
		System.out.println("-------------------");
		String name = "김주현";
		System.out.println(name);
		System.out.println("님,환영!");
		name = "강주현";
		System.out.println("피곤한 "+name);
		name = "아구찜";
		System.out.println("맛있는 "+name);
	}

}
