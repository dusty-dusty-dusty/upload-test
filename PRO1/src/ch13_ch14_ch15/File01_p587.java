package ch13_ch14_ch15;

import java.io.File; // 파일 및 디렉토리 경로를 다루기 위한 클래스
import java.text.SimpleDateFormat; // 날짜 형식을 지정하기 위한 클래스
import java.util.Date; // 날짜 및 시간을 다루기 위한 클래스

/*File클래스(p587)
- 파일과 디렉토리를 다루는데 사용되는 클래스 */

//지정된 경로에 폴더와 파일을 생성하고, 해당 경로의 파일 및 폴더 목록을 출력해보자
public class File01_p587 {
    public static void main(String[] args) throws Exception {
        // 폴더 객체 생성
        File dir = new File("D:\\dustydustydusty\\javastudy\\images");
        
        // 파일 객체 생성
        File file1 = new File("D:\\dustydustydusty\\javastudy\\file1.txt");
        File file2 = new File("D:\\dustydustydusty\\javastudy\\file2.txt");
        File file3 = new File("D:\\dustydustydusty\\javastudy\\file3.txt");
        
        // C:/Temp/images 폴더가 존재하지 않는다면 폴더 생성
        if (dir.exists() == false) {  
            dir.mkdirs();  // mkdirs()는 다중 디렉토리를 생성
        }
        
        // C:/Temp/file1.txt 파일이 존재하지 않는다면 파일 생성
        if (file1.exists() == false) {  
            file1.createNewFile();  
        }
        if (file2.exists() == false) {  
        	file2.createNewFile();  
        }
        if (file3.exists() == false) {  
            file3.createNewFile();  
        }

        //-----------------------------------
        // 파일 객체 생성
        File tenp = null;
        // 파일 객체 초기ghk
        File temp = new File("D:\\\\dustydustydusty\\\\javastudy"); 
        // listFiles() : 폴더 및 파일 목록 가져오기
        File[] contents = temp.listFiles();
        
        System.out.println("시간\t\t\t형태\t\t크기\t이름"); //  \t는 tab만큼 공백을 띄어라
        System.out.println("----------------------------------------------------------");
    
        // 날짜 포맷 생성 
        // yyyy-MM-dd a HH:mm : 날짜와 시간을 포맷하는 형식
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
        for (File file : contents) {
            // lastModified() : 마지막 수정일
            System.out.print(sdf.format(new Date(file.lastModified())));
            if (file.isDirectory()) { // 폴더라면
                // getName() : 파일 이름 가져오기
                System.out.print("\t<DIR>\t\t\t" + file.getName());
            } else {
                // 폴더가 아니라면
                // length() : 파일 길이(용량)
                // getName() : 파일명 가져오기
                System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
            }
            System.out.println();
        }
    }
}
/*참고> main메서드에서 Exception을 throws하여 모든 예외를 처리하도록 설정하였으나, 
실제로는 구체적인 예외를 처리하는 것이 좋다. 
예를 들어, IOException을 catch하여 파일 생성 및 접근 중 발생할 수 있는 예외를 처리 가능*/