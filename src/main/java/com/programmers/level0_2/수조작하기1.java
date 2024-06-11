package com.programmers.level0_2;

public class 수조작하기1 {
    public static void main(String[] args) {
        System.out.println(solution(0, "wsdawsdassw"));
    }

    public static int solution(int n, String control) {
        for (char c : control.toCharArray()) {
            if(c == 'w') {
                n += 1;
            } else if(c == 's') {
                n -= 1;
            } else if(c == 'd') {
                n += 10;
            } else {
                n -= 10;
            }
        }

        return n;
    }
}
