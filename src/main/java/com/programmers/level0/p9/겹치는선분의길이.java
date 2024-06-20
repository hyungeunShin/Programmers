package com.programmers.level0.p9;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 겹치는선분의길이 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][] {{0, 1}, {2, 5}, {3, 9}}));
        System.out.println(solution(new int[][] {{-1, 1}, {1, 3}, {3, 9}}));
        System.out.println(solution(new int[][] {{0, 5}, {3, 9}, {1, 10}}));
    }

    public static int solution(int[][] lines) {
//        int[] arr = new int[200];
//        for(int[] line : lines) {
//            for(int i = (line[0] + 100); i < (line[1] + 100); i++) {
//                arr[i]++;
//            }
//        }
//
//        return (int) Arrays.stream(arr).filter(n -> n > 1).count();

        Map<Integer, Integer> map = new HashMap<>();
        for(int[] line : lines) {
            for(int i = line[0]; i < line[1]; i++) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }
        return (int) map.entrySet().stream().filter(e -> e.getValue() >= 2).count();
    }
}
