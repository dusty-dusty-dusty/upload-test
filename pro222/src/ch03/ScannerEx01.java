package ch03;

import java.util.Scanner;

//p123 되새김문제 17번문제
public class ScannerEx01 {

	public static void main(String[] args) {
		//타입 변수명[=초기값];
		//클래스명 변수명 = new 클래스명();
		Scanner sc = new Scanner(System.in);//Scanner클래스의 객체를 생성하여 참조변수sc에 주소를 할당
		System.out.println(sc);
		int n = sc.nextInt(); //입력받은 값을 int로 변환
		System.out.println("입력받은 n="+n*100);
	}

}







