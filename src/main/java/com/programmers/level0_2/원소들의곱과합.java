package com.programmers.level0_2;

public class 원소들의곱과합 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {3,4,5,2,1}));
        System.out.println(solution(new int[] {5,7,8,3}));
    }

    public static int solution(int[] num_list) {
        int mul = 1;
        int sum = 0;

        for (int i : num_list) {
            mul *= i;
            sum += i;
        }

        return mul < sum * sum ? 1 : 0;
    }
}
