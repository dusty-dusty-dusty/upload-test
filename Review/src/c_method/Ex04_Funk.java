package c_method;

public class Ex04_Funk {

	public static void main(String[] args) {
		
		
		Object[] result = method();
		
//		System.out.println(result);
		//여기서 3개 출력
		for(int i=0; i<result.length; i++)
		System.out.println(result[i]);
		
	}
	
	static Object[] method ()
	{
		String a="헬로우";
		StringBuilder b=new StringBuilder("홍길동");
		int age = 33;
		
		
		Object[] obj=new Object[3];
		obj[0] = a;
		obj[1] = b;
		obj[2] = age;
				
		return obj;
	}
	
}
