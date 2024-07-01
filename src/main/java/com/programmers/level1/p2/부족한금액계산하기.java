package com.programmers.level1.p2;

import java.util.stream.LongStream;

public class 부족한금액계산하기 {
    public static void main(String[] args) {
        System.out.println(solution(3, 20, 4));
    }

    public static long solution(int price, int money, int count) {
//        long answer = money - LongStream.rangeClosed(1, count).map(i -> price * i).sum();
//        return answer >= 0 ? 0 : Math.abs(answer);

        //r(n(n+1))/2
        return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }
}
