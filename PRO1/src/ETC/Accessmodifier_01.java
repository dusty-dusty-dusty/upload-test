package ETC;
/*접근 제어자
 -중요한 필드와 메소드가 외부로 노출되지 않도록 해 객체의 무결성을 유지하기 위해서 접근 제한자 사용
-멤버 또는 클래스에 사용되어, 외부로부터의 접근을 제한한다

*접근제어자를 사용 이유(접근 제어자를 이용한 캡슐화)
- 외부로 부터 데이터를 보호하기 위함
- 외부에는 불필요한 내부적으로만 사용되는 부분을 감춰서 복잡성을 줄이기 위함

*종류
-public : 접근제한이 없다
-protected : 같은 패키지, 그리고 다른 패키지의 자손클래스에서 접근 가능
-생략 : 같은 패키지 내에서만 접근 가능
-private : 오직 동일클래스내에서만 사용

 */


public class Accessmodifier_01 {
	
	//field
	//[접근제어자] [제어자]타입 필드명[=초기값]
	public 		int pub		= 100;
	protected  	int pro 	= 200;
				int pack 	= 300;
	private 	int pri 	= 400;
	
	
	//constructor
	
	//method
	//[접근제어자] [제어자] 메서드명(매개변수리스트){}
	void test() {
		pub = 110;
		pro = 220;
		pack= 330;
		pri = 440;
	}
}
