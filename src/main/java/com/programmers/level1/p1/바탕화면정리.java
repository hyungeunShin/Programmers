package com.programmers.level1.p1;

import java.util.Arrays;

public class 바탕화면정리 {
    public static void main(String[] args) {
        String[] wallpaper1 = {".#...", "..#..", "...#."};
        String[] wallpaper2 = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
        String[] wallpaper3 = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
        String[] wallpaper4 = {"..", "#."};
        System.out.println(Arrays.toString(solution(wallpaper1)));
        System.out.println(Arrays.toString(solution(wallpaper2)));
        System.out.println(Arrays.toString(solution(wallpaper3)));
        System.out.println(Arrays.toString(solution(wallpaper4)));
    }

    public static int[] solution(String[] wallpaper) {
//        int lux = 51;
//        int luy = 51;
//        int rdx = 0;
//        int rdy = 0;

        int lux = Integer.MAX_VALUE;
        int luy = Integer.MAX_VALUE;
        int rdx = Integer.MIN_VALUE;
        int rdy = Integer.MIN_VALUE;
        for(int i = 0; i < wallpaper.length; i++) {
            String[] arr = wallpaper[i].split("");
            for(int j = 0; j < arr.length; j++) {
                if("#".equals(arr[j])) {
                    lux = Math.min(lux, i);
                    luy = Math.min(luy, j);
                    rdx = Math.max(rdx, i);
                    rdy = Math.max(rdy, j);
                }
            }
        }

        return new int[] {lux, luy, rdx + 1, rdy + 1};
    }
}
