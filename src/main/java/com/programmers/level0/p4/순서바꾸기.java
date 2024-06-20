package com.programmers.level0.p4;

import java.util.Arrays;

public class 순서바꾸기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {2, 1, 6}, 1)));
        System.out.println(Arrays.toString(solution(new int[] {5, 2, 1, 7, 5}, 3)));
    }

    public static int[] solution(int[] num_list, int n) {
//        int[] f = Arrays.copyOfRange(num_list, 0, n);
//        int[] e = Arrays.copyOfRange(num_list, n, num_list.length);
//
//        int[] answer = new int[e.length + f.length];
//        System.arraycopy(e, 0, answer, 0, e.length);
//        System.arraycopy(f, 0, answer, e.length, f.length);
//
//        return answer;

        int l = num_list.length;
        int[] answer = new int[l];
        for(int i = 0; i < l; i++) {
            answer[i] = num_list[(i + n) % l];
        }
        return answer;

//        return IntStream.range(0, num_list.length)
//                        .map(i -> num_list[(i + n) % num_list.length])
//                        .toArray();
    }
}
