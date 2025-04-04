package ch07_array;

/*배열의 선언
 타입[] 배열명;
 타입 배열명[];
 
 배열생성
 배열명 = new 타입[크기];
 
 인덱스(index) - 0부터 1씩
 배열명 [idx] => 배열의 idx에 위치한 값을 가져오기(get)
 배열명 [idx]=값 => 배열의 idx에 위치한 값을 가져오기(set)
 
 int scroe; syso(score)
 score = 100;
 scores[0]
 scores[0]=100;

 */

public class Ex01_211 {
	
	//메서드명(타입 변수)
	//argument 아규먼트 parameter 인수 인자 매개변수
	public static void main(String[] args){
		//byte,short,int의 기본값은0 long은 0L 
		//배열의 선언 
		long[] scores;
		
		//배열 생성
		scores = new long[6];
		
		//배열의 길이(크기) : 배열명.length
		int len = scores.length;
		System.out.println("배열명.length="+len);
		
		//인덱스 - 0부터1씩증가
		//배열명 [idx]=값 => 배열의 idx에 위치한 값을 가져오기(set)
		System.out.println("0번째 값:"+scores[0]);
		System.out.println("1번째 값:"+scores[1]);
		System.out.println("2번째 값:"+scores[2]);
		System.out.println("3번째 값:"+scores[3]);
		System.out.println("4번째 값:"+scores[4]);
		System.out.println("마지막 index번째 값:"+scores[len-1]);
		
		//배열명 [idx]=값 => 배열의 idx에 위치한 값을 가져오기(set)
		scores[0]=10;
		scores[1]=200;
		scores[2]=3000;
		scores[3]=40000;
		scores[4]=500000;
		scores[5]=600000;
		
		for(int i=0;i<len;i++) {
			System.out.println(i+"번째 값:"+scores[i]);
		}
		
		//주의 배열의 index번호를 넘기면 ArrayIndexOutOfBoundsException 발생
		//System.out.println("5번째 값:"+scores[5]); //exception발생
	}
}
