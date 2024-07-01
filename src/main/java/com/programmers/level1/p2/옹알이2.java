package com.programmers.level1.p2;

public class 옹알이2 {
    public static void main(String[] args) {
        System.out.println(solution(new String[] {"aya", "yee", "u", "maa"}));
        System.out.println(solution(new String[] {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}));
    }

    public static int solution(String[] babbling) {
        String[] arr = {"aya", "ye", "woo", "ma"};

        int answer = 0;

        for(String b : babbling) {
            if(b.contains("ayaaya") || b.contains("yeye") || b.contains("woowoo") || b.contains("mama")) {
                continue;
            }

            for(String a : arr) {
                b = b.replace(a, " ");
            }

            if(b.replace(" ","").isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}
