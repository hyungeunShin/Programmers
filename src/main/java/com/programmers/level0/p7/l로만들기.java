package com.programmers.level0.p7;

import java.util.stream.Collectors;

public class l로만들기 {
    public static void main(String[] args) {
        System.out.println(solution("abcdevwxyz"));
        System.out.println(solution("jjnnllkkmm"));
    }

    public static String solution(String myString) {
//        String answer = "";
//        for(char c : myString.toCharArray()) {
//            if(c < 108) {
//                answer += "l";
//            } else {
//                answer += c;
//            }
//        }
//        return answer;

//        return myString.replaceAll("[^l-z]", "l");

//        return myString.replaceAll("[a-l]", "l");

        return myString.chars()
                       .mapToObj(i -> Character.toString(Integer.max(i, 'l')))
                       .collect(Collectors.joining());
    }
}
