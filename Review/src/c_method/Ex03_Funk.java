package c_method;

public class Ex03_Funk {

	public static void main(String[] args) {
		
		String a="헬로우";
		StringBuilder b=new StringBuilder("홍길동");
		int age = 33;

		method(a, b, age);
	}

	static void method(String greeting, 
			StringBuilder name,
			int age) {
		
		
		//데이타 3개 모두 여기서 출력
		System.out.println("인사말:"+ greeting);
		System.out.println("이름:"+ name);
		System.out.println("나이:"+ age);
	}
	
}
