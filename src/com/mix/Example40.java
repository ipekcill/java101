package com.mix;

import java.util.HashMap;
import java.util.Map;
//String içindeki en çok tekrar eden ve tekrar sayısını metot ile bulma
public class Example40 {


    static Map<Character, Integer> createCharacterMap(String word) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        return map;
    }

    static String getName(String name) {
        return name + "oNUR";
    }

    static Character findMostRepeatableCharInString(Map<Character, Integer> map) {
        int max = 0;
        Character character = null;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                character = entry.getKey();
                max = entry.getValue();
            }
        }
        return character;
    }

    public static void main(String[] args) {
        Map<Character, Integer> map2 = createCharacterMap("abbccabbbbtg");
        System.out.println(findMostRepeatableCharInString(map2));
        // System.out.println(findMostRepeatableCharInString(createCharacterMap("abbccabbbbtg")));

        String name = getName("ipek");
        System.out.println(name);
    }
}
