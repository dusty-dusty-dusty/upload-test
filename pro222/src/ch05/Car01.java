package ch05;

import java.util.Date;

//이 클래스는 자동차관련 데이터와 기능을 제공하는 클래스이다
/*[접근제한자] [제한자] class 클래스명 {

	//field-데이터=>명사
	//[접근제한자] [제한자] 타입 변수명[=초기값]
	
	//constructor(생성자)
	//[접근제한자] [제한자] 클래스명(매개변수리스트){}
	
	//method-기능,동작=>동사
	//[접근제한자] [제한자] 리턴타입 메서드명(매개변수리스트){}

}*/
public class Car01 {
   
	//field-데이터=>명사
	//[접근제한자] [제한자] 타입 변수명[=초기값]
	String company="현대"; //제조사;  
	String kind="세단"; //종류
	Date manufacturingDate=new Date();//연식(제조일자)
	int weight=1000; //무게     
	int cylinder=1000; //배기량
	int maxSpeed=300;//최대속도
	int speed=0; //속도
	char grade ='A';//등급
	double fuelEfficiency=10.5; //연비
	boolean submerged=false; //침수여부
	
	Engine01 engine=null;    //엔진	
	Tire01 tire=null;
	
	//constructor(생성자)
	//[접근제한자] [제한자] 클래스명(매개변수리스트){}
	
	//method-기능,동작=>동사
	//[접근제한자] [제한자] 리턴타입 메서드명(매개변수리스트){}
	//public static void main(String[] args){}
	//달리다   
	void drive(){
		System.out.println("drive()호출성공");
	}
	//멈추다
	void stop(){
		System.out.println("stop()호출성공");
	}
	
	//정보제공
	void showInfo(){
		System.out.println("company="+company+", 연식(제조일자)="+manufacturingDate+", grade="+grade);
	}
	
	@Override
	public String toString() {
		return "Car01 [company=" + company + ", kind=" + kind + ", manufacturingDate=" + manufacturingDate + ", weight="
				+ weight + ", cylinder=" + cylinder + ", maxSpeed=" + maxSpeed + ", speed=" + speed + ", grade=" + grade
				+ ", fuelEfficiency=" + fuelEfficiency + ", submerged=" + submerged + ", engine=" + engine + ", tire="
				+ tire + "]";
	}

	
}


/* Object클래스의 toString()
- 객체의 정보를 문자열(String)로 제공할 목적으로 정의된 메서드
public String toString() {
	return getClass().getName() + "@" + Integer.toHexString(hashCode());
	      //클래스명 + "@" + 16진수형태문자열 =>문자열
}

*Object클래스의 getClass()
- 자신이 속한 클래스의 Class객체를 반환하는 메서드
- Class객체는 클래스의 모든 정보를 담고 있으며, 클래스당 단 1개만 존재
- 클래스파일(*.class)이 메모리에 로드될때 생성된다

*Object클래스의 hashCode()
- 객체의 해시코드(int타입의 정수)를 반환하는 메서드(해시함수)
  다량의 데이터를 저장&검색하는 해싱기법에 사용된다.
- Object클래스의 hashCode()는 객체의 내부주소를 반환한다	

*객체의 해시코드 : 객체의 고유한 정수형태의 주소
*/

