package com.programmers.level0_3;

public class nine으로나눈나머지 {
    public static void main(String[] args) {
        System.out.println(solution("123"));
        System.out.println(solution("78720646226947352489"));
    }

    public static int solution(String number) {
//        int answer = 0;
//        for(char c : number.toCharArray()) {
//            answer += Integer.parseInt(String.valueOf(c));
//        }
//
//        return answer % 9;

        return number.chars().map(c -> (c - '0') % 9).sum() % 9;
    }
}
