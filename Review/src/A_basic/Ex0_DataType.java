package A_basic;

public class Ex0_DataType {
	public static void main(String[]args) {
		
		/*
		 	데이타 변수명 = 값;
		 */
		
		int intVal = 100;
		
		//int intVal2 = 1.2; <= 에러 발생
		
		//[1] 해결 : 자료형과 값의 타입을 맞추기
		double intVal2 = 1.2;
		
		//[2] 해결 : 캐스팅(강제형변환)
		int intVal3 = (int)1.2;
		
		char ch = 'A';
		//ch++; // 
		ch=(char)(ch+1);
		System.out.println("ch="+ch);
		
		/*
		 	i++;
		 	
		 	i= i+1;
		 */
		
	}
}
