package com.programmers.level0.p5;

public class 문자열이몇번등장하는지 {
    public static void main(String[] args) {
        System.out.println(solution("banana", "ana"));
        System.out.println(solution("aaaa", "aa"));
    }

    public static int solution(String myString, String pat) {
//        int idx = 0;
//        int answer = 0;
//
//        while((idx = myString.indexOf(pat, idx)) != -1) {
//            idx += 1;
//            answer++;
//        }
//        return answer;

//        int cnt = 0;
//        for(int i = 0; i < myString.length(); i++) {
//            if(myString.substring(i).startsWith(pat)) {
//                cnt++;
//            }
//        }
//        return cnt;

        int idx = myString.indexOf(pat);
        return idx == -1 ? 0 : (1 + solution(myString.substring(idx + 1), pat));
    }
}
