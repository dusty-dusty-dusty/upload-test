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

Break : 반복문종료
*/
public class BreakContinueEx01_p117 {

	public static void main(String[] args) {
		System.out.println("-continue 사용-------------------");
		//1 2 3 4 5 (6미출력) 7 8 9 10 반복문밖
		           //11<=10    
		for(int i=1; i<=10; i++){
			//i=8
			if(i==6) {
				continue; //(현재 조건만족시)반복은 멈추고 but 다음 반복은 계속~~~이어진다
			}
			System.out.println(i); //1 2 3 4 5     7 8 9 10
		}//for
		System.out.println("반복문밖");
		
		System.out.println("\n\n-break 사용-------------------");
		//1 2 3 4 5 반복문밖
		           //6<=10    
		for(int i=1; i<=10; i++){
			//i=6
			if(i==6) {
				break; //반복문종료
			}
			System.out.println(i); //1 2 3 4 5
		}//for
		System.out.println("반복문밖");
	}

}
