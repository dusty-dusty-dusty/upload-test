package b_control;

public class Ex01_if1 {
	public static void main (String[]args) {
		
//		String id = "20141";
//		
//		char a = id.charAt(3);
//		char b = id.charAt(4);
//		String year = "";
//		//id.substring(0,4) = 2014
//		String x = id.substring(0,4);
//		
//		if(b=='1') {
//			System.out.println(id.substring(0,4) + "공대");
//		} else {
//			System.out.println("사회대");
//		}
//		
//		
//		System.out.println(id+" 는 "+"201"+ a +"년도에 입학한" +b + "학생입니다.");
		
		String id = "2015300000";
		
		String year = id.substring(0,4);
		char major = id.charAt(4);
		
//		if(major == '1') {
//			System.out.println(year + "년도에 입학한 공대 학생");
//		} else if(major == '2') {
//			System.out.println(year + "년도에 입학한 사회대 학생");
//		} else if(major=='3') {
//			System.out.println(year + "년도에 입학한 미대 학생");
//		} else System.out.println("우리학교사람 아님");
			
		switch (major) {
			case '1' : System.out.println(year+ "년도에 입학한 공대학생입니당");break;
			case '2' : System.out.println(year+ "년도에 입학한 사회대학생입니당");break;
			case '3' : System.out.println(year+ "년도에 입학한 미대학생입니당");break;
			default : System.out.println("우리학교사람 아닙니다~");
			//System.out.printlnd(우리학교 사람아닙니다.);
		}
		
		
		
	
	}
}
