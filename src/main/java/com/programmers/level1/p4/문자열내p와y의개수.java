package com.programmers.level1.p4;

public class 문자열내p와y의개수 {
    public static void main(String[] args) {
        System.out.println(solution("pPoooyY"));
        System.out.println(solution("Pyy"));
    }

    public static boolean solution(String s) {
        long p = s.toLowerCase().chars().filter(c -> c == 'p').count();
        long y = s.toLowerCase().chars().filter(c -> c == 'y').count();

        return p == y;
    }
}
