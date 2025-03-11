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
*/
public class Person02 extends Object{
	//field
	//[접근제한자] [제한자] 타입 필드명[=초기값];
	private String fullName; //성명
	private double height;	//키
	private int age;		//나이
	
	//constructor(생성자)
	//[접근제한자] [제한자] 클래스명(매개변수리스트){}
	//기본생성자(default constructor)-매개변수가 없는 생성자
	//매개변수가 있는 생성자가 존재하면 기본생성자는 (자동)추가되지 않는다
	Person02(){
		System.out.println("매개변수가 없는 기본생성자-Person01()");
	}
	
	//생성자 오버로딩(overloading)
	public Person02(String fullName){
		//System.out.println("String 1개인 생성자-Person02(String)");
		//매개변수fullName에 저장된 값을 필드fullName에 설정
		this.fullName = fullName;
	}
	
	public Person02(String fullName, double height){
		//System.out.println("String,double 2개인 생성자-Person02(String, double)");
		this.fullName = fullName;//매개변수fullName에 저장된 값을 필드fullName에 설정
		this.height = height;    //매개변수height에 저장된 값을 필드height에 설정
	}
	
	public Person02(String fullName, double height,int age){
		//System.out.println("String,double,int 3개인 생성자-Person02(String, double,int)");
		this.fullName = fullName;//매개변수fullName에 저장된 값을 필드fullName에 설정
		this.height = height;    //매개변수height에 저장된 값을 필드height에 설정
		this.age = age;          //매개변수age에 저장된 값을 필드age에 설정
	}
	
	public Person02(double height){
		//System.out.println("double 1개인 생성자-Person02(double)");
		//매개변수height에 저장된 값을 필드height에 설정
		this.height = height;
	}
	
	public Person02(int age){
		//System.out.println("int 1개인 생성자-Person02(int)");
		//매개변수age에 저장된 값을 필드age에 설정
		this.age = age;
	}

	//method
	//오버라이딩
	// Object클래스의 toString() - 객체의 정보를 문자열(String)로 제공할 목적으로 정의된 메서드
	@Override
	public String toString() {
		return "Person02 [fullName=" + this.fullName + 
					   ", height=" + this.height + 
					   ", age=" + this.age + "]";
	}
	
	
}





