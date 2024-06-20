package com.programmers.level0.p9;

import java.util.Arrays;
import java.util.Comparator;

public class 직사각형의넓이구하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][] {{1,1}, {2,1}, {2,2}, {1,2}}));
        System.out.println(solution(new int[][] {{-1,-1}, {1,1}, {1,-1}, {-1,1}}));
    }

    public static int solution(int[][] dots) {
//        int maxX = Arrays.stream(dots).mapToInt(dot -> dot[0]).max().orElse(0);
//        int minX = Arrays.stream(dots).mapToInt(dot -> dot[0]).min().orElse(0);
//
//        int maxY = Arrays.stream(dots).mapToInt(dot -> dot[1]).max().orElse(0);
//        int minY = Arrays.stream(dots).mapToInt(dot -> dot[1]).min().orElse(0);
//
//        return (maxX - minX) * (maxY - minY);

        Arrays.sort(dots, Comparator.comparing((int[] it)-> it[0]).thenComparing((int[] it)->it[1]));
        return (dots[3][0] - dots[0][0]) * (dots[3][1] - dots[0][1]);
    }
}
