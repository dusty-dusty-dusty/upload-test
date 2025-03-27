package b_control;

public class Ex01_If_성별 {

	public static void main(String[] args) {
		
		String id = "961005-1245678";
		
		char sung = id.charAt(7);
		//System.out.println("성별:"+sung);
		/*
		 * sung이라는 문자의 값이 1이거나 3이라면 [남자 출력]
		 * 그렇지 않다면 여자 출력
		 */
	
		if(sung=='1' || sung=='3') {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
	}

}
