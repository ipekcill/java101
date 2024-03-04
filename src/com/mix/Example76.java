package com.mix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example76 {//Array içindeki tekrar etmeyen sayılar

    public static Map<Integer, Integer> findRepetitiveCount(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        return map;
    }

    public static List<Integer> nonRepetitives(Map<Integer, Integer> map) {
        List<Integer> nonRepetitvesList=new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()==1){
                nonRepetitvesList.add(entry.getKey());
            }
        }
        return nonRepetitvesList;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 5, 5};
        Map<Integer,Integer> repetitiveMap=findRepetitiveCount(arr);
        System.out.println(nonRepetitives(repetitiveMap));


    }
}
