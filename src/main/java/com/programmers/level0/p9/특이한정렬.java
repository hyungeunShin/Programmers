package com.programmers.level0.p9;

import java.util.Arrays;

public class 특이한정렬 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {1, 2, 3, 4, 5, 6}, 4)));
        System.out.println(Arrays.toString(solution(new int[] {10000,20,36,47,40,6,10,7000}, 30)));
    }

    public static int[] solution(int[] numlist, int n) {
        return Arrays.stream(numlist)
                     .boxed()
                     .sorted((Integer o1, Integer o2) -> {
                         int a = Math.abs(o1 - n);
                         int b = Math.abs(o2 - n);
                         if(a == b) {
                             return o2 - o1;
                         } else {
                             return a - b;
                         }
                     }).mapToInt(i -> i).toArray();
    }
}
