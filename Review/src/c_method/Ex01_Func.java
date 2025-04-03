package c_method;

public class Ex01_Func {

	public static void main(String[] args) {
		
		int data=20;
		method(data); // 메소드의 인자로 데이터 보내기
		
	}
	
	//메소드 선언시 매수변수로 받기
	static void method(int data) {
		
		//여기서 출력
		System.out.println("결과:"+data);
	}

}
