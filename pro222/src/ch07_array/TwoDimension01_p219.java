package ch07_array;

/*다차원 배열(p219)
- 배열 항목에는 또 다른 배열이 대입된 배열
-‘[]’의 개수가 차원의 수를 의미한다.
- 값 목록으로 다차원 배열 생성
  :값 목록으로 다차원 배열을 생성 시 배열 변수 선언 시 
   타입 뒤에 대괄호 [ ]를 차원의 수만큼 붙이고, 
   값 목록도 마찬가지로 차원의 수만큼 중괄호를 중첩

 */
public class TwoDimension01_p219 {

	public static void main(String[] args) {
		//배열생성시 초기화
		//타입[] 배열명 = {값1,값2,..값n};
		int[][] scores = { 
							{90,91,92,93,100},
							{80,81,82,83,84},
							{70,71,72,73,74}
						  };
		System.out.println("scores="+scores);//[[I@3d012ddd
		System.out.println("scores.length="+scores.length);//3
		//주소확인
//		for(int i=0;i<3;i++) {
//			System.out.print(scores[i]);
//		}
		System.out.println("scores[0].length="+scores[0].length);//5
		System.out.println("scores[1].length="+scores[1].length);//5
		System.out.println("scores[2].length="+scores[2].length);//5
		
		for(int i=0;i<3;i++) {  //0 1 2
			for(int j=0;j<5;j++) { // 0 1 2 3 4
				System.out.printf("%5d",scores[i][j]);
			}
			System.out.println();//빈줄
		}
		
		
		
		//-------------------------------------------
		//타입에 따른 자동초기화
		/*타입[] 배열명;
		  배열명= new 타입[크기];*/
		//타입[] 배열명 = new 타입[크기];
		
		//배열생성시 초기화
		//타입[] 배열명 = new 타입[]{값1,값2,..값n};
		//타입[] 배열명 = {값1,값2,..값n};

		//배열생성시 초기화
		//5명의 학생이 수학점수
//		int[] scores = {90,91,92,93,100};
//		//System.out.println("scores="+scores);//[I@3d012ddd
//		int len=scores.length;
//		//System.out.println("학생수(scores.length)="+scores.length);
//		for(int i=0;i<len;i++) {
//			System.out.printf("%5d",scores[i]);
//		}
//		System.out.printf("\n");//줄바꿈
	}

}





