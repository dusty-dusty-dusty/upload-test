package ch13_ch14_ch15;

import java.io.FileInputStream; // 파일 입력 스트림을 사용하기 위한 클래스
import java.io.IOException; // 입출력 관련 예외 
import java.io.InputStream; // 입력 스트림의 최상위 클래스


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

//아래 내용은 InputStream01과 동일하다. try~catch절을  throws절로 변경하였음
/*InputStream01.java - try~catch절을 사용한 예외처리
 *InputStream02.java - throws절을    사용한 예외처리   */
public class InputStream02 {

    public static void main(String[] args) throws IOException {
        //InputStream is = null; // InputStream 객체를 null로 초기화
 
        // "D:\\javaStudy\\test02.db" 파일을 읽기 위한 FileInputStream 생성
    	//다형성: 부모클래스타입의 참조변수에는 자식클래스객체가 들어갈 수 있다 
    	//클래스명 참조변수 = new 클래스명();
    	//부모클래스명 참조변수 = new 자식클래스명();
    	//조상클래스명 참조변수 = new 자손클래스명();
    	
    	//부모클래스InputStream 의 참조변수is에는 자식클래스FileInputStream객체가 들어갈 수 있다 
        InputStream is = new FileInputStream("D:\\javaStudy\\test02.db");
        while (true) {
            // 파일에서 한 바이트씩 읽어옴
            int data = is.read();
            // 더 이상 읽을 데이터가 없으면 -1을 반환하므로 반복문 종료
            if (data == -1) break;
            // 읽어온 데이터(바이트)를 출력
            System.out.println(data);
            is.close();
        }
  
    }
}
