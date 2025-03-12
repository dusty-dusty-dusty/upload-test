package ch10;

//  - ‘class’대신 ‘interface’를 사용한다는 것 외에는 클래스 작성과 동일하다

/*[접근제한자] [제한자] class 클래스명 {

//field-데이터=>명사
//[접근제한자] [제한자] 타입 변수명[=초기값]

//constructor(생성자)
//[접근제한자] 클래스명(매개변수리스트){}

//method-기능,동작=>동사
//[접근제한자] [제한자] 리턴타입 메서드명(매개변수리스트){}

}*/

/*주제 : 학사관리 프로그램
 *사용자 : 학생(Student),교수(Professor),직원(Staff)
 *요구사항
	-직원(Staff)
	 직원은 학생을 등록할 수 있어야 한다.
	 직원은 과목을 할당할 수 있어야 한다.
	-학생(Student)
	 학생은 학생을 등록할 수 있어야 한다.
	-교수(Professor)
	 교수는 성적처리를 할 수 있어야 한다.
	(교수는 학생을 등록할 수 있어야 한다.)
	(교수는 과목을 할당할 수 있어야 한다.)
 * */
public interface AcademicManagement {
	//field-상수
	//[public static final] 타입 상수[=초기값]

	//주의.constructor(생성자)가 없다!!!

	//method
	//[public abstract] 리턴타입 메서드명(매개변수리스트); -추상메서드
	//학생을 등록
	//parameter : String stuName-학생명
	public abstract void enrollStudent(String stuName);
	
	//교수에게 과목을 할당
	/*parameter : String stuName-학생명
	              String courseName-과목명*/
	void assignCourse(String profName, String courseName);
	
	//성적처리
	/*parameter : String stuName-학생명
    			  String courseName-과목명
    			  int grade-학년*/
	void issueGrade(String stuName, String courseName, int grade);
	
	//default메서드(인터페이스에 추가된 일반 메서드(인터페이스 원칙 위반)-환영메세지
	default void showMsg() {
		System.out.println("wellcome! ^-^");
	}
}




