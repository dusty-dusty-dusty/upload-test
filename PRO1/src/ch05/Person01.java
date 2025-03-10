package ch05;

public class Person01 {
	//field
	//[접근제한자] [제한자]타입 필드[=초기값];
	private String fullName; //성명
	private double height; //키
	private int age; //나이
	
	//constructor [셍성자]
	//[접근제한자] [제한자] 클래스명(매개변수리스트){}
	//기본 생성자(default constructor)매개뱐수가 없는 생성자
	public Person01(){
		System.out.println("매개변수가 없는 생성자-Person01()호출");
	}
	
	
	//생성자 오버로딩
	public Person01(String f){
		System.out.println("매개변수 String 생성자-String f="+f);
	}
	
}
	
	//method
