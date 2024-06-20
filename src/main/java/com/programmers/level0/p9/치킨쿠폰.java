package com.programmers.level0.p9;

public class 치킨쿠폰 {
    public static void main(String[] args) {
        System.out.println(solution(100));
        System.out.println(solution(1081));
    }

    public static int solution(int chicken) {
        int answer = 0;
        while(chicken >= 10) {
            int service = chicken / 10;
            answer += service;

            int coupon = chicken % 10;

            chicken = service + coupon;
        }
        return answer;
    }
}
