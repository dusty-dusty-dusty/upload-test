package c_method;


import java.util.*;
public class Ex05_Func {

	public static void main(String[] args) {
		ArrayList result= method();
		
		for(int i=0; i<result.size(); i++)
			System.out.println(result.get(i));
		//여기서 출력
		
		
	}
	
	
	
	static ArrayList method() {
		String a = "헬로우";
		StringBuilder b=new StringBuilder("홍길동");
		int age = 33;
		

		ArrayList list = new ArrayList();
		list.add(a);
		list.add(b);
		list.add(age);
		
		return list;
		
	}
	
}
