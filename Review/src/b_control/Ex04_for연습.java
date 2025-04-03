package b_control;

public class Ex04_for연습 {

	public static void main(String[] args) {
		
//		// [1]
//		for(int e=0; e<26; e++) {
//					
//					for(char d='A'; d<='A'+e; d++) {
//						System.out.print(d);
//					} 
//					System.out.println();
//				}
		
		
//		//[2]
//		for(int e=0; e<26; e++) {
//			
//			for(char d='A'; d<='Z'-e; d++) {
//				System.out.print(d);
//			} 
//			System.out.println();
//		}
		
		
//		//[4]
//		for(int e=0; e<26; e++) {
//			
//			for(char d='Z'; d>='Z'-e; d--) {
//				System.out.print(d);
//			} 
//			System.out.println();
//		}
		
		//[3]
		for(int e=0; e<26; e++) {
			
			for(char d=(char)('A'+e); d<='Z'; d++) {
				System.out.print(d);
			} 
			System.out.println();
		}
		
	}

}
