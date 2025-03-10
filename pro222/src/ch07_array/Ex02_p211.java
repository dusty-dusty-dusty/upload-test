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
public class Ex02_p211 {
	
	//new 연산자로 배열을 처음 생성하면 배열 항목은 자료형별 기본값으로 초기화된다.
	public static void main(String[] args) {
		System.out.println("\n-String배열------------------------");
		//String배열 생성 및 선언
		String[] names = new String[3];
		System.out.println(names);
		//초기값출력-null
		for(int i=0;i<names.length;i++) {
			System.out.println(i+"번째 값:"+names[i]);
		}
		
		System.out.println("\n-boolean배열------------------------");
		//boolean배열 생성 및 선언
		boolean b[] = new boolean[3];
		System.out.println(b);
		//초기값출력
		for(int i=0;i<b.length;i++) {
			System.out.println(i+"번째 값:"+b[i]);
		}

		//----------------------------------------------------------
		System.out.println("\n-char배열------------------------");
		//char배열 생성 및 선언
		char c[] = new char[4]; // 공백  ' '  
		//초기값출력
		for(int i=0;i<c.length;i++) {
			System.out.println(i+"번째 값:"+c[i]);
		}
		
		c[1]='a';
		c[2]='A';
		c[0]='!';
		c[3]=65;   //int 65-> 'A'
		for(int i=0;i<c.length;i++) {
			System.out.println(i+"번째 값:"+c[i]);
		}
		
		//----------------------------------------------------------
		System.out.println("\n-double배열------------------------");
		//float,double의 배열초기값은 0.0
		//배열 생성 및 선언
		double nums[] = new double[3];
		
		nums[0]=3.14;
		nums[1]=3;
				
		//for문이용-nums배열안의 값 모두 출력
		for(int i=0;i<nums.length;i++) {
			System.out.println(i+"번째 값:"+nums[i]);
		}
		
	}
	
}







