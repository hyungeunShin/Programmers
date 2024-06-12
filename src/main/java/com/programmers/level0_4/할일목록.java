package com.programmers.level0_4;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 할일목록 {
    public static void main(String[] args) {
        String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished = {true, false, true, false};

        System.out.println(Arrays.toString(solution(todo_list, finished)));
    }

    public static String[] solution(String[] todo_list, boolean[] finished) {
//        return IntStream.range(0, todo_list.length)
//                        .filter(i -> !finished[i])
//                        .mapToObj(i -> todo_list[i])
//                        .toArray(String[]::new);

        String str = "";
        for(int i=0; i<finished.length; i++){
            str = !finished[i] ? str + todo_list[i] + "," : str;
        }
        return str.split(",");
    }
}
