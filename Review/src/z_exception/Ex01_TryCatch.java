package z_exception;

public class Ex01_TryCatch {

	public static void main(String[] args) {
		
		String[] msg = new String[] {"행복합시다", "즐깁시다" , "멍때리기"};
		
		try {
			// 예외가 발생할 여지가 있는 구문
			for(int i=0; i<msg.length; i++) {
				System.out.println(msg[i]);
			}
			return; //반환
		}catch(Exception ex) {
			// 예외가 발생한 후에 작업구문
			System.out.println("예외발생:"+ex.getMessage());
			//이거아래꺼 쓰면 무슨오류인지 나옴
			//ex.printStackTrace();
		}finally {
			//[*] 예외 여부의 관계없이 무조건 실행구문
			//파이널리와 캐치의 차이는? 리턴을 넣어도 파이널리는 무조건 실행함. 중요한거에는 파이널리 사용
			System.out.println("무조건 실행");
		}
		
		System.out.println("프로그램 종료");
	}
	
}
