package ch03;

//반복문-for(p111),while(p108), do while(p110)
/*for문(p111)
for(초기화; 조건식; 증감식){
 //반복실행코드
}
 */
public class ForEx01_p111 {

	public static void main(String[] args) {
		//5 4 3 2 1
		for(int i=5; i>=1; i--){
			 //반복실행코드
			System.out.println(i); //5 4 3 2 1
		}//for
	
		//------------------------
/*		//1 2 3 4 5
		for(int i=1; i<=5; i++){
			 //반복실행코드
			System.out.println(i); //1 2 3 4 5
		}//for
		System.out.println("for문밖");
*/		
	}//main

}
