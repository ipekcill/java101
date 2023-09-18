package com.arrays;

import java.util.HashMap;
import java.util.Map;
//Q5 bir stringte en çok tekrar eden harf ve tekrar sayısı
public class Example34 {
    public static void main(String[] args) {
        String s = "axbbdfcccckkklm";
        int max = 0;
        String maxLetter = "";
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            String ch = s.substring(i, i + 1);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }

        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                maxLetter = entry.getKey();
                max = entry.getValue();
            }

        }
        System.out.println(maxLetter + ":" + max);
    }
}
