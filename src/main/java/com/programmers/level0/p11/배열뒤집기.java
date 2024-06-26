package com.programmers.level0.p11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class 배열뒤집기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution(new int[] {1, 1, 1, 1, 1, 2})));
        System.out.println(Arrays.toString(solution(new int[] {1, 0, 1, 1, 1, 3, 5})));
    }

    public static int[] solution(int[] num_list) {
//        List<Integer> collect = Arrays.stream(num_list).boxed().collect(Collectors.toList());
//        Collections.reverse(collect);
//        return collect.stream().mapToInt(Integer::intValue).toArray();

        return IntStream.rangeClosed(1, num_list.length)
                        .map(i -> num_list[num_list.length - i])
                        .toArray();
    }
}
