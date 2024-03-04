package com.mix;

import java.util.HashMap;
import java.util.Map;

// bir dizideki en çok tkerar eden karakterin tekrar sayısını döndüren program
public class Example44 {
    static Map<Character, Integer> map(String s) {
        Map<Character, Integer> m = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (m.containsKey(ch)) {
                m.put(ch, m.get(ch) + 1);
            } else {
                m.put(ch, 1);
            }
        }
        return m;
    }

    static int valueOfMostRepeatedChar(Map<Character, Integer> m) {
        int max = 0;

        for (Map.Entry<Character, Integer> entry : m.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String word = "abbcdaaa";
        Map<Character, Integer> m2 = map(word);
        System.out.println(valueOfMostRepeatedChar(m2));


    }

}
