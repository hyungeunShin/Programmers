package com.programmers.level1.p4;

public class 가운데글자가져오기 {
    public static void main(String[] args) {
        System.out.println(solution("abcde"));
        System.out.println(solution("qwer"));
    }

    public static String solution(String s) {
        String answer = "";
        if(s.length() % 2 == 0) {
            answer += s.charAt(s.length() / 2 - 1);
        }
        answer += s.charAt(s.length() / 2);
        return answer;
    }
}
