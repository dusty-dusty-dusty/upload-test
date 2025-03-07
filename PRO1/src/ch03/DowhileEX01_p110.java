package ch03;

//반복문-for(p111),while(p108), do while(p110)
/*for문(p111)
for(초기화; 조건식; 증감식){
	//반복실행코드
}while 조건식

while(조건식){
	//반복실행코드
}
*/
public class DowhileEX01_p110 {

	public static void main(String[] args) {
		
		System.out.println("-do while문 이용---");
		//1 2 3 4 5
		int a=0;
		do{ 
			//반복실행코드
			a++;
			if(a==6) {
				break; //반복문 종료
			}
			System.out.println(a);
			
		}while(a<=5);
		//--------------------------------------
		System.out.println("-do while문 이용---");
		//1 2 3 4 5
		int k=10;
		do{ 
			//반복실행코드
			System.out.println(k);
		}while(k<=5);
		
		//--------------------------------------
		System.out.println("-while문 이용---");
		//출력결과예측하여 쓰세요
		int q=1;
		while(q<=5){ //
			q++;
			System.out.println(q);//
		}
		
		//--------------------------------------
		System.out.println("-while문 이용---");
		//1 2 3 4 5
		int j=1;
		while(j<=5){ //6<=5
			System.out.println(j);//1 2 3 4 5
			j++;
		}
		
		//--------------------------------------
		System.out.println("-for문 이용---");
		//1 2 3 4 5
		int i=1;
		for( ; ; ){
			if(i<=5) { //5<=5  
				System.out.println(i);//1 2 3 4 5
			}//if
			i++;
			if(i==6) { //6==6
				break; //반복문 =>for문종료
			}
			//System.out.println("if문끝");
		}//for
//		System.out.println("for문끝");
		//Unreachable code
	}//main

}
