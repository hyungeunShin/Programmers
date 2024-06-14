package com.programmers.level0_5;

import java.util.Arrays;
import java.util.stream.Stream;

public class 배열의원소만큼추가 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{5, 1, 4})));
        System.out.println(Arrays.toString(solution(new int[]{6,6})));
        System.out.println(Arrays.toString(solution(new int[]{1})));
    }

    public static int[] solution(int[] arr) {
//        return Arrays.stream(arr)
//                     .boxed()
//                     .flatMap(n -> IntStream.range(0, n).mapToObj(i -> n))
//                     .mapToInt(Integer::intValue)
//                     .toArray();

        String answer = "";
        for(int i: arr) {
            answer += (i + ",").repeat(i);
        }
        return Stream.of(answer.split(",")).mapToInt(Integer::parseInt).toArray();
    }
}
