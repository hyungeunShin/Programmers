package com.programmers.level0_5;

import java.util.stream.Collectors;

public class 문자열바꿔서찾기 {
    public static void main(String[] args) {
        System.out.println(solution("ABBAA", "AABB"));
        System.out.println(solution("ABAB", "ABAB"));
    }

    public static int solution(String myString, String pat) {
//        String s = myString.chars()
//                           .mapToObj(c -> (char) c == 'A' ? 'B' : 'A')
//                           .map(String::valueOf)
//                           .collect(Collectors.joining());
//        return s.contains(pat) ? 1 : 0;

        myString = myString.replace("A", "a").replace("B", "A").replace("a", "B");
        return myString.contains(pat) ? 1 : 0;
    }
}
