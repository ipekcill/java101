package com.exception;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExceptionHandling10 { //Longest common substring of 2 strings with exception handling
    public static List<String> findSubstrings1(String str1) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            for (int j = i + 1; j <= str1.length(); j++) {
                String sub = str1.substring(i, j);
                list.add(sub);
            }
        }
        return list;
    }

    public static List<String> findCommonSubstrings(List<String> result1, List<String> result2) throws CustomException {
        Set<String> substringsSet = new HashSet<>();
        List<String> commonSubstrings = new ArrayList<>();
        for (String items : result1) {
            substringsSet.add(items);
        }
        for (String items2 : result2) {
            if (!substringsSet.add(items2)) {
                commonSubstrings.add(items2);
            }
        }
        if (commonSubstrings.isEmpty() || commonSubstrings == null){
            throw new CustomException("NO COMMON SUBSTRING");
        }
        return commonSubstrings;
    }

    public static String findLongestCommonSubstring(List<String> result3) {
        String longestSubstring = "";
        for (String items3 : result3) {
            if (items3.length() > longestSubstring.length()) {
                longestSubstring = items3;
            }
        }
        return longestSubstring;
    }


    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "hjklm";
        List<String> result1 = findSubstrings1(str1);
        List<String> result2 = findSubstrings1(str2);
        try {
            List<String> result3 = findCommonSubstrings(result1, result2);
            String longestSubstring = findLongestCommonSubstring(result3);
            System.out.println(longestSubstring);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
