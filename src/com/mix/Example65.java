package com.mix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//Bir dizideki sayıların indexlerini veren algoritma
public class Example65 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 5, 3};
        Map<Integer, List<Integer>> numberIndicesMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (!numberIndicesMap.containsKey(arr[i])) {
                numberIndicesMap.put(arr[i], new ArrayList<>());
            }
            numberIndicesMap.get(arr[i]).add(i);
        }
        for (Map.Entry<Integer, List<Integer>> entry : numberIndicesMap.entrySet()) {
            int number = entry.getKey();
            List<Integer> indices = entry.getValue();

            if (indices.size() > 1) {
                System.out.println("Number: " + number + ", First and last indices of number " + indices);
            }
            if (indices.size() == 1) {
                System.out.println("Number " + number + ", : First and list indices of number " + indices);
            }
        }
    }
}

