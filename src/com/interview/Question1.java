package com.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question1 { // arraydeki sayılardan tekrar etmeyenleri veren algoritma
    public static List<Integer> findNonDuplicateNumber(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                list.add(entry.getKey());
            }

        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {124, 2, 86, 86, 5, 6, 124, 323, 2, 323};
        System.out.println(findNonDuplicateNumber(arr));
    }
}
