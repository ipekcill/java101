package com.interview;

import java.util.*;

public class Question31 {
    public static void main(String[] args) {
        int[] arr = {0, 5, 2, 3, 4};
        int target = 5;
        Map<Integer, Integer> map = new HashMap<>();
        List<int[] > list = new ArrayList<>();
        for (int i = 0; i<arr.length; i++){
            int complement = target - arr[i];
            map.put(arr[i], i);
            if (map.containsKey(complement)){
                int[] array = {map.get(complement), i};
                list.add(array);
            }
        }
        for ( int [] items  : list) {
            //System.out.println("Indices are: " + items[0] + " and " + items[1]);
            System.out.println(Arrays.toString(items));
        }
    }
}
