package com.exception;

import java.util.HashMap;
import java.util.Map;

public class q4 {
    public static String StringChallenge(String str) {
        StringBuilder result = new StringBuilder();
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (!charCountMap.containsKey(currentChar)) {
                charCountMap.put(str.charAt(i), 1);
            } else {
                charCountMap.put(currentChar, charCountMap.get(currentChar) + 1);
            }

            if (i == str.length() - 1 || currentChar != str.charAt(i + 1)) {

                result.append(charCountMap.get(currentChar)).append(currentChar);
                charCountMap.put(currentChar, 0);
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(StringChallenge("wwwbbbw"));
    }
}
