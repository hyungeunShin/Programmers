package com.programmers.level0.p3;

public class 세로읽기 {
    public static void main(String[] args) {
        System.out.println(solution("ihrhbakrfpndopljhygc", 4, 2));
        System.out.println(solution("programmers", 1, 1));
    }

    public static String solution(String my_string, int m, int c) {
//        return Stream.iterate(c - 1, n -> n + m)
//                     .limit(my_string.length() / m)
//                     .map(i -> String.valueOf(my_string.charAt(i)))
//                     .collect(Collectors.joining());

//        return IntStream.range(0, my_string.length())
//                        .filter(i -> i % m == c - 1)
//                        .mapToObj(i -> String.valueOf(my_string.charAt(i)))
//                        .collect(Collectors.joining());

        String answer = "";
        for(int i = c - 1; i < my_string.length(); i += m) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
}
