package com.programmers.level0_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class 콜라츠수열만들기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10)));
    }

    public static int[] solution(int n) {
//        List<Integer> list = new ArrayList<>();
//        list.add(n);
//        while(n != 1) {
//            if(n % 2 == 0) {
//                n /= 2;
//            } else {
//                n = n * 3 + 1;
//            }
//            list.add(n);
//        }
//        return list.stream().mapToInt(x -> x).toArray();
        return Stream.iterate(n, i -> i >= 1, i -> i == 1 ? 0 : (i % 2 == 0 ? i / 2 : 3 * i + 1)).mapToInt(Integer::intValue).toArray();
    }
}
