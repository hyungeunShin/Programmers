package com.programmers.level0.p10;

public class 모음제거 {
    public static void main(String[] args) {
        System.out.println(solution("bus"));
        System.out.println(solution("nice to meet you"));
    }

    public static String solution(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }
}
