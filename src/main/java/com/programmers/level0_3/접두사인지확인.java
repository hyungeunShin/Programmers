package com.programmers.level0_3;

public class 접두사인지확인 {
    public static void main(String[] args) {
        System.out.println(solution("banana", "ban"));
        System.out.println(solution("banana", "nan"));
        System.out.println(solution("banana", "abcd"));
        System.out.println(solution("banana", "bananan"));
    }

    public static int solution(String my_string, String is_prefix) {
        return my_string.startsWith(is_prefix) ? 1 : 0;
    }
}
