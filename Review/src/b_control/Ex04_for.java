package b_control;

/*
 
 	for ( 초기화 ; 조건문 ; 증가치  ){
 		반복할 문장들
 	}
 	
 	for( 1; 2; 4){
 		3
 	} //1번 트루면 2번 2번이 트루면 3번 3번이 실행되면 4번
 */


public class Ex04_for {

	public static void main(String[] args) {
		
//		for(int a=0;  a<5;  a++) {
//			System.out.println(a);
//		}
		
		
//		for (int b=1; b<10 ; b+=2) {
//			System.out.println(b);
//		}
		
//		for(int c=100; c>=0; c-=5 ) {
//			System.out.println(c);
//		}
		
		
		for(int e=0; e<26; e++) {
			
			for(char d='A'; d<='Z'; d++) {
				System.out.print(d);
			} 
			System.out.println();
		}
		
		
		
	}

}
