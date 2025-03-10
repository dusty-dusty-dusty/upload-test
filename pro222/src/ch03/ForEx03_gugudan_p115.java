package ch03;

//반복문-for(p111),while(p108), do while(p110)
/*for문(p111)
for(초기화; 조건식; 증감식){
	//반복실행코드
}

while(조건식){
//반복실행코드
}

do while문
주의>조건식을 충족하지 않아도 일반 한번은 실행한다!
do{
//반복실행코드
}while(조건식);
*/
/*
2단--------
~~~ 
3단--------
~~~ 
4단--------
~~~  
5단--------
5*1=5 
5*2=10
...
5*9=45

9단--------
~~~ 
*/
public class ForEx03_gugudan_p115 {

	public static void main(String[] args) {
		//중첩된 반복문으로 구구단 계산하기 - 교재 p115 소스
		int dan;	//단수
		int times;
		for(dan=2; dan<=9; dan++){
			System.out.println(dan+"dan--------");	
			for(times=1; times<=9; times++){
				System.out.println("\t"+dan+"*"+times+"="+(dan*times));		
			}
			System.out.println(); //한 줄 띄워서 출력
		}
		
		//-----------------------------------------------
		//2 3 4 5 6 7 8 9
		for(int i=2; i<=9; i++){
			System.out.println(i+"단--------");	
			for(int j=1; j<=9; j++){
				System.out.println("\t"+i+"*"+j+"="+(i*j));		
			}
		}
		
		//-----------------------------------------------
		
/*		int dan = 5;
		System.out.println(dan+"단--------");
		for(int i=1; i<=9; i++){
			System.out.println("\t"+dan+"*"+i+"="+(dan*i));		
		}
*/		
	}

}
