package ch07_array;
/*배열의 선언
타입[] 배열명;
타입   배열명[];

int[] scores;
int   scores[];
배열생성
배열명 = new 타입[크기];

인덱스(index) - 0부터 1씩 증가
배열명[idx]   =>  배열의 idx에 위치한 값을 가져오기(get)
배열명[idx]=값 =>  배열의 idx에 위치한 값을 설정하기(set)
*/

public class Ex03 {

	public static void main(String[] args) {
		//정수 10,20,30,99,100의 값을 저장하는 배열arr2를선언하고 값을 출력
		int[] arrr2= new int[]{10,20,30,90,100};
		System.out.println("arrr2="+arrr2);
		
		int[] arrr= new int[]{10,20,30,90,100};
		System.out.println("arrr="+arrr);
		
		int[] arrr3= new int[]{10,20,30,90,100};
		System.out.println("arrr3="+arrr3);
		
		
		
		System.out.println("-향상된 for문이용 출력------");
		for(int temp:arrr2) {
			System.out.println(temp);
		}
		System.out.println("\n-for문이용 출력------");
		for(int i=0;i<arrr2.length;i++) {
			System.out.println(i+"번째 값:"+arrr2[i]);
		}
		
		
		//-----------------------------
		//배열선언 및 생성. 값지정
		//초기값을 제시하면 배열길이를 자동으로 인식
		char[] arr1 = new char[]{'a','가','1'};
		for(int i=0;i<arr1.length;i++) {
			System.out.println(i+"번째 값:"+arr1[i]);
		}
		
		/*char[] arr0 = new char[]{'b','나','2'};
		for(int a=0;a<arr0.length;a++) {
			System.out.println(a+"번째 값:"+arr0[a]);
		*/}
	
		//char[] arr0 = new char[3]{'a','b','i'};
		//
		
	}


