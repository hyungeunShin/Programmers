package com.programmers.level0.p7;

import java.util.Arrays;

public class 날짜비교하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {2021, 12, 28}, new int[] {2021, 12, 29}));
        System.out.println(solution(new int[] {1024, 10, 24}, new int[] {1024, 10, 24}));
    }

    public static int solution(int[] date1, int[] date2) {
//        LocalDate a = LocalDate.of(date1[0], date1[1], date1[2]);
//        LocalDate b = LocalDate.of(date2[0], date2[1], date2[2]);
//
//        return a.isBefore(b) ? 1 : 0;

        return Arrays.compare(date1, date2) < 0 ? 1 : 0;
    }
}
