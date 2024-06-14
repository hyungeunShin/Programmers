package com.programmers.level0_5;

public class rny_string {
    public static void main(String[] args) {
        System.out.println(solution("masterpiece"));
        System.out.println(solution("programmers"));
        System.out.println(solution("jerry"));
        System.out.println(solution("burn"));
    }

    public static String solution(String rny_string) {
        return rny_string.replace("m", "rn");
    }
}
