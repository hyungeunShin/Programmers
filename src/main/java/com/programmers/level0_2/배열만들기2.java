package com.programmers.level0_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class 배열만들기2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, 555)));
        System.out.println(Arrays.toString(solution(10, 20)));
    }

    public static int[] solution(int l, int r) {
//        int[] array = IntStream.rangeClosed(l, r)
//                               .filter(o -> String.valueOf(o).matches("[05]+"))
//                               .toArray();
//
//        return array.length == 0 ? new int[] {-1} : array;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i < 64; i++) {
            int num = Integer.parseInt(Integer.toBinaryString(i)) * 5;
            if(l <= num && num <= r) {
                list.add(num);
            }
        }

        return list.isEmpty() ? new int[] {-1} : list.stream().mapToInt(i -> i).toArray();
    }
}
