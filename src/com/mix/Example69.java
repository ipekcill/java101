package com.mix;

import java.util.HashMap;
import java.util.Map;

//String içindeki en az tekrar eden harfi ve tekrar sayısını veren program
public class Example69 {
    public static Map<Character, Integer> createMap(String string) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            if (charMap.containsKey(character)) {
                charMap.put(character, charMap.get(character) + 1);
            } else {
                charMap.put(character, 1);
            }
        }
        return charMap;
    }


    public static void leastRepeatedChar(Map<Character, Integer> charMap) {
        Character leastRepeatedCharacter = null;
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
        String string = "abbcccddfftt";
        Map<Character, Integer> newMap = createMap(string);
        leastRepeatedChar(newMap);


    }
}
