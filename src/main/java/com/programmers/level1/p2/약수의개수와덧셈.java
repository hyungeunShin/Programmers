package com.programmers.level1.p2;

public class 약수의개수와덧셈 {
    public static void main(String[] args) {
        System.out.println(solution(13, 17));
        System.out.println(solution(24, 27));
    }

    public static int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++) {
            if(i % Math.sqrt(i) == 0) {
                answer -= i;
            } else {
                answer += i;
            }
        }
        return answer;
    }
}
