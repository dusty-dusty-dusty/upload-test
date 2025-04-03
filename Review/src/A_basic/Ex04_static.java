package A_basic;

/*
 * 	Static : 공유할때 쓰는애임 3개쓰면 3이라고나옴
 *  heap의 일부분으로 static 영역이 따로 있음 
 *  static이 붙게 되면 각자 메모리를 할당하지 않고 static영역에 메모리를 하나만 할당
 *  각각의 객체에서 count 가 static영역을 가리킴
 *         => 클래스명으로 접근가능
 */

class book{
	private static int count=0;
	   	//생성자함수 : 클래스명하고 똑같은 함수 (void 쓰면안됨)
	   	//new -> 객체생성
		//2. new만나는 순간 생성자 함수를 만나 count를 증가 => 1로 증가 
	    //4. 동일 
	
	book(){
		count++;
	}
	
	public static int getCount() {
		return count;
	}
}

public class Ex04_static {
	public static void main(String[]args) {
		
//		book a =new book();
//		book a2 =new book();
//		book b =new book();
//		book c =new book();
		
//		System.out.println("책갯수:"+ a.count); //1
//		System.out.println("책갯수:"+ b.count); //1
//		System.out.println("책갯수:"+ c.count);
		
		System.out.println("책갯수:"+book.getCount());
	}
}
