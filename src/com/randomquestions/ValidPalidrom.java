package com.randomquestions;

public class ValidPalidrom {
    public static boolean isValidPalindrom(String str) {
        String lowercaseString = str.toLowerCase();
        // Sadece harfleri ve sayıları içeren bir string elde etme
        String filteredString = lowercaseString.replaceAll("[^a-zA-Z0-9]", "");
        char[] charArr = filteredString.toCharArray();
        int start = 0;
        int end = (charArr.length) - 1;
        while (start < end) {
            if (charArr[start] != charArr[end]) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }
    
    public static void main (String[]args){
            String str = "A man, a plan, a canal : Panama";
            System.out.println(isValidPalindrom(str));

        }
    }
