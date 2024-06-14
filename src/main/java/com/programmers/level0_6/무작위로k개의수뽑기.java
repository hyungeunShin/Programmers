package com.programmers.level0_6;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 무작위로k개의수뽑기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 1, 2, 2, 3}, 3)));
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 1, 1, 1}, 4)));
    }

    public static int[] solution(int[] arr, int k) {
//        int[] array = Arrays.stream(arr).distinct().limit(k).toArray();
//
//        int[] answer = new int[k];
//        Arrays.fill(answer, -1);
//
//        System.arraycopy(array, 0, answer, 0, array.length);
//        return answer;

        return IntStream.concat(Arrays.stream(arr).distinct(), IntStream.range(0, k).map(i -> -1))
                        .limit(k)
                        .toArray();
    }
}
