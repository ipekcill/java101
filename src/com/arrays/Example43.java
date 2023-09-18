package com.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example43 {

    public static void main(String[] args) {

        int[] arr = {4, -5, 2, -3, 1, 8};
        int sum = 0;
        int min = 1000;
        int e1 = 0, e2 = 0;
        Map<Integer, List<Integer>> hashMap = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                sum = arr[i] + arr[j];
                sum = Math.abs(sum);

                if (sum <= min) {
                    min = sum;
                    e1 = arr[i];
                    e2 = arr[j];
                }
            }
        }

        list.add(e1);
        list.add(e2);
        hashMap.put(min, list);
        for (Map.Entry<Integer, List<Integer>> entry : hashMap.entrySet()) {
            Integer anahtar = entry.getKey();
            List<Integer> degerListesi = entry.getValue();
            System.out.println("Anahtar: " + anahtar + ", Değer: " + degerListesi);
        }
    }

}




