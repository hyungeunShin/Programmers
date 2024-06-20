package com.programmers.level0.p2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 수열과구간쿼리2 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0,4,2}, {0,3,2}, {0,2,2}};

        System.out.println(Arrays.toString(solution(arr, queries)));
    }

    public static int[] solution(int[] arr, int[][] queries) {
//        int[] answer = new int[queries.length];
//
//        for(int i = 0; i < queries.length; i++) {
//            int[] q = queries[i];
//            answer[i] = Arrays.stream(Arrays.copyOfRange(arr, q[0], q[1] + 1)).filter(n -> n > q[2]).min().orElse(-1);
//        }
//
//        return answer;

        return Arrays.stream(queries)
                     .mapToInt(query -> IntStream.rangeClosed(query[0], query[1])
                                                 .map(i -> arr[i])
                                                 .filter(i -> i > query[2])
                                                 .min().orElse(-1))
                     .toArray();
    }
}
