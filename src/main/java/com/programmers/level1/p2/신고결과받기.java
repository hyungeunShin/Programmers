package com.programmers.level1.p2;

import java.util.*;
import java.util.stream.Collectors;

public class 신고결과받기 {
    public static void main(String[] args) {
        String[] id_list1 = {"muzi", "frodo", "apeach", "neo"};
        String[] report1 = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        String[] id_list2 = {"con", "ryan"};
        String[] report2 = {"ryan con", "ryan con", "ryan con", "ryan con"};
        System.out.println(Arrays.toString(solution(id_list1, report1, 2)));
        System.out.println(Arrays.toString(solution(id_list2, report2, 3)));
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
//        Set<String> set = new HashSet<>();
//
//        Collections.addAll(set, report);
//
//        Map<String, Integer> map = new HashMap<>();
//        for(String s : set) {
//            String from = s.split(" ")[1];
//            map.put(from, map.getOrDefault(from, 0) + 1);
//        }
//
//        int[] answer = new int[id_list.length];
//        List<String> list = List.of(id_list);
//        for(String s : set) {
//            String to = s.split(" ")[0];
//            String from = s.split(" ")[1];
//            if(map.get(from) >= k) {
//                int i = list.indexOf(to);
//                answer[i]++;
//            }
//        }
//
//        return answer;

        List<String> list = Arrays.stream(report).distinct().collect(Collectors.toList());
        HashMap<String, Integer> count = new HashMap<>();
        for(String s : list) {
            String target = s.split(" ")[1];
            count.put(target, count.getOrDefault(target, 0) + 1);
        }

        return Arrays.stream(id_list).map(_user -> {
            final String user = _user;
            List<String> reportList = list.stream().filter(s -> s.startsWith(user + " ")).collect(Collectors.toList());
            return reportList.stream().filter(s -> count.getOrDefault(s.split(" ")[1], 0) >= k).count();
        }).mapToInt(Long::intValue).toArray();
    }
}
