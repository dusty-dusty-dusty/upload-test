package ch11_api;

import java.util.Calendar;
import java.util.Date;

//Date클래스를 Calendar클래스로 변환


public class DateToCalendarEx {
	public static void main(String[] args) {
        // 현재 날짜와 시간
        Date currentDate = new Date();
        System.out.println("현재 Date: " + currentDate);

        // Date를 Calendar로 변환
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        System.out.println("변환된 Calendar: " + calendar.getTime());
        
        //calendar를 Date로 변환
        Date date= calendar.getTime();
        System.out.println("변환된 Date"+date);
        
    }
}
