package com.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question25 { // dizideki sayıların indisleri
    public static Map<Integer, List<Integer>> findIndices(int[] arr) {
        Map<Integer, List<Integer>> indicesMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!indicesMap.containsKey(arr[i])) {
                indicesMap.put(arr[i], new ArrayList<>());
            }
            indicesMap.get(arr[i]).add(i);
        }
        return indicesMap;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 3, 4, 3, 5, 4, 5};
        Map<Integer, List<Integer>> map = findIndices(arr);
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " ındices: " + entry.getValue());
        }

    }
}
