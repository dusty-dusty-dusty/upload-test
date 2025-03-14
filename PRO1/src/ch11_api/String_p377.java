package ch11_api;

//String인스턴스의 내용은 바꿀 수 없다.(immutable=>불변)
//[Java의정석]ch9_lang패키지의 11번째 슬라이드 참고
public class String_p377 {

	public static void main(String[] args) {
		String str1 = "대한";  
		String str2 = "민국";  
		String str3 = str1+str2;
		System.out.println("str1="+str1); //대한 
		System.out.println("str2="+str2); //민국 
		System.out.println("str1+str2="+str3); //대한민국
		
//			
//		회원번호가 123인 회원이름,이메일,id,주소조회
//		String q1="select 회원이름,이메일,id,주소 ";
//		String q2="from 회원 ";
//		String q3="where 회원번호=123";
//		String query = q1+q2+q3;
//		String query = "select 회원이름,이메일,id,주소 "+
//					   "from 회원 "+
//				       "where 회원번호=123";
	}

}




