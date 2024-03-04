package com.mix;

import java.util.HashMap;
import java.util.Map;

public class Example75 {
    public static Map<Integer, Integer> findRepeatingNumbersAndRepetitions(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }

        }
        return map;
    }

    public static Map<Integer, Integer> repeatingNumbersAndRepetitions(Map<Integer, Integer> map) {
        Map<Integer,Integer> newMap=new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()>1){
                newMap.put(entry.getKey(), entry.getValue());
            }
        }
        return newMap;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 4, 4, 5, 5, 5, 5, 5};
        Map<Integer,Integer> m=findRepeatingNumbersAndRepetitions(arr);
        Map<Integer,Integer> mm=repeatingNumbersAndRepetitions(m);
        System.out.println(mm);
    }
}
