package com.programmers.level0.p9;

public class 저주의숫자 {
    public static void main(String[] args) {
        System.out.println(solution(15));
        System.out.println(solution(40));
    }

    public static int solution(int n) {
        int answer = 0;
//        int cnt = 0;
//        while(cnt != n) {
//            answer++;
//            if(answer % 3 != 0 && !String.valueOf(answer).contains("3")) {
//                cnt++;
//            }
//        }

//        for(int i = 0; i < n; i++) {
//            answer++;
//            if(answer % 3 == 0 || String.valueOf(answer).contains("3")) {
//                i--;
//            }
//        }

        for(int i = 0; i < n; i++) {
            answer++;
            while(answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                answer++;
            }
        }

        return answer;
    }
}
