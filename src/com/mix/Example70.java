package com.mix;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Example70 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inputString= "Hello World";
        char userChar = 'l';

        boolean result = isMostFrequentCharEqualToUserChar(inputString, userChar);
        System.out.println("Are the most frequent character and user input same? " + result);
    }

    public static boolean isMostFrequentCharEqualToUserChar(String input, char userChar) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                char lowercaseC = Character.toLowerCase(c);
                charCountMap.put(lowercaseC, charCountMap.getOrDefault(lowercaseC, 0) + 1);
            }
        }

        char mostFrequentChar = ' ';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return Character.toLowerCase(userChar) == mostFrequentChar;
    }
}

