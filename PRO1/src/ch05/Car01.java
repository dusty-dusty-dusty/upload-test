package ch05;

import java.util.Date;

public class Car01{
	
	//이 클래스는 자동차 관련 데이터와 기능을 제공하는 클래스이다
	/*[접근제한자] [제한자] class 클래스명 {}
	 * 
	 */
		//field-데이터 = >명사
		//[접근제한자] [제한자] 타입 변수명[=초기값]
		String company= "현대"; //제조사;
		String kind="세단";//종류
		Date manufacturingDate=new Date(); // 연식

		int	weight=1; //중량
		int	cylinder=1000; //배기량
		int	max_speed=300; //속도
		int speed=0;
		char grade='A';//등급
		double fuelEfficiency=10.5;		
		boolean submerged=false;
		
		Engine01 engine=null; //엔진	
		Tire01 tire=null;
		
		//constructor(생성자)
		//[접근제한자][제한자]클래스명(매개변수리스트){}	
		//method-기능,동작 ==> 동사
		//[접근제한자][제한자]리턴타입 메서드명(매개변수리스트){}
		//달리다
		void drive(){
			System.out.println("drive()호출성공");
		}
		//멈추다
		void stop(){
			System.out.println("stop()호출성공");
		}
		
		//정보제공
		void showInfo() {
			System.out.println("company="+company+", 연식(제조일자)="+manufacturingDate+", grade="+grade);
		}
		
		
//		//@ annotation => 1.공지 2.검사
//		@Override
//		public String toString() {
//			return "Car01 [company=" + company + ", kind=" + kind + ", manufacturingDate=" + manufacturingDate
//					+ ", weight=" + weight + ", cylinder=" + cylinder + ", max_speed=" + max_speed + ", speed=" + speed
//					+ ", grade=" + grade + ", fuelEfficiency=" + fuelEfficiency + ", submerged=" + submerged
//					+ ", engine=" + engine + ", tire=" + tire + "]";
//		}

}