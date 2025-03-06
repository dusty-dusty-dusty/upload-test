package ch07_array;
/*가변배열(자바의 정석 참고)
- 다차원 배열에서 마지막 차수의 크기를 지정하지 않고 각각 다르게 지정.
*/

public class TwoDimension02_p219 {

	public static void main(String[] args) {
		//배열생성시 초기화
		//타입[] 배열명 = {값1,값2,..값n};
		int[][] scores = { 
							{90,91,92,93,100},
							{80,81},
							{70,71,72}
						  };
		System.out.println("scores="+scores);//[[I@3d012ddd
		System.out.println("scores.length="+scores.length);//3
		//주소확인
//		for(int i=0;i<3;i++) {
//			System.out.print(scores[i]);
//		}
		System.out.println("scores[0].length="+scores[0].length);//5
		System.out.println("scores[1].length="+scores[1].length);//2
		System.out.println("scores[2].length="+scores[2].length);//5
		
		for(int i=0;i<scores.length;i++) {  //0 1 2
			for(int j=0;j<scores[i].length;j++) { // 0 1 2 3 4
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


