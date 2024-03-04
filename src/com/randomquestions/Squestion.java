package com.randomquestions;

import java.util.HashMap;
import java.util.Map;

public class Squestion {
    public static String findSubstring(String[] strArr) {
        Map<String, Integer> subsLengthMap = new HashMap<>();
        String mainWord = strArr[0];

        Map<Character, Integer> wordCountMap = findRepetitiveNumbers(strArr[1]);
        Map<Character, Integer> subWordCountMap;

        for (int i = 0; i < mainWord.length(); i++) {
            for (int j = i + 1; j <= mainWord.length(); j++) {
                String sub = mainWord.substring(i, j);

                subWordCountMap = findRepetitiveNumbers(sub);
                if (isSubMap(subWordCountMap, wordCountMap)) {
                    subsLengthMap.put(sub, sub.length());
                }

            }
        }
        int min = Integer.MAX_VALUE;

        String result = null;
        for (Map.Entry<String, Integer> entry : subsLengthMap.entrySet()) {
            if (entry.getValue() < min) {
                min = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }

    public static Map<Character, Integer> findRepetitiveNumbers(String word) {
        Map<Character, Integer> repetitives = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!repetitives.containsKey(c)) {
                repetitives.put(c, 1);
            } else {
                repetitives.put(c, repetitives.get(c) + 1);
            }
        }
        return repetitives;
    }

    public static boolean isSubMap(Map<Character, Integer> subMap, Map<Character, Integer> superMap) {
        for (Map.Entry<Character, Integer> entry : superMap.entrySet()) {
            if (!subMap.containsKey(entry.getKey()) || subMap.get(entry.getKey()) < entry.getValue()) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        String[] strArr = {"ahffaksfajeeubsne", "jefaa" };

        String resultString = findSubstring(strArr);
        System.out.println(resultString);
    }
}
