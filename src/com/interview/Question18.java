package com.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question18 { //Array'de toplamları 0'a en yakın olan sayı çiftini döndüren algoritma
    public static void main(String[] args) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int[] arr = {1, -2, 4, 6};
        int min = 1000;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = Math.abs(arr[i] + arr[j]);
                if (sum < min) {
                    min = arr[i] + arr[j];
                    int number1 = arr[i];
                    int number2 = arr[j];
                    list.add(number1);
                    list.add(number2);
                    map.put(min,list);
                }
            }
        }

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            System.out.println("The pair of numbers whose sum is closest to zero is : " + entry.getValue() + " and their sum is : " + entry.getKey());
        }
    }
}
