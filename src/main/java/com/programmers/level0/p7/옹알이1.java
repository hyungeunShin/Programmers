package com.programmers.level0.p7;

public class 옹알이1 {
    public static void main(String[] args) {
        System.out.println(solution(new String[] {"aya", "yee", "u", "maa", "wyeoo"}));
        System.out.println(solution(new String[] {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}));
    }

    public static int solution(String[] babbling) {
        String[] arr = {"aya", "ye", "woo", "ma"};

        int answer = 0;
//        for(String b : babbling) {
//            for(String a : arr) {
//                b = b.replace(a, " ");
//            }
//
//            if(b.replace(" ","").isEmpty()) {
//                answer++;
//            }
//        }

        for(String s : babbling) {
            if(s.matches("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$")) {
                answer++;
            }
        }

        return answer;
    }
}
