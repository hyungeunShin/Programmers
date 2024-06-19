package com.programmers.level0.p8;

import java.util.Arrays;

public class 삼각형의완성조건1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1,2,3}));
        System.out.println(solution(new int[] {3,6,2}));
        System.out.println(solution(new int[] {199,72,222}));
    }

    public static int solution(int[] sides) {
        Arrays.sort(sides);
        return sides[2] < sides[0] + sides[1] ? 1 : 2;
    }
}
