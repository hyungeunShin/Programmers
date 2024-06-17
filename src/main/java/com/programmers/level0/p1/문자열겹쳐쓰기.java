package com.programmers.level0.p1;

public class 문자열겹쳐쓰기 {
    public static void main(String[] args) {
        System.out.println(solution("He11oWor1d", "lloWorl", 2));
        System.out.println(solution("Program29b8UYP", "merS123", 7));
    }

    public static String solution(String my_string, String overwrite_string, int s) {
        String first = my_string.substring(0, s);
        String end = my_string.substring(s + overwrite_string.length());
        return first + overwrite_string + end;
    }
}
