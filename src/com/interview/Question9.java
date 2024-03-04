package com.interview;

import java.util.*;

public class Question9 { //2 stringin en uzun alt stringi
    public static List<String> findSubstring(String s1) {
        List<String> subStrings1 = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 2; j <= s1.length(); j++) {
                subStrings1.add(s1.substring(i, j));

            }
        }
        return subStrings1;
    }

    public static List<String> findSubstringOfSecond(String s2) {
        List<String> subStrings2 = new ArrayList<>();
        for (int i = 0; i < s2.length(); i++) {
            for (int j = i + 2; j <= s2.length(); j++) {
                subStrings2.add(s2.substring(i, j));

            }
        }
        return subStrings2;
    }

    public static void findLongestCommonSubString(List<String> l1, List<String> l2) {
        Set<String> l1Set = new HashSet<>();
        List<String> commonSubstrings = new ArrayList<>();
        Map<String, Integer> subStringsAndLengthsMap = new HashMap<>();
        for (String items : l1) {
            l1Set.add(items);
        }

        for (String items : l2) {
            if (!l1Set.add(items)) {
                commonSubstrings.add(items);
            }
        }
        for (String items : commonSubstrings) {
            subStringsAndLengthsMap.put(items, items.length());
        }
        int lengthOfCommonSubString = 0;
        String longestCommonSubString = null;
        for (Map.Entry<String, Integer> entry : subStringsAndLengthsMap.entrySet()) {
            int maxLength = 0;
            if (entry.getValue() > maxLength) {
                lengthOfCommonSubString = entry.getValue();
                longestCommonSubString = entry.getKey();
            }
        }
        System.out.println(lengthOfCommonSubString);
        System.out.println(longestCommonSubString);

    }

    public static void main(String[] args) {
        String s1 = "abcdfgty";
        String s2 = "wbcdfqty";
        List<String> s1Subs = findSubstring(s1);
        List<String> s2Subs = findSubstringOfSecond(s2);
        findLongestCommonSubString(s1Subs, s2Subs);

    }
}
