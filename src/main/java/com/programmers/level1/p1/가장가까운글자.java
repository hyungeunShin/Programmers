package com.programmers.level1.p1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 가장가까운글자 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("banana")));
        System.out.println(Arrays.toString(solution("foobar")));
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];

        Map<Character, Integer> map = new HashMap<>();

//        for(int i = 0; i < s.length(); i++) {
//            if(!map.containsKey(s.charAt(i))) {
//                answer[i] = -1;
//                map.put(s.charAt(i), i);
//            } else {
//                answer[i] = i - map.get(s.charAt(i));
//                map.put(s.charAt(i), i);
//            }
//        }

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            answer[i] = i - map.getOrDefault(c, i + 1);
            map.put(c, i);
        }

        return answer;
    }
}
