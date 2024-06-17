package com.programmers.level0.p4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class two의영역 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 1, 4, 5, 2, 9})));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 1})));
        System.out.println(Arrays.toString(solution(new int[]{1, 1, 1})));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 1, 2, 1, 10, 2, 1})));

        System.out.println(solution2(new int[]{1, 2, 1, 4, 5, 2, 9}));
        System.out.println(solution2(new int[]{1, 2, 1}));
        System.out.println(solution2(new int[]{1, 1, 1}));
        System.out.println(solution2(new int[]{1, 2, 1, 2, 1, 10, 2, 1}));
    }

    public static int[] solution(int[] arr) {
        int s = IntStream.range(0, arr.length).filter(i -> arr[i] == 2).min().orElse(-1);
        int e = IntStream.range(0, arr.length).filter(i -> arr[i] == 2).max().orElse(-1);

        return s == -1 ? new int[] {-1} : Arrays.copyOfRange(arr, s, e + 1);
    }

    public static List<Integer> solution2(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        return list.contains(2) ? list.subList(list.indexOf(2), list.lastIndexOf(2) + 1) : List.of(-1);
    }
}
