package z_exception;

public class Ex04_throw {

	public static void main(String[] args) {
		try {
			method();
		}catch(Exception ex) {
			System.out.println("실패"+ ex.getMessage());
		}
			
			System.out.println("프로그램 종료");
		}
		
		static void method() throws Exception{
			
		try {
			String[] msg = {"행복합시다", "즐깁시다" , "멍때리기"};
			for(int i=0; i<=msg.length; i++) {
				System.out.println(msg[i]);
			}
		}catch(Exception ex) {
			throw new IctException();
		}
	}
		
}


