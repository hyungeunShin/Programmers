package com.programmers.level0_2;

public class 코드처리하기 {
    public static void main(String[] args) {
        System.out.println(solution("abc1abc1abc"));
    }

    public static String solution(String code) {
        int mode = 0;
        String answer = "";

//        for(int i = 0; i < code.length(); i++) {
//            char c = code.charAt(i);
//
//            if(c == '1') {
//                if(mode == 0) {
//                    mode = 1;
//                } else {
//                    mode = 0;
//                }
//            } else {
//                if(mode == 0) {
//                    if(i % 2 == 0) {
//                        ret += c;
//                    }
//                } else {
//                    if(i % 2 != 0) {
//                        ret += c;
//                    }
//                }
//            }
//        }

        for(int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if(c == '1') {
                mode = mode == 0 ? 1 : 0;
                continue;
            }

            if(i % 2 == mode) {
                answer += (c);
            }
        }

        return answer.isEmpty() ? "EMPTY" : answer;
    }
}
