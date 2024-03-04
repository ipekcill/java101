package com.randomquestions;

public class UsernameCheck {
    public static String CodelandUsernameValidation(String str) {
        char[] charArr = str.toCharArray();
        for (int i = 1; i < charArr.length - 1; i++) {
            if (isValid(str)) {
                if (Character.isLetter(charArr[0]) && charArr[charArr.length - 1] != '_') {
                    if (Character.isLetterOrDigit(charArr[i]) || isUnderscore(charArr[i])) {
                        return " true";
                    }
                }

            }
        }
        return "false";
    }

    public static boolean isValid(String str) {
        if (str.length() < 4 || str.length() > 25) {
            return false;
        }
        return true;
    }
    private static boolean isUnderscore(char c) {
        return c == '_';
    }


    public static void main(String[] args) {
        String str = "aa_";
        System.out.println(CodelandUsernameValidation(str));
    }
}
