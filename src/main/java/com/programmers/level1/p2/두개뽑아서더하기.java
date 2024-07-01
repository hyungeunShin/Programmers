package com.programmers.level1.p2;

import java.util.*;

public class 두개뽑아서더하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {2, 1, 3, 4, 1})));
        System.out.println(Arrays.toString(solution(new int[] {5, 0, 2, 7})));
    }

    public static int[] solution(int[] numbers) {
        Set<Integer> set = new TreeSet<>();
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
