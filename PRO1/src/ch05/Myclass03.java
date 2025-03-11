package ch05;

import ETC.Accessmodifier_01;

/*상속
 * 부모클래스 = super클래스 = 상위클래스
 * 자식클래스 = sub클래스 = 하위클래스
 */


public class Myclass03 extends Accessmodifier_01{
	
	void test() {
		Accessmodifier_01 am = new Accessmodifier_01();
		
		am.pub = 110; 
		//am.pro = 220; //자손클래스입장에서 접근한게 아니다.
		//am.pack= 330; //동일 패키지가 아니여서 접근 불가
		//am.pri = 440; //private여서 오류나는거 은닉된 상태임
	}
	
	void test2() {
		Accessmodifier_01 am = new Accessmodifier_01();
		
		pub = 110;
		pro = 220;
		//pack= 330; //동일 패키지가 아니여서 접근 불가
		//pri = 440; //private여서 오류나는거 은닉된 상태임
	}
	
}
