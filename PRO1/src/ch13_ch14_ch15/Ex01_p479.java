package ch13_ch14_ch15;

import java.util.function.BiFunction;//두 개의 입력을 받아서 하나의 출력을 반환하는 함수형 인터페이스

/*람다식 예)
	int add(int x, int y) {
	    return x + y;
	}

	//위의 메서드를 람다 표현식을 이용해 아래와 같이 단축 시킬수 있다. 
	//(메서드 반환 타입, 메서드 이름 생략)
	(int x, int y) -> {
		return x + y; 
	};

	//매개변수 타입도 생략 할 수 있다.
	(x, y) -> {
		return x + y;
	};

	//함수에 리턴문 한줄만 있을 경우 더욱 더 단축 시킬 수 있다. 
	//(중괄호, return 생략)
	(x, y) -> x + y;
 */
public class Ex01_p479 {

	//람다 표현식은 메서드의 본체가 아니라, 인터페이스의 구현으로 사용되어야 한다
//    (int x, int y) -> {
//        return x + y; //문제 발생: 이 표현식은 독립적으로 사용할 수 없습니다.
//    };

    public static void main(String[] args) {
        //BiFunction 인터페이스를 사용하여 두 정수를 더하는 람다 표현식 정의
    	//Integer 타입 매개변수를 받아서 Integer 타입의 결과를 반환
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;

        // 람다 표현식 사용
        int result = add.apply(5, 10); // 5와 10을 더함
        System.out.println("Result: " + result); // 결과 출력
    }

}
