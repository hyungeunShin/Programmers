package com.programmers.level0.p10;

public class 주사위의개수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1,1,1}, 1));
        System.out.println(solution(new int[] {10,8,6}, 3));
    }

    public static int solution(int[] box, int n) {
        return (box[0] / n) * (box[1] / n) * (box[2] / n);
    }
}
