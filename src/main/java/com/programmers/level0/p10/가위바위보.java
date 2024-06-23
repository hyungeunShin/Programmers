package com.programmers.level0.p10;

public class 가위바위보 {
    public static void main(String[] args) {
        System.out.println(solution("2"));
        System.out.println(solution("205"));
    }

    public static String solution(String rsp) {
        String answer = "";

        for(char c : rsp.toCharArray()) {
            if(c == '0') {
                answer += 5;
            } else if(c == '2') {
                answer += 0;
            } else {
                answer += 2;
            }
        }

        return answer;
    }
}
