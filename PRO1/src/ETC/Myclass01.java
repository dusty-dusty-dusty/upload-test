package ETC;

public class Myclass01 {
	
	void test() {
		Accessmodifier_01 am = new Accessmodifier_01();
		
		am.pub = 110;
		am.pro = 220;
		am.pack= 330;
		//am.pri = 440; //private여서 오류나는거 은닉된 상태임
	}
	
	void test2() {
		Accessmodifier_01 am = new Accessmodifier_01();
		
		//pub = 110;
		//pro = 220;
		//pack= 330;
		//am.pri = 440; //private여서 오류나는거 은닉된 상태임
	}
}
