package com.programmers.level0.p12;

import java.util.Arrays;

public class 분수의덧셈 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(1, 2, 3, 4)));
        System.out.println(Arrays.toString(solution(9, 2, 1, 3)));
    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer  = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;

        int max = 1;
        for(int i = 1; i <= numer && i <= denom; i++) {
            if(numer % i == 0 && denom % i == 0) {
                max = i;
            }
        }
        numer /= max;
        denom /= max;

        return new int[] {numer, denom};
    }
}
