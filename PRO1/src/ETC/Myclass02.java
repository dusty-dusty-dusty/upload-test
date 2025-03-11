package ETC;

/*상속
 * 부모클래스=super클래스=상위클래스
 * 자식클래스=sub클래스=하위클래스
 */

//이 클래스는 AccessModifier클래스의 자식클래스이다
//[접근제한자] [제어자] class 클래스명 [extends 상위클래스명]
public class Myclass02 extends Accessmodifier_01{
	
	//필드
	//생성자
	//메서드
	void test(){
		//AccessModifier클래스의 객체생성
		Accessmodifier_01 am = new Accessmodifier_01();
		
		am.pub = 110;
		am.pro = 220;
		am.pack= 330;
		//am.pri = 440; //은닉되었기에 not visible
		//The field AccessModifier.pri is not visible
	}
	
	void test2(){	
		pub = 110;
		pro = 220;
		pack= 330;
		//pri = 440; //은닉되었기에 not visible
		//The field AccessModifier.pri is not visible
	}
}
