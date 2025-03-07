package ch11_api;

import java.util.Random;

/*Math클래스(자바의정석 참고)
 -수학계산에 유용한 메서드로 구성
 
  
 */



public class MathEx {
	public static void main(String[]args) {
		System.out.println("Math.PI="+Math.PI);
		System.out.println("---------------------------------------------");
		//점수:0~100 =>(int)(Math.random()*101)
		//주사위 : 1~16까지의 난수 만들기
		//로또 1~45 (int)(Math.random()*45)+1
		//(int)Math.random()*(최댓값-최소값+1)+최소값
		
		
		
		for(int i=1; i<=6; i++) {
			System.out.println((int)(Math.random()*6)+1);
		}
		
		for(int i=1; i<10; i++) {
			System.out.println((int)(Math.random()*45)+1);
		}
		
		//Math.random() : 0.0이상 1.0미만의 난수
		for(int i=1;i<10;i++) {
			System.out.println(Math.random());
		}

		//Math.floor() 내림
		System.out.println(Math.floor(0.60));
		System.out.println(Math.floor(0.40));
		System.out.println(Math.floor(5));
		System.out.println(Math.floor(5.1));
		System.out.println(Math.floor(-5.1));
		System.out.println(Math.floor(-5.9));
		
		//Math.ceil() 올림
		System.out.println("Math.ceil(0.60)="+Math.ceil(0.60));
		System.out.println(Math.ceil(0.40));
		System.out.println(Math.ceil(5));
		System.out.println(Math.ceil(5.1));
		System.out.println(Math.ceil(-5.1));
		System.out.println(Math.ceil(-5.9));
		
		
		Random rand = new Random();
		
		for(int i = 0; i <5; i++) {
			int iValue = rand.nextInt(10);// 0 <= iValue < 10
			System.out.println(iValue);
			System.out.println(rand.nextBoolean());
			System.out.println(rand.nextDouble());
		}
		
		
	}
}
