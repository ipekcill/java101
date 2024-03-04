package com.interview;

import java.util.*;

public class Question24 {  // array içindeki sayılardan farkları target değerine eşit olan sayıların indislerini döndüren algoritma
    public static void main(String[] args) {
        int target = 2;
        int[] arr = {1, 4, 3, 2, 5, 6, 8};
        Map<Integer, Integer> numbersMap = new HashMap<>();
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int c = arr[i] - target;
            int m = arr[i] + target;
            if (numbersMap.containsKey(c)) {
                int[] array = {numbersMap.get(c), i};
                list.add(array);
            }
            if (numbersMap.containsKey(m)) {
                int[] ar = {numbersMap.get(m), i};
                list.add(ar);
            }
            numbersMap.put(arr[i], i);
        }
        for (int[] items : list) {
            System.out.println((Arrays.toString(items)));
        }
    }
}
