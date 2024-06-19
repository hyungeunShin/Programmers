package com.programmers.level0.p8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class 약수구하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(24)));
        System.out.println(Arrays.toString(solution(29)));
    }

    public static int[] solution(int n) {
//        List<Integer> list = new ArrayList<>();
//
//        for(int i = 1; i <= n; i++) {
//            if(n % i == 0) {
//                list.add(i);
//            }
//        }
//        return list.stream().mapToInt(Integer::intValue).toArray();

        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).toArray();
    }
}
