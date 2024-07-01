package com.programmers.level1.p2;

public class 나머지가1이되는수 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(12));
    }

    public static int solution(int n) {
        int x = 0;

        for(int i = 1; i < n; i++) {
            if(n % i == 1) {
                x = i;
                break;
            }
        }

        return x;
    }
}
