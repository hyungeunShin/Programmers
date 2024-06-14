package com.programmers.level0_5;

public class 대문자로바꾸기 {
    public static void main(String[] args) {
        System.out.println(solution("aBcDeFg"));
        System.out.println(solution("AAA"));
    }

    public static String solution(String myString) {
        //return myString.toUpperCase();

        String answer = "";

        for(int i = 0 ; i < myString.length() ; i++) {
            char c = myString.charAt(i);
            if(c >= 97) {
                c -= 32;
            }
            answer += String.valueOf(c);
        }

        return answer;
    }
}
