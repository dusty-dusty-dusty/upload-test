package ch03;


//반복문-for(p111),while(p108), do while(p110)
/*for문(p111)
for(초기화; 조건식; 증감식){
	//반복실행코드
}while 조건식

while(조건식){
	//반복실행코드
}
*/

public class ForEx02_p111 {

	public static void main(String[] args) {
		//+= 대입 연산자
		// 1부터5까지의 합을 출력하시오
		// 1 2 3 4 5
		// 1+2 = 3
		// 1+2+3 =6
		// 1+2+3+4 = 10
		// 1+2+3+4+5 = 15
		int sum = 0;
		System.out.println("초기값 sum="+sum);
		for(int i=1; i<=10; i++) {
			sum+=i;
			System.out.println("i가" + i + "일때의 sum="+sum);
		}
		System.out.println("1부터 10가지의 합은"+sum);
	}

}
