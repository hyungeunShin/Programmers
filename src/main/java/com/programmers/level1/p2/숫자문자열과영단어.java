package com.programmers.level1.p2;

public class 숫자문자열과영단어 {
    public static void main(String[] args) {
        System.out.println(solution("one4seveneight"));
        System.out.println(solution("23four5six7"));
        System.out.println(solution("123"));
    }

    public static int solution(String s) {
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i = 0; i <= 9; i++) {
            s = s.replace(arr[i], String.valueOf(i));
        }

//        s = s.replace("zero",  "0");
//        s = s.replace("one",   "1");
//        s = s.replace("two",   "2");
//        s = s.replace("three", "3");
//        s = s.replace("four",  "4");
//        s = s.replace("five",  "5");
//        s = s.replace("six",   "6");
//        s = s.replace("seven", "7");
//        s = s.replace("eight", "8");
//        s = s.replace("nine",  "9");

        return Integer.parseInt(s);
    }
}
