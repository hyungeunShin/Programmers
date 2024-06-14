package com.programmers.level0_4;

public class 글자지우기 {
    public static void main(String[] args) {
        System.out.println(solution("apporoograpemmemprs", new int[] {1, 16, 6, 15, 0, 10, 11, 3}));
    }

    public static String solution(String my_string, int[] indices) {
//        StringBuilder sb = new StringBuilder(my_string);
//
//        for(int i : indices) {
//            sb.setCharAt(i, ' ');
//        }
//
//        return sb.toString().replace(" ", "");

        String[] str = my_string.split("");
        for(int index : indices) {
            str[index] = "";
        }
        return String.join("", str);
    }
}
