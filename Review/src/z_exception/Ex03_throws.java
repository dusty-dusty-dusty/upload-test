package z_exception;

import java.io.FileInputStream;

public class Ex03_throws {

	public static void main(String[] args) {
		
		//서라운디드트라이캐치눌러서 나온거임
		try {
			method();
		} catch (Exception e) {
			System.out.println("실패:"+ e.getMessage());
		}
		
	}
	
	static void method() throws Exception {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("abc.txt");
			fis.read();
		}finally {
			fis.close();
		}
	
	}
}