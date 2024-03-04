package com.interview;

import java.util.HashMap;
import java.util.Map;

public class Question34 {
    public static void main(String[] args) {
        String str = " Ipek Cil Cilek";
        String strLowerCase = str.toLowerCase();
        String newString = strLowerCase.replaceAll("\\s", "");
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < newString.length(); i++) {
            char ch = newString.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        int max =0;
        Character maxCh = null;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxCh= entry.getKey();
            }
        }

                System.out.println(maxCh + " and " + max);



    }
}
