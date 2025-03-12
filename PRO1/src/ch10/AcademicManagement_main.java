package ch10;

public class AcademicManagement_main {

	public static void main(String[] args) {
		//클래스의 객체 생성
		AcademicManagement_main a= new AcademicManagement_main ();
		Staff staff = new Staff();
		System.out.println("staff="+staff);
		
		staff.enrollStudent("세종대왕");
		
		staff.assignCourse("김주현", "디자인");
		
		staff.issueGrade("김주현", "디자인", 2);
	}

}
