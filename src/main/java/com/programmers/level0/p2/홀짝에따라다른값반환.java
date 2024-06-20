package com.programmers.level0.p2;

public class 홀짝에따라다른값반환 {
    public static void main(String[] args) {
        System.out.println(solution(7));
        System.out.println(solution(10));
    }

    public static int solution(int n) {
//        if(n % 2 == 0) {
//            return IntStream.rangeClosed(0, n).filter(i -> i % 2 == 0).map(i -> i * i).sum();
//        } else {
//            return IntStream.rangeClosed(0, n).filter(i -> i % 2 != 0).sum();
//        }

        int answer = 0;
        for(int i = n; i >= 0; i -= 2) {
            answer += n % 2 == 0 ? i * i : i;
        }
        return answer;
    }
}
