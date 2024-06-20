package com.programmers.level0.p8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 가장큰수찾기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {1, 8, 3})));
        System.out.println(Arrays.toString(solution(new int[] {9, 10, 11, 8})));
    }

    public static int[] solution(int[] array) {
        int max = 0;
        int index = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
                index = i;
            }
        }

        return new int[] {max, index};

//        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
//        int max = list.stream().max(Integer::compareTo).orElse(0);
//        int index = list.indexOf(max);
//        return new int[] {max, index};
    }
}
