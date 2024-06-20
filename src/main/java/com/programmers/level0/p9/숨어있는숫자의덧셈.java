package com.programmers.level0.p9;

import java.util.Arrays;

public class 숨어있는숫자의덧셈 {
    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));
        System.out.println(solution("1a2b3c4d123Z"));
    }

    public static int solution(String my_string) {
//        my_string = my_string.replaceAll("[^0-9]", " ");
//
//        int answer = 0;
//        for(String s : my_string.trim().split(" ")) {
//            answer += s.isBlank() ? 0 : Integer.parseInt(s);
//        }
//        return answer;

        return Arrays.stream(my_string.split("[A-Z|a-z]"))
                     .filter(s -> !s.isEmpty())
                     .mapToInt(Integer::parseInt)
                     .sum();
    }
}
