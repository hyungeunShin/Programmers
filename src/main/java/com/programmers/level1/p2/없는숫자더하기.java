package com.programmers.level1.p2;

public class 없는숫자더하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1,2,3,4,6,7,8,0}));
        System.out.println(solution(new int[] {5,8,4,0,6,7,9}));
    }

    public static int solution(int[] numbers) {
        int sum = 45;
        for(int i : numbers) {
            sum -= i;
        }
        return sum;
    }
}
