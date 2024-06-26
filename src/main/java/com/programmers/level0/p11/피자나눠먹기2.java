package com.programmers.level0.p11;

public class 피자나눠먹기2 {
    public static void main(String[] args) {
        System.out.println(solution(6));
        System.out.println(solution(10));
        System.out.println(solution(4));
    }

    public static int solution(int n) {
        int answer = 6;
        while(answer % n != 0) {
            answer += 6;
        }
        return answer / 6;
    }
}
