package ch05;

/*[접근제한자] [제한자] class 클래스명 {

//field-데이터=>명사
//[접근제한자] [제한자] 타입 변수명[=초기값]

//constructor(생성자)
//[접근제한자] [제한자] 클래스명(매개변수리스트){}

//method-기능,동작=>동사
//[접근제한자] [제한자] 리턴타입 메서드명(매개변수리스트){}

}*/

/*생성자에서 다른 생성자 호출하기 – this()
- this() – 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용
- 주의! 다른 생성자 호출은 생성자의 첫 문장에서만 가능!!

*생성자 주 용도 : 필드의 값을 초기화
*/
public class Person03 extends Object{
	//field
	//[접근제한자] [제한자] 타입 필드명[=초기값];
	private String fullName; //성명
	private double height;	//키
	private int age;		//나이
	private boolean isForeigner;
	private String nation="대한민국";
	
	//constructor(생성자)
	//[접근제한자] [제한자] 클래스명(매개변수리스트){}
	//기본생성자(default constructor)-매개변수가 없는 생성자
	//매개변수가 있는 생성자가 존재하면 기본생성자는 (자동)추가되지 않는다
	Person03(){
		System.out.println("매개변수가 없는 기본생성자-Person01()");
	}
	
	//생성자 오버로딩(overloading)
	public Person03(String fullName){
		this(fullName, 190.6);
		//Person03(fullName, 190.6);   //생성자명을 그대로 사용하여 호출x=>this()
		//The method Person03(String, double) is undefined for the type Person03
		//this(fullName, 190.6); //생성자 내부의 첫 번째 줄에서 호출
		//Constructor call must be the first statement in a constructor
	
	}
	
	public Person03(String fullName, double height){
		this(fullName, height, 36);
	}
	
	public Person03(String fullName, double height,int age){
		this(fullName, height, age, false, "대한민국");
     
	}
	public Person03(String fullName, double height,int age,boolean isForeigner, String nation){
		this.fullName = fullName;
		this.height = height;    
		this.age = age;          
		this.isForeigner=isForeigner;
		this.nation=nation;
	}

	//method
	//오버라이딩
	// Object클래스의 toString() - 객체의 정보를 문자열(String)로 제공할 목적으로 정의된 메서드
	@Override
	public String toString() {
		return "Person03 [fullName=" + fullName + ", height=" + height + ", age=" + age + ", isForeigner=" + isForeigner
				+ ", nation=" + nation + "]";
	}
	
	
}





