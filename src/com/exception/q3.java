package com.exception;

public class q3 {
    public static String StringChallenge(String str) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                result.append(count).append(str.charAt(i));
                count = 1;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(StringChallenge("aabbcde"));
    }
}
