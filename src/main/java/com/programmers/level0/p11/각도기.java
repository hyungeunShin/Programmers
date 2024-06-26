package com.programmers.level0.p11;

public class 각도기 {
    public static void main(String[] args) {
        System.out.println(solution(70));
        System.out.println(solution(91));
        System.out.println(solution(180));
    }

    public static int solution(int angle) {
        if(angle < 90) {
            return 1;
        } else if(angle == 90) {
            return 2;
        } else if(angle < 180) {
            return 3;
        } else {
            return 4;
        }
    }
}
