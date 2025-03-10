package ch05;

//계산기 클래스이다
/*[접근제한자] [제한자] class 클래스명 {

//field-데이터=>명사
//[접근제한자] [제한자] 타입 변수명[=초기값]

//constructor(생성자)
//[접근제한자] [제한자] 클래스명(매개변수리스트){}

//method-기능,동작=>동사
//[접근제한자] [제한자] 리턴타입 메서드명(매개변수리스트){}

}*/

//연산식에서 자동 타입변환
public class Calculator01 {

	//field-데이터=>명사
	//[접근제한자] [제한자] 타입 변수명[=초기값]

	//constructor(생성자)
	//[접근제한자] [제한자] 클래스명(매개변수리스트){}

	//method-기능,동작=>동사
	//[접근제한자] [제한자] 리턴타입 메서드명(매개변수리스트){}
	
	//int매개변수 a, int매개변수 b를 가진 sum()메서드선언
	//매개변수 a와 b의 값을 더한 결과를 리턴
	//4. 매개변수있고 리턴값있는 메서드
	//더하기
	int sum(int a, int b){
			return a+b;
	}
	
	//빼기
	int minus(int a, int b){
		return a-b;
	}
	
	//나누기
	//★★★method overloading : 하나의 동일 클래스안에서 이름은 같지만 매개변수의 개수,타입,순서가 하나라도 다른  method
	int divide(int a, int b){
		if(b==0) {
			System.out.println("0으로 나눌 수 없어요");
			return 0;
		}else {
			return a/b;
		}
	}
	double divide(double a, double b){
		return a/b;
	}
	long divide(long a, long b){
		return a/b;
	}
	double divide(long a, double b){
		return a/b;
	}
	float divide(double a, long b){
		return (float)(a/b);
	}	
}

/*method유형 4가지
1.매개변수없고 리턴값없는 메서드
문법> void 메서드명(){
}

2.매개변수있고 리턴값없는 메서드
문법> void 메서드명(매개변수리스트){
}

3.매개변수없고 리턴값있는 메서드
문법> 리턴타입 메서드명(){
		return 표현식;
}

4. 매개변수있고 리턴값있는 메서드
문법> 리턴타입 메서드명(매개변수리스트){
		return 표현식;
}
 */