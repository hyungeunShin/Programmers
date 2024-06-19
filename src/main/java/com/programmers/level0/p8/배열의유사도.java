package com.programmers.level0.p8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 배열의유사도 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"}));
        System.out.println(solution(new String[]{"n", "omg"}, new String[]{"m", "dot"}));
    }

    public static int solution(String[] s1, String[] s2) {
//        int answer = 0;
//        for(String a : s1) {
//            for(String b : s2) {
//                if(a.equals(b)) {
//                    answer++;
//                }
//            }
//        }
//        return answer;

        Set<String> set = new HashSet<>(Arrays.asList(s1));
        return (int) Arrays.stream(s2).filter(set::contains).count();
    }
}
