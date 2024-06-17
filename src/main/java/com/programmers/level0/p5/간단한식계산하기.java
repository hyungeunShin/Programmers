package com.programmers.level0.p5;

public class 간단한식계산하기 {
    public static void main(String[] args) {
        System.out.println(solution("43 + 12"));
        System.out.println(solution("0 - 7777"));
        System.out.println(solution("40000 * 40000"));
    }

    public static int solution(String binomial) {
        String[] s = binomial.split(" ");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[2]);

        if("+".equals(s[1])) {
            return a + b;
        } else if("-".equals(s[1])) {
            return a - b;
        } else {
            return a * b;
        }
    }
}
