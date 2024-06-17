package com.programmers.level0.p7;

public class 문자열밀기 {
    public static void main(String[] args) {
        System.out.println(solution("hello", "ohell"));
        System.out.println(solution("apple", "elppa"));
        System.out.println(solution("atat", "tata"));
        System.out.println(solution("abc", "abc"));
    }

    public static int solution(String A, String B) {
//        int answer = 0;
//        for(int i = 0; i < A.length(); i++, answer++) {
//            if(A.equals(B)) {
//                return answer;
//            }
//            String s = A.substring(0, A.length() - 1);
//            String e = A.substring(A.length() - 1);
//            A = e + s;
//        }
//        return -1;

        return B.repeat(2).indexOf(A);
    }
}
