package ch13_ch14_ch15;

//java.io에 속한 모든 클래스(interface,Exception등)를 import
import java.io.*;

//스트림-p490
/*예외 처리(p520)
 * - try-catch 블록을 사용하여 코드 실행 중 발생할 수 있는 예외를 처리한다.
 * - FileNotFoundException은 지정한 파일이 존재하지 않을 때 발생하며, 
 *   IOException은 입출력 작업 중 발생하는 일반적인 예외이다.
 * - finally 블록은 예외 발생 여부와 관계없이 항상 실행되며, 
 *   주로 리소스를 해제하는 데 사용된다.
 * 
 *스트림(p490) & 자바입출력(p545)
 * - 스트림은 데이터의 흐름을 나타내며, 입력 스트림(InputStream)과 출력 스트림(OutputStream)으로 나뉜다.
 * - InputStream은 바이트 단위로 데이터를 읽어오는 데 사용되며, 
 *   FileInputStream은 파일에서 데이터를 읽기 위한 구체적인 구현체이다.
 * - 스트림을 사용하면 파일, 네트워크 등 다양한 데이터 소스와의 입출력을 간편하게 처리할 수 있다.
 */
public class OutputStream01 {

	public static void main(String[] args) throws IOException  {
//		OutputStream os = new FileOutputStream("D:\\javaStudy\\test01.db");
//		byte a = 10; byte b = 20; byte c = 30;
//		os.write(a);
//		os.write(b);
//		os.write(c);
//		os.flush();
//		os.close();
		
		//--------------------------------------------------
		OutputStream os = new FileOutputStream("D:\\javaStudy\\test02.db");
		
		byte[] arr = {10,20,30,40,50,60,70};
		//os.write(arr);   //byte[] arr에 있는 모든 것을 보낸다
		os.write(arr,1,3); //byte[] arr에 있는 arr[1]부터 3개를 보낸다

		os.flush();
		os.close();
		
		System.out.println("완료.");
	}

}
