package ch11_api;

import java.util.Date;

public class DateEX {
	public static void main(String[] args) {
        // 현재 날짜와 시간
    	//Date() : Date클래스의 생성자
        Date currentDate = new Date();
        System.out.println("현재 날짜와 시간: " + currentDate);

        // 특정 날짜 생성 (1970년 1월 1일 이후의 밀리초)
        //new Date(long)  : Date클래스의 생성자
        //표준 기준 시간(1970년 1월 1일, GMT 00:00:00) 이후 지정된 밀리초를 나타내도록 초기화합니다.
        Date specificDate = new Date(1672531199000L); // 2023년 1월 1일
        System.out.println("특정 날짜: " + specificDate);

	}

}
