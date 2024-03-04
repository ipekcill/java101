package com.randomquestions;

import java.util.HashMap;

public class SubstringQuestion {
    public static String MinWindowSubstring(String[] strArr) {
        String s1 = strArr[0];
        String s2 = strArr[1];

        String result = "";
        int min = 100;
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j <= s1.length(); j++) {
                String s = s1.substring(i, j);
                if (containsAll(s, s2)) {
                    if (s.length() < min) {
                        min = s.length();
                        result = s;

                    }
                }
            }
        }
        return result;
    }

    public static boolean containsAll(String s1, String s2) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (!hmap.containsKey(c)) {
                hmap.put(c, 1);
            } else {
                hmap.put(c, hmap.get(c) + 1);
            }
        }

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (hmap.containsKey(c)) {
                hmap.put(c, hmap.get(c) - 1);
            }
        }
        for (char k : hmap.keySet()) {
            if (hmap.get(k) > 0) {
                return false;
            }
        }
        return true;
    }



/*    public static boolean containsAllLetters (String string, String target) {
        for (char c : target.toCharArray()) {
            if (string.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }*/


    public static void main(String[] args) {
        String[] str = {"ahffaksfajeeubsne", "jefaa"};
        System.out.println(MinWindowSubstring(str));


    }
}



