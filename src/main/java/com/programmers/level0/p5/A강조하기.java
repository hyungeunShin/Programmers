package com.programmers.level0.p5;

public class A강조하기 {
    public static void main(String[] args) {
        System.out.println(solution("abstract algebra"));
        System.out.println(solution("PrOgRaMmErS"));
    }

    public static String solution(String myString) {
//        return myString.toLowerCase().replaceAll("a", "A");

        String answer = "";
        for(char c : myString.toCharArray()) {
            if(c == 'a' || c == 'A') {
                answer += String.valueOf(c).toUpperCase();
            } else {
                answer += String.valueOf(c).toLowerCase();
            }
        }
        return answer;
    }
}
