package com.interview;

import java.util.HashMap;
import java.util.Map;

public class Question7 { // stringteki en az tekrar edeni veren algoritma
    public static Map<Character, Integer> createMap(String string) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            charMap.put(character, charMap.getOrDefault(character, 0) + 1);
        }
        return charMap;
    }

    public static void leastRepeatedChar(Map<Character, Integer> charMap) {
        char leastRepeatedCharacter = '\0';
        int min = 10;
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() < min) {
                min = entry.getValue();
                leastRepeatedCharacter = entry.getKey();
            }
        }
        System.out.println("Least repeated character is: " + leastRepeatedCharacter + " The repeated number of this character is: " + min);

    }

    public static void main(String[] args) {
        String string = "aabbbbcccddffffttt";
        Map<Character, Integer> newMap = createMap(string);
        leastRepeatedChar(newMap);


    }

}

