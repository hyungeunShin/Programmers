package com.programmers.level0.p1;

public class 문자리스트를문자열로 {
    public static void main(String[] args) {
        System.out.println(solution(new String[] {"a", "b", "c"}));
    }

    public static String solution(String[] arr) {
        return String.join("", arr);
    }
}
