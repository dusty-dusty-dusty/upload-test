package z_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02_TryCatch2 {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("abc.txt");
			System.out.println("파일연결 성공");
			
			fis.read();
			
		}catch(FileNotFoundException ex) {
			System.out.println("파일이없는 오류 발생");
		}catch(IOException ex) {
			System.out.println("파일 읽고 쓸때 예외발생");
		}catch(Exception ex) {
			System.out.println("그외 예외발생");
		}
	}

}
