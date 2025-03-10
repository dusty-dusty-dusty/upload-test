package ch03;

//관계연산자.비교연산자(p75)
/* a>b	a은 b보다 크다.초과
 * a<b	a은 b보다 작다.미만
 * a<=b	a은 b보다 작거나 같다.이하
 * a>=b	a은 b보다 크거나 같다.이상
 * a==b	a은 b과 같다.동일하다.일치한다
 * a!=b	a은 b과 같지않다.동일하지않다.일치하지않다
 */

/*제어문-조건(if,switch),반복문(for,while,do while)
*if문(p91)
*if문
 if(조건){
	조건참일경우 실행코드
 }
 
*if~else문(p91)
 if(조건){
	조건참일경우 실행코드
 }else{
 	조건참x 실행코드
 }
 
 *if~else if~else문(p94)
 if(조건1){
	조건1참일경우 실행코드
 }else if(조건2){
	조건2참일경우 실행코드
 }else if(조건3){
	조건3참일경우 실행코드
 }else{
 	모든 조건을 충족하지 않을 경우 실행코드
 }
*/
public class Ex02_p75 {

	public static void main(String[] args) {
		int score = 80;   //성적
		int cutline = 90;  //기준
		System.out.println("score="+score);
		System.out.println("cutline="+cutline);
//		System.out.println(score<cutline);//10<90 true
//		System.out.println(score<=cutline);//t
//		System.out.println(score>=cutline);//f
//		System.out.println(score>cutline);//f
//		System.out.println(score==cutline);//f
//		System.out.println(score!=cutline);//t
		
		//성적이 90점이상이면 합격,성적이 80점이상이면 예비합격,그렇지않으면 불합격
		if(score>=cutline) {
			//조건을 만족하는 경우 실행코드
			System.out.println("ㅊㅋㅊㅋ 합격!");
		}else if(score>=80){
			System.out.println("예비합격!");
		}else{
		 	//모든 조건을 충족하지 않을 경우 실행코드
			System.out.println("불합격. 아쉽지만 다음에 다시 시도해보세요.");
		}//if끝
				
//		and 그리고 & &&
//		or  또는  | ||
		//성적이 90점이상고     100이하이면 A학점
		//성적이 80점이상 그리고 90점미만이면 B학점
		//성적이 60점이상이면서  80점미만이면 C학점
		//그외 F학점
		
		String result = "";
		if(score>=0 && score<=100) {
			if(score>=cutline) {
				//조건을 만족하는 경우 실행코드
				result = "A"; //Duplicate local variable result
			}else if(score>=80 && score<90){
				result = "B";
			}else if(score>=60 && score<80){
				result = "C";
			}else{
				//모든 조건을 충족하지 않을 경우 실행코드
				result = "D";
			}//안쪽if끝
			System.out.println(result+"학점");
			//result cannot be resolved to a variable
		}else {
			System.out.println("성적이 0이상~100이하 이어야 합니다.");
		}//밖if끝	
		
		
		
		
	}//main끝

}//class




