package com.interview;

public class Question36 {
    public static String StringChallenge(String str) {
        // Convert the string to lowercase and remove non-alphanumeric characters
        String cleanStr = str.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Reverse the cleaned string
        String reversedStr = new StringBuilder(cleanStr).reverse().toString();

        // Check if the original and reversed strings are equal
        boolean isPalindrome = cleanStr.equals(reversedStr);

        // Return the result as a string
        return String.valueOf(isPalindrome);
    }
    public static void main(String[] args) {
        String input = "Anne, I vote more cars race Rome-to-Vienna";
        String result = StringChallenge(input);
        System.out.println(result); // Output: true
    }
}
