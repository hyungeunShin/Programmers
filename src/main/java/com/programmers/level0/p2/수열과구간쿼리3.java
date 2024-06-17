package com.programmers.level0.p2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 수열과구간쿼리3 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[][] queries = {{0,3}, {1,2}, {1,4}};

        System.out.println(Arrays.toString(solution(arr, queries)));
    }

    public static int[] solution(int[] arr, int[][] queries) {
//        for(int i = 0; i < queries.length; i++) {
//            int a = arr[queries[i][0]];
//
//            arr[queries[i][0]] = arr[queries[i][1]];
//            arr[queries[i][1]] = a;
//        }
//
//        return arr;

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        for(int[] query : queries) {
            Collections.swap(list, query[0], query[1]);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
