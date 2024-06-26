package com.programmers.level0.p11;

import java.util.*;
import java.util.stream.Collectors;

public class 최빈값구하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 2, 3, 3, 3, 4}));
        System.out.println(solution(new int[] {1, 1, 2, 2}));
        System.out.println(solution(new int[] {1}));
    }

    public static int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : array) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        Integer i = map.values().stream().max(Comparator.comparingInt(o -> o)).orElse(0);
        List<Integer> list = map.entrySet().stream().filter(e -> e.getValue() == i).map(Map.Entry::getKey).collect(Collectors.toList());

        return list.size() > 1 ? -1 : list.get(0);
    }
}
