package com.programmers.level0.p10;

public class 숨어있는숫자의덧셈1 {
    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));
        System.out.println(solution("1a2b3c4d123"));
    }

    public static int solution(String my_string) {
        return my_string.chars()
                        .filter(Character::isDigit)
                        .mapToObj(c -> String.valueOf((char) c))
                        .mapToInt(Integer::parseInt)
                        .sum();
    }
}
