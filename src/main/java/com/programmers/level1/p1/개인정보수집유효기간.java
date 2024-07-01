package com.programmers.level1.p1;

import java.util.*;

public class 개인정보수집유효기간 {
    public static void main(String[] args) {
        String[] terms1 = {"A 6", "B 12", "C 3"};
        String[] privacies1 = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        String[] terms2 = {"Z 3", "D 5"};
        String[] privacies2 = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};

        System.out.println(Arrays.toString(solution("2022.05.19", terms1, privacies1)));
        System.out.println(Arrays.toString(solution("2020.01.01", terms2, privacies2)));
    }

    public static int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> map = new HashMap<>();
        for(String s : terms) {
            map.put(s.split(" ")[0], Integer.parseInt(s.split(" ")[1]) * 28);
        }

        String[] arr = today.split("\\.");
        int todayDate = (Integer.parseInt(arr[0]) * 28 * 12) + (Integer.parseInt(arr[1]) * 28) + Integer.parseInt(arr[2]);

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < privacies.length; i++) {
            String date = privacies[i].split(" ")[0];
            String type = privacies[i].split(" ")[1];

            String[] arr2 = date.split("\\.");
            int privacyDate = (Integer.parseInt(arr2[0]) * 28 * 12) + (Integer.parseInt(arr2[1]) * 28) + Integer.parseInt(arr2[2]);

            if(todayDate >= privacyDate + map.get(type)) {
                list.add(i + 1);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
