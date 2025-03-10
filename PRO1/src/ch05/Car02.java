package ch05;
//이 클래스는 자동차관련 클래스이다.
/*method유형 4가지
1.매개변수없고 리턴값없는 메서드
문법> void 메서드명(){
}

2.매개변수있고 리턴값없는 메서드
문법> void 메서드명(매개변수리스트){
}

3.매개변수없고 리턴값있는 메서드
문법> 리턴타입 메서드명(){
		return 표현식;
}

4. 매개변수있고 리턴값있는 메서드
문법> 리턴타입 메서드명(매개변수리스트){
		return 표현식;
}
 */
public class Car02 {
	
	//field-데이터=>명사
	//[접근제한자] [제한자] 타입 변수명[=초기값]
	private String company="현대"; //제조사; 
	int maxSpeed=300;//최대속도
	char grade ='A';//등급
	
	//constructor(생성자)
	//[접근제한자] [제한자] 클래스명(매개변수리스트){}
	
	//method-기능,동작=>동사
	//[접근제한자] [제한자] 리턴타입 메서드명(매개변수리스트){}
	//1. 매개변수 없고 리턴값 없는 메소드
	void m1(){
		System.out.println("m1()진입 company="+company);
	}
	
	//2.매개변수있고 리턴값없는 메서드
	void m2(String name){ //name="홍길동"
		System.out.println("m2(String name) name="+name );
	}
	
	//3.매개변수없고 리턴값있는 메서드
	int m3() {
		char n = 'A';//A는 10진수는 65
		return n+1; 	
	}
	
	//4. 매개변수있고 리턴값있는 메서드
	String m4(String s1, String s2){
		String food="";
		//String간의 일치(동일)비교
		//기준문자열.equals(비교문자열)=>일치하면 true, 불일치하면false.영문소문자모두 일치해야함
		//s1.equals("계란")=>매개변수s1에 저장된 문자열이 "계란"과 일치하면 false
		if(s1.equals("계란") && s2.equals("밀가루")){//매개변수s1이 "계란"이면서 그리고 매개변수s2에 저장된 문자열이 "밀가루"이니?
			food="계란빵";
		}else {
			food=s1+s2;
		}
		return food;
	}
	
	//int매개변수 a int매개변수 b를 가진 sum()메서드선언
	//매개변수 a와 b의 값을 더한 결과를 리턴
	
	
	
	
}


