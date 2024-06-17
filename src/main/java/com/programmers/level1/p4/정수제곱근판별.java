package com.programmers.level1.p4;

public class 정수제곱근판별 {
    public static void main(String[] args) {
        System.out.println(solution(121));
        System.out.println(solution(3));
    }

    public static long solution(long n) {
//        double sqrt = Math.sqrt(n);
//        if(sqrt % 1 == 0) {
//            return (long) Math.pow((int) sqrt + 1, 2);
//        } else {
//            return -1;
//        }

        double i = Math.sqrt(n);
        return Math.floor(i) == i ? (long) Math.pow(i + 1, 2) : -1;
    }
}
