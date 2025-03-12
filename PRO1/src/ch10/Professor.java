package ch10;

public class Professor implements AcademicManagement {

	@Override
	public void enrollStudent(String stuName) {
		System.out.println("Professor-enrollStudent(String stuName)="+stuName);
	}

	@Override
	public void assignCourse(String profName, String courseName) {
		System.out.printf("Professor-assignCourse %s교수님에게 %s과목을 할당\n\n",profName,courseName);
	}

	@Override
	public void issueGrade(String stuName, String courseName, int grade) {
		System.out.printf("Professor-issueGrade %s과목의 %s(%d)학생의 성적을 처리\n\n",courseName,stuName,grade);		
	}

}
