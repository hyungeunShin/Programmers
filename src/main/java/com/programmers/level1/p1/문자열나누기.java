package com.programmers.level1.p1;

public class 문자열나누기 {
    public static void main(String[] args) {
        System.out.println(solution("banana"));
        System.out.println(solution("abracadabra"));
        System.out.println(solution("aaabbaccccabba"));
    }

    public static int solution(String s) {
        char x = s.charAt(0);
        int same = 0;
        int different = 0;

        int answer = 0;
        for(int i = 0; i < s.length(); i++) {
            if(x == s.charAt(i)) {
                same++;
            } else {
                different++;
            }

            if(same == different) {
                answer++;
                if(i + 1 < s.length()) {
                    x = s.charAt(i + 1);
                }
                same = 0;
                different = 0;
            } else if(i == s.length() - 1) {
                answer++;
            }
        }

        return answer;
    }
}
