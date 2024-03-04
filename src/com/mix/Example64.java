package com.mix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example64 {
    public static void main(String[] args) {
        Map<Character, String> phoneMap = new HashMap<>();

        phoneMap.put('1', "1");
        phoneMap.put('0', "0");
        phoneMap.put('2', "abc");
        phoneMap.put('3', "def");
        phoneMap.put('4', "ghi");
        phoneMap.put('5', "jkl");
        phoneMap.put('6', "mno");
        phoneMap.put('7', "pqrs");
        phoneMap.put('8', "tuv");
        phoneMap.put('9', "wxyz");

        String input = "23";

        List<String> wordList = new ArrayList<>();


        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            String word = phoneMap.get(ch);
            wordList.add(word);
        }


        for (int i = 0; i < wordList.size(); i++) {
            for (int j = i + 1; j < wordList.size(); j++) {
                String word1 = wordList.get(i);
                String word2 = wordList.get(j);

                for (int k = 0; k < word1.length(); k++) {
                    for (int l = 0; l < word2.length(); l++) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(word1.charAt(k)).append(word2.charAt(l));
                        System.out.println(sb);
                    }
                }
            }
        }
    }
}
