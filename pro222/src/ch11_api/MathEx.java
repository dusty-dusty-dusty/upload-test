package ch11_api;

import java.util.Random;

/*Math클래스(자바의 정석 참고)
- 수학계산에 유용한 메서드로 구성되어 있다.(모두 static메서드)*/

public class MathEx {

	public static void main(String[] args) {
		System.out.println("Math.PI="+Math.PI);
		System.out.println("-------------------------");
		//점수:0~100   =>(int)(Math.random()*101)
		//로또번호:1~45 =>(int)(Math.random()*45)+1
		//주사위 : 1~6까지의 난수 
		//(int)(Math.random()*(최댓값-최소값+1))+최소값
		for(int i=1;i<11;i++) {
			System.out.println( (int)(Math.random()*101) );
		}
		
		System.out.println("\n\n-------------------------");
		//public static double random() : 0.0이상 1.0미만의 난수
		for(int i=1;i<6;i++) {
			System.out.println( Math.random()  );
		}
		
		
		//Math.floor() 내림
		System.out.println("\n\nMath.floor(0.60)="+Math.floor(0.60));
		System.out.println(Math.floor(0.40));
		System.out.println(Math.floor(5));
		System.out.println(Math.floor(5.1));
		System.out.println(Math.floor(-5.1));
		System.out.println(Math.floor(-5.9));
		//----------------------
		//Math.ceil()올림
		System.out.println("\n\nMath.ceil(0.60)="+Math.ceil(0.60));//1.0
		System.out.println(Math.ceil(0.40));//1.0
		System.out.println(Math.ceil(5));//5.0
		System.out.println(Math.ceil(5.1));
		System.out.println(Math.ceil(-5.1));//-5.0
		System.out.println(Math.ceil(-5.9));//-5.0
		
		
		System.out.println("\n\n=Random클래스 ============================");
		Random rand = new Random();

		for(int i = 0; i < 3; i++) {
			int iValue = rand.nextInt(30)+1; //0이상 10미만의 정수난수
			System.out.println(iValue);
//			System.out.println(rand.nextBoolean());
//			System.out.println(rand.nextDouble()); //0.0이상 1.0 미만의 double형 난수 발생
		}
		
		
	}

}
