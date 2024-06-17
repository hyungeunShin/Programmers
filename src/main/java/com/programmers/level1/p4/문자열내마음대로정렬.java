package com.programmers.level1.p4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class 문자열내마음대로정렬 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"sun", "bed", "car"}, 1)));
        System.out.println(Arrays.toString(solution(new String[]{"abce", "abcd", "cdx"}, 2)));
    }

    public static String[] solution(String[] strings, int n) {
//        List<String> arr = new ArrayList<>();
//        for(String s : strings) {
//            arr.add(s.charAt(n) + s);
//        }
//        return arr.stream().sorted().map(s -> s.substring(1)).toArray(String[]::new);

        Arrays.sort(strings, (s1, s2) -> {
            if(s1.charAt(n) > s2.charAt(n)) {
                return 1;
            } else if(s1.charAt(n) == s2.charAt(n)) {
                return s1.compareTo(s2);
            } else if(s1.charAt(n) < s2.charAt(n)) {
                return -1;
            } else {
                return 0;
            }
        });
        return strings;
    }
}
