package ch11_api;

/*String
-Java의 초기 버전부터 존재.
-불변(Immutable) 객체로, 한 번 생성된 String 객체는 변경할 수 없다. 
-문자열을 수정할 때마다 새로운 String 객체가 생성.

*StringBuffer
- Java 1.0에서 도입.
- 가변(Mutable) 객체로, 문자열을 수정할 수 있다. 
- 버퍼가 작으면 성능 저하 - 작업 중에 더 큰 배열의 생성이 필요
- 스레드 안전(Thread-safe)하여 멀티스레드 환경에서 안전하게 사용할 수 있지만, 
  성능은 StringBuilder보다 느릴 수 있다.

*StringBuilder
- Java 5에서 도입.
- 가변(Mutable) 객체로, 문자열을 수정할 수 있다. 
   성능이 뛰어나며, 문자열을 자주 변경해야 할 때 유용하지만, 
   스레드 안전하지 않으므로 멀티스레드 환경에서는 주의가 필요 */
public class String_StringBuffer_StringBuider_p380 {

	public static void main(String[] args) {
		//StringBuffer를 String으로 변환
		StringBuffer stringBuffer = new StringBuffer("Hello, World!"); //StringBuffer객체생성
		String str = stringBuffer.toString(); 
		System.out.println("stringBuffer="+stringBuffer);  //Hello, World!
		System.out.println("str="+str);                    //Hello, World!
		
		
		//String->StringBuffer로 변환
		String str2 = "하하하";   //String객체생성
		StringBuffer stringBuffer2 = new StringBuffer(str2);
		System.out.println("str2="+str2); 					//하하하
		System.out.println("stringBuffer2="+stringBuffer2); //하하하
		
	}

}







