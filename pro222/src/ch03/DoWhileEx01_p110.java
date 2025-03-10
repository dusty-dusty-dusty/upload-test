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
public class DoWhileEx01_p110 {

	public static void main(String[] args) {
		//--------------------------------------
		System.out.println("-do while문 이용---");
		//1 2 3 4 5
		int a = 0;
		do {
			//반복실행코드
			a++;
			if(a==6) {
				break; //반복문 종료
			}
			System.out.println(a); // 1 2 3 4 5 6
		}while(a <= 5); //6<=5
		
		//--------------------------------------
		System.out.println("-do while문 이용---");
		//10
		int k=10;
		do{
			 //반복실행코드
			System.out.println(k);//10
		}while(k<=5);
		
		//--------------------------------------
		System.out.println("-while문 이용---");
		//1 2 3 4 5
		int j=1;
		while(j<=5){ //6<=5
			System.out.println(j);//1 2 3 4 5
			j++;
		}
	}

}
