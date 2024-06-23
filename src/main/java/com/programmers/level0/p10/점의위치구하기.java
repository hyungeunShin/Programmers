package com.programmers.level0.p10;

public class 점의위치구하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {2, 4}));
        System.out.println(solution(new int[] {-7, 9}));
    }

    public static int solution(int[] dot) {
        int x = dot[0];
        int y = dot[1];
        if(x > 0 && y > 0) {
            return 1;
        } else if(x < 0 && y > 0) {
            return 2;
        } else if(x < 0 && y < 0) {
            return 3;
        } else {
            return 4;
        }
    }
}
