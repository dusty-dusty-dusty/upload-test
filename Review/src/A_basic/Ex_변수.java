package A_basic;

public class Ex_변수 {

	public static void main(String[] args) {

		long startTime = 0L;
		long elapsedTime = 0L;

		//1. String으로 문자열 만들기의 속도 측정
		String str1 = ""; 
		startTime = System.currentTimeMillis(); 
		for(int i=0; i<50000; i++){
			str1 += "H"; 
		}
		elapsedTime = System.currentTimeMillis() - startTime;
		System.out.println("String 문자열만들기:" + elapsedTime);

		//2. StringBuffer로 문자열 만들기의 속도 측정
		StringBuffer sb = new StringBuffer(); 
		startTime = System.currentTimeMillis(); 
		for(int i=0; i<50000; i++){
			sb.append("H"); 
		}
		elapsedTime = System.currentTimeMillis() - startTime; 
		System.out.println("StringBuffer 문자열만들기:" + elapsedTime);
	}

}

/*
 	변수: 메모리 상의 공간
 		ㄴ 그니까 그래서 그걸 왜함?
 			ㄴ 값을 한개 저장 하기 위해서 하는 것ㅇㅇ;;
 			
 	데이타 타입(자료형)
 		[1] 기본형
 			- 논리형 : boolean
 			- 문자형 : char (9Byte)
 			- 정수형 : int(4Byte) / long (8Byte)
 			- 실수형 : double (8Byte)
 			
 		[2] 참조형
 			- 클래스 / 배열
 			- new로 객체 생성
 			
 			[*] String < 따로 취급 하는게 좋다.
 			[#] 문자열 : String / StringBuffer / StringBuilder 
 			(버퍼랑 필더랑은 비슷함. 하지만 스트링과는 다름. 매번 변수 변경 시에 버퍼나 빌더 사용함)
 			
 */
