package ch03;

//반복문-for(p111),while(p108), do while(p110)
/*for문(p111)
for(초기화; 조건식; 증감식){
	//반복실행코드
}

while(조건식){
//반복실행코드
}

do while문
주의>조건식을 충족하지 않아도 일반 한번은 실행한다!
do{
//반복실행코드
}while(조건식);
*/
public class ForEx02_p111 {

	public static void main(String[] args) {
		// += 대입연산자  할당연산자
		//1부터 5까지의 합을 출력하시오
		//1 2 3 4 5
		//0+1의 결과는 1
		//(0+1)+2의 결과는 3
		//(0+1+2)+3의 결과는 6
		//(0+1+2+3)+4의 결과는 10 //6+4
		//(0+1+2+3+4)+5 //10+5  //55
		int sum = 0;
		System.out.println("초기값 sum="+sum);
		for(int i=1; i<=5; i++){
			sum+=i; //sum=sum+i;  //sum+i의 결과를 sum변수에 할당
			System.out.println("i가 "+i+"일 때의 sum="+sum); //
		}
		System.out.println("1부터 5까지의 합은 "+sum);
	}

}







