package ch11_api;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingDateTime {
  public static void main(String[] args) {
	 //LocalDateTime클래스는 생성자가 없다. 객체생성은 now호출
    LocalDateTime myDateObj = LocalDateTime.now(); //LocalDateTime클래스 객체생성  
    System.out.println("Before formatting: " + myDateObj);
    
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
    
    String formattedDate = myDateObj.format(myFormatObj);  //패턴을 적용
    System.out.println("After formatting: " + formattedDate); //패턴 적용 후의 날짜시간
  }  
}
