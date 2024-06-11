package com.programmers.level0_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 마지막두원소 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 6})));
        System.out.println(Arrays.toString(solution(new int[]{5, 2, 1, 7, 5})));
    }

    public static int[] solution(int[] num_list) {
        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());

        int a = list.get(list.size() - 1);
        int b = list.get(list.size() - 2);

        list.add(a > b ? a - b : a * 2);

        return list.stream().mapToInt(n -> n).toArray();
    }
}
