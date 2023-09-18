package com.arrays;

import java.util.HashMap;
import java.util.Map;

// 2 stringteki ortak harflerin indisleri
public class Example45 {

    public static void main(String[] args) {
        String word1 = "kalemlik";
        String word2 = "kelam";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word2.length(); i++) {
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(i);
            if (ch1 == ch2) {
                map.put(ch1, i);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("char: " + entry.getKey() + "; " + " index: " + entry.getValue());
        }
    }
}
