package com.programmers.level1.p4;

public class 시저암호 {
    public static void main(String[] args) {
        System.out.println(solution("AB", 1));
        System.out.println(solution("z", 1));
        System.out.println(solution("a B z", 4));
    }

    public static String solution(String s, int n) {
        String answer = "";
        for(char c : s.toCharArray()) {
            if(c == 32) {
                answer += " ";
                continue;
            }

            if(Character.isUpperCase(c)) {
                c = (char) ('A' + (c - 'A' + n) % 26);
            } else {
                c = (char) ('a' + (c - 'a' + n) % 26);
            }

            answer += (char) c;
        }
        return answer;
    }
}
