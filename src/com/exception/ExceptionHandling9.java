package com.exception;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExceptionHandling9 {
    public static List<int[]> findIndices(int[] arr, int target) throws NullPointerException {
        Map<Integer, Integer> indices = new HashMap<>();
        List<int[]> indicesList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (!indices.containsKey(complement)) {
                indices.put(arr[i], i);
            } else {
                int[] array = {indices.get(complement), i};
                indicesList.add(array);

            }
        }
        if( indicesList.isEmpty()){
            throw new NullPointerException("can not found");
        }
        return indicesList;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        int target = 5;
        try {
            List<int[]> list = findIndices(arr, target);
            for (int[] items : list) {
                System.out.println("Indices: " + items[0] + " and " + items[1]);
            }
        }catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
