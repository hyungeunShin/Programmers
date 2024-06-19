package com.programmers.level0.p8;

public class 숫자찾기 {
    public static void main(String[] args) {
        System.out.println(solution(29183, 1));
        System.out.println(solution(232443, 4));
        System.out.println(solution(123456, 7));
    }

    public static int solution(int num, int k) {
//        int answer = String.valueOf(num).indexOf(String.valueOf(k));
//        return answer == -1 ? -1 : answer + 1;

        return ("!" + num).indexOf(String.valueOf(k));
    }
}
