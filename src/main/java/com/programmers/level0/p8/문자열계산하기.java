package com.programmers.level0.p8;

import java.util.Arrays;

public class 문자열계산하기 {
    public static void main(String[] args) {
        System.out.println(solution("3 + 4 - 5"));
    }

    public static int solution(String my_string) {
//        String[] s = my_string.split(" ");
//
//        int sum = Integer.parseInt(s[0]);
//        for(int i = 1; i < s.length - 1; i++) {
//            if("+".equals(s[i])) {
//                sum += Integer.parseInt(s[i + 1]);
//            }
//
//            if("-".equals(s[i])) {
//                sum -= Integer.parseInt(s[i + 1]);
//            }
//        }
//        return sum;

        String[] s = my_string.replaceAll("- ", "-").replaceAll("[+] ", "").trim().split(" ");
        return Arrays.stream(s).mapToInt(Integer::parseInt).sum();
    }
}
