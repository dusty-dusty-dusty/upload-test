package ch03;

/*switch문(p98)
switch(조건){
	case 값1: //값1과 일치할 경우 실행코드
			 [break;]
	case 값2: //값2과 일치할 경우 실행코드
			 [break;]
	~~
	case 값N: //값N과 일치할 경우 실행코드
			 [break;]
	default: 위의 모든 조건 충족하지 않을 경우 실행코드
			 [break;]
}
 
정수: byte(1)<short(2)<int(4.기본)<long(8)
실수: float(4)<double(8.기본)

byte(1)<char(2),short(2)<int(4.기본)<float(4)<long(8)<double(8.기본)
*/

/*month에 따른 계절을 출력하시오
3 4 5 : 봄
6 7 8 : 여름
9 10 11 : 가을
12 1 2 : 겨울*/
public class Ex03_p98 {

	public static void main(String[] args) {
		//case문에 character 사용하기
		char medal1='g';
		switch(medal1) {
		case 'g' : System.out.println("금"); break;
		case 's' : System.out.println("은"); break;
		case 'b' : System.out.println("동"); break;
		default : System.out.println("메달아닙니다~"); break;
		}
		//-----------------------------------
		//case문에 문자열 사용하기
		String medal="si";
		switch(medal) {
		case "gold" : System.out.println("금메달"); break;
		case "silver" : System.out.println("은메달"); break;
		case "bronze" : System.out.println("동메달"); break;
		default : System.out.println("메달아닙니다"); break;
		}
		//-----------------------------------
		//case문에 int 사용하기
		int month = 3;
		
		switch(month){
		case 1: //값1과 일치할 경우 실행코드
		case 2: 
		case 12: System.out.println("겨울"); break;		
		case 3: 
		case 4: 
		case 5: System.out.println("봄"); break;
		case 6:  
		case 7:  
		case 8: System.out.println("여름"); break;
		case 9: 
		case 10: 
		case 11: System.out.println("가을"); 
		default: //위의 모든 조건 충족하지 않을 경우 실행코드
				System.out.println("1~12가 아니군요."); break;
		}//switch문끝
		System.out.println("switch문끝"); 
	}

}
