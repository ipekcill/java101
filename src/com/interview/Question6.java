package com.interview;

import java.util.HashMap;
import java.util.Map;

public class Question6 { // stringteki en çok tekrar edeni veren algoritma
    public static void main(String[] args) {
        String word = "aaabbcbbbadd";
        Map<Character, Integer> charMap = new HashMap<>();
        int mostFrequentNumberOfChar = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!charMap.containsKey(ch)) {
                charMap.put(word.charAt(i), 1);
            } else {
                charMap.put(ch, charMap.get(ch) + 1);
            }
        }

        char mostFrequentChar = ' ';
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() > mostFrequentNumberOfChar) {
                mostFrequentNumberOfChar = entry.getValue();
                mostFrequentChar = entry.getKey();
            }
        }
        System.out.println(mostFrequentChar + " is the most recurring character and the number of repetition: " + mostFrequentNumberOfChar);
    }
}
