package ch03;
//관계연산자.비교연산자(p75)
/* a>b a은 b보다 크다 [초과]
* a<b a은 b보다 작다 [미만]
* a<=b a은 b보다 작거나 같다 [이하]
* a>=b a은 b보다 크거나 같다 [이상]
* a==b a은 b과 같다.동일하다.일치한다
* a!=b a은 b과 같지않다.동일하지않다.일치하지않다
*/
/*제어문 조건 (if,switch), 반복문(for,while,do while)
 * 91P if문
 * if(조건){
  	  조건참일경우 실행코드
  }
 */

// 변수명 한번에 바꾸기 alt + shift + r

public class Ex02_p75 {
	
	public static void main(String[] args) {
	    int score = 80;
		int cutline = 90;
		
		//System.out.println("a="+score);
		//System.out.println("b="+cutline);
		//System.out.println(score<cutline);
		//System.out.println(score<=cutline);
		//System.out.println(score>=cutline);
		//System.out.println(score>cutline);
		//System.out.println(score==cutline);
		//System.out.println(score!=cutline);
		
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
			}else {
				System.out.println("성적이 0이상~100이하 이어야 합니다.");
			}//밖if끝			
		}
	
}//main끝
