package ch05;

//학생관련
public class Student01 {
	
	private String fullname;//이름김주현 
	private String sNo;//학번215090 
	private char gender;//성'M' 
	private double height;//키
	private int age;//나이
	private boolean isForeigner;//내외국인여부 외국인이면 true 내국인이면false
	
	
	//constructor 성성자
	//[접근제한자] [제한자] 클래스명 (매개변수리스트){}
	public void setfullname(String n) {
		fullname=n;
	}	
	String getfullname() {
		return fullname;		
	}
	
	public void setsNo(String a) {
		sNo=a;
	}
	String getsNo() {
		return sNo;		
	}
	
	public void setgender(char m) {
		gender=m;
	}
	char getgender() {
		return gender;		
	}
	
	
	
	public void setheight(double h) {
		height=h;
	}
	double getheight() {
		return height;
	}
	
	public int setage(int c) {
		return age;
	}
	int getage() {
		return age;
	}
	
	public boolean setisForeigner(boolean b) {
		return isForeigner;
	}
	boolean getisForeigner() {
		return isForeigner;
	}

}