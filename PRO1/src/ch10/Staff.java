package ch10;

//하나의 클래스는 단일상속, 다중인터페이스의 구현체가 될 수 있다

//이 클래스는 AcademicManagement인터페이스의 구현클래스이다
//class 클래스명 [extends 상위클래스명]  [implements 인터페이스명N]
public class Staff implements AcademicManagement{
	

	//학생을 등록
	//parameter : String stuName-학생명
	@Override
	public void enrollStudent(String stuName) {
		System.out.println("Staff-enrollStudent(String stuName)="+stuName);
	}

	//교수에게 과목을 할당
	/*parameter : String stuName-학생명
	              String courseName-과목명*/
	@Override
	public void assignCourse(String profName, String courseName) {
		System.out.printf("rStaff-assignCourse %s교수님에게 %s과목을 할당\n\n",profName,courseName);
	}

	//성적처리
	/*parameter : String stuName-학생명
    			  String courseName-과목명
    			  int grade-학년*/
	@Override
	public void issueGrade(String stuName, String courseName, int grade) {
		System.out.printf("Staff-issueGrade %s과목의 %s(%d)학생의 성적을 처리\n\n",courseName,stuName,grade);		
	}

}
