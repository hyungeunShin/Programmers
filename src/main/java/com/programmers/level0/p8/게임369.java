package com.programmers.level0.p8;

public class 게임369 {
    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution(29423));
    }

    public static int solution(int order) {
//        return (int) String.valueOf(order).chars().filter(c -> c == '3' || c == '6' || c == '9').count();

        return String.valueOf(order).replaceAll("[0-24-57-8]", "").length();
    }
}
