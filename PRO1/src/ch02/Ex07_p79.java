package ch02;

import java.util.Scanner;

//삼항연산자(p79)?:
/*조건식의 연산결과가 true면 '식1'의 결과를 반환하고
 				false면 '식2'의 결과를반환한
 * 문법 > (조건)? 참일경우:거짓일경우
 * 사용> 변수=(조건)?참일경우:거짓일경우
 * if (조건){
   //조건만족시 실행코드
}else{
 //조건만족X시 실행코드
}
 */

public class Ex07_p79 {

	public static void main(String[] args) {
		//나이가 20이면 성인 출력,그렇지 않다면 미성년자로 출력
		
		Scanner sc = new Scanner(System.in);//Scanner클래스의 객체를 생성하여 참조변수 sc
		System.out.print("나이를 입력하세요:");
		int age = sc.nextInt();//입력받은 값을 int로 변환
		String result = ""; //결과 저장하기 위한 변수
		System.out.println("\n입력받은 나이="+age);
		// \n 줄바꿈
		// \r\n 줄바꿈
		
//		int age; //나이를 저장하기 위한 변수
//		String result = ""; //결과 저장하기 위한 변수
//		age=45; 
		
		
		System.out.println("---------------삼항 연산자 이용");
		//(age>=20)?System.out.println("성인");:System.out.println("미성년자");
		result=(age>=20)?"성인":"미성년자";
		System.out.println(result);
		
		
		
		
		System.out.println("---------------if문 이용");
		String result2 = "";
		if (age>=20){
			result2="성인";
		//조건만족시 실행코드
		}else{
			result2="미성년자";
		//조건만족X시 실행코드
		}
		System.out.println(result2);
	}

}
