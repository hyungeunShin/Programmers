package com.programmers.level0.p4;

public class n보다커질때까지더하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {34, 5, 71, 29, 100, 34}, 123));
        System.out.println(solution(new int[] {58, 44, 27, 10, 100}, 139));
    }

    public static int solution(int[] numbers, int n) {
        int answer = 0;
        for(int i = 0; answer <= n; i++) {
            answer += numbers[i];
        }
        return answer;
    }
}
