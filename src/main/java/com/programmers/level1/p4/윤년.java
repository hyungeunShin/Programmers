package com.programmers.level1.p4;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;

public class 윤년 {
    public static void main(String[] args) {
        System.out.println(solution(5, 24));
    }

    public static String solution(int a, int b) {
//        int[] arr = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
//
//        int cnt = 0;
//        for(int i = 0; i < a - 1; i++) {
//            cnt += arr[i];
//        }
//        return day[(cnt + b - 1) % 7];

//        Calendar c = Calendar.getInstance();
//        c.set(2016, a - 1, b);
//        return c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("ko-KR")).toUpperCase();

        return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0, 3);
    }
}
