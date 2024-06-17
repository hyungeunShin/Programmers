package com.programmers.level0.p5;

public class 소문자로바꾸기 {
    public static void main(String[] args) {
        System.out.println(solution("aBcDeFg"));
        System.out.println(solution("aaa"));
    }

    public static String solution(String myString) {
        //return myString.toLowerCase();

        String answer = "";
        for(int i = 0 ; i < myString.length() ; i++) {
            char c = myString.charAt(i);
            if(c <= 90) {
                c += 32;
            }
            answer += String.valueOf(c);
        }
        return answer;
    }
}
