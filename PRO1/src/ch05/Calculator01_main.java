package ch05;

//이 클래스는 Calculator01클래스의 실행클래스이다
public class Calculator01_main {
	public static void main(String[] args) {
		//클래스의 객체생성하여 참조변수에 주소를 할당
		Calculator01 cal = new  Calculator01();
		//할당된 주소를 가진 참조변수를 통해 sum()호출
		int result = 0; //결과를 저장하기 위한 변수선언
		
		result = cal.sum(99, 101);
		System.out.println("sum()호출 결과="+result);
		
		result = cal.minus(9999, 9);
		System.out.println("minus()호출 결과="+result);
		
		result = cal.divide(10,0);
		System.out.println("divide()호출 결과="+result);//5

		
		double result2 = 0.0;
		result2 = cal.divide(5.0, 2.0);
		System.out.println("divide()호출 결과="+result2);//2.5
		
		long result3=cal.divide(9,3);
		System.out.println("divide()호출 결과="+result3);//3
		

	}
	
}









