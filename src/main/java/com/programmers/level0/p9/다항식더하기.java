package com.programmers.level0.p9;

public class 다항식더하기 {
    public static void main(String[] args) {
        System.out.println(solution("3x + 7 + x"));
        System.out.println(solution("x + x + x"));
    }

    public static String solution(String polynomial) {
        int x = 0;
        int n = 0;
        for(String s : polynomial.split(" ")) {
            if(s.contains("x")) {
                x += "x".equals(s) ? 1 : Integer.parseInt(s.replace("x", ""));
            } else if(!"+".equals(s)) {
                n += Integer.parseInt(s);
            }
        }

        String answer = "";
        if(x != 0) {
            answer += x > 1 ? x + "x" : "x";
        }
        if(x != 0 && n != 0) {
            answer += " + ";
        }
        if(n != 0) {
            answer += n;
        }
        return answer;
    }
}
