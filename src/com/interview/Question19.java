package com.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question19 { // array içindeki sayılardan toplamları verilen target değerine eşit olan sayı çiftinin indislerini döndüren algoritma
    public static List<int[]> findIndicesOfTarget(int[] arr, int target) {
        Map<Integer, Integer> indices = new HashMap<>();
        List<int[]> indicesList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (indices.containsKey(complement)) {
                int[] array = {indices.get(complement), i};
                indicesList.add(array);
            }
            indices.put(arr[i], i);
        }
        return indicesList;
    }
    public static void main(String[] args) {
        int[] arr = {0, 5, 2, 3, 4};
        int target = 5;
        List<int[]> list = findIndicesOfTarget(arr, target);
        for (int[] item : list){
            System.out.println(" Indices given target are : " + item[0] + " and "  + item[1]);
        }
    }
}
