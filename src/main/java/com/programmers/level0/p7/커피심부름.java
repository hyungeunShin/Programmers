package com.programmers.level0.p7;

public class 커피심부름 {
    public static void main(String[] args) {
        System.out.println(solution(new String[] {"cafelatte", "americanoice", "hotcafelatte", "anything"}));
        System.out.println(solution(new String[] {"americanoice", "americano", "iceamericano"}));
    }

    public static int solution(String[] order) {
        int answer = 0;
        for(String o : order) {
            answer += o.contains("cafelatte") ? 5000 : 4500;
        }
        return answer;
    }
}
