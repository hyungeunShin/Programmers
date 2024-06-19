package com.programmers.level0.p8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class 한번만등장한문자 {
    public static void main(String[] args) {
        System.out.println(solution("abcabcadc"));
        System.out.println(solution("abdc"));
        System.out.println(solution("hello"));
    }

    public static String solution(String s) {
//        Map<String, Long> map = Arrays.stream(s.split("")).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//
//        return map.entrySet().stream()
//                  .filter(e -> e.getValue() == 1)
//                  .map(Map.Entry::getKey)
//                  .sorted()
//                  .collect(Collectors.joining());

        int[] arr = new int[26];
        for(char c : s.toCharArray()) {
            arr[c - 'a']++;
        }

        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < 26; i++) {
            if(arr[i] == 1) {
                answer.append((char) (i + 'a'));
            }
        }
        return answer.toString();
    }
}
