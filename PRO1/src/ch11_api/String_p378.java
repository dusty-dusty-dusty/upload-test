package ch11_api;

/*java.lang.String클래스(p378)
- String클래스의 메서드는 반드시 연습해두자!
- String인스턴스의 내용은 바꿀 수 없다.(immutable)
*/

// 참조변수1==참조변수2 =>주소비교=>참조변수에 저장된 주소가 일치하면 true/불일치시 false반환
// "기준문자열".equals("비교문자열") =>값비교    => 값이 일치하면 true/불일치시 false반환
public class String_p378 {

	//String str = “abc”;와 String str = new String(“abc”);의 비교
	public static void main(String[] args) {
		//String클래스의 객체를 생성
		//참조변수str1에는 주소저장   패키지명.class명@16진수hash
		//						 java.lang.String@16진수hash 
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println("str1="+str1); //abc
		System.out.println("str2="+str2); //abc
		System.out.println("str1.toString()="+str1.toString()); //abc
		System.out.println("str2.toString()="+str2.toString()); //abc
		
		System.out.println("str1==str2의 결과: "+ (str1==str2)); //false
		System.out.println("str1.equals(str2)의 결과: "+ (str1.equals(str2))); //true
		
		//--------------------------------
		System.out.println("\n-----------------------------------");
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println("str3="+str3); //abc
		System.out.println("str4="+str4); //abc
		
		System.out.println("str3==str4의 결과: "+ (str3==str4)); //true
		System.out.println("str3.equals(str4)의 결과: "+ (str3.equals(str4))); //true
	}

}






