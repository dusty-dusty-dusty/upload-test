package ch11_api;

import java.util.Calendar;

public class CalendarEx {
    public static void main(String[] args) {
        // 현재 날짜와 시간
        Calendar calendar = Calendar.getInstance();
        System.out.println("현재 날짜와 시간: " + calendar.getTime());

        // 특정 날짜 설정 (2023년 1월 1일)
        calendar.set(2025, Calendar.JANUARY, 1);
        System.out.println("설정된 날짜: " + calendar.getTime());

        // 날짜 더하기 (예: 10일 후)
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println("10일 후: " + calendar.getTime());
    }
}
