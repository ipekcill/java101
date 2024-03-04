package com.mix;

import java.util.HashMap;
import java.util.Map;

public class Example23 {
    public static void main(String[] args) {
        Map<Integer, Integer> duplicates = new HashMap<>();
        // Tekrar eden sayı:key Tekrar sayısı:value;
        int[] arr = {0, 2, 0, 1, 4, 1, 2, 1}; // 0 :2 kere, 2:2 kere, 1:3 kere, 4:1 kere
        for (int element : arr) {
            if (duplicates.containsKey(element)) {
                duplicates.put(element, duplicates.get(element) + 1);
            } else {
                duplicates.put(element, 1);
            }
        }
        System.out.println(duplicates.values());
        System.out.println(duplicates.keySet());
        System.out.println();
        duplicates.entrySet().forEach(System.out::println); // Java Stream API
        for (Map.Entry<Integer, Integer> entry : duplicates.entrySet()) {
            System.out.println("Anahtar: " + entry.getKey() + ", Değer: " + entry.getValue());
        }
    }
}

