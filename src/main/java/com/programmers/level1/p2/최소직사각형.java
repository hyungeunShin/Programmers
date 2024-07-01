package com.programmers.level1.p2;

public class 최소직사각형 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][] {{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
        System.out.println(solution(new int[][] {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}}));
        System.out.println(solution(new int[][] {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}}));
    }

    public static int solution(int[][] sizes) {
        int wMax  = 0;
        int hMax = 0;

        for(int[] size : sizes) {
            int w = Math.max(size[0], size[1]);
            int h = Math.min(size[0], size[1]);

            wMax = Math.max(wMax, w);
            hMax = Math.max(hMax, h);
        }
        return wMax * hMax;
    }
}
