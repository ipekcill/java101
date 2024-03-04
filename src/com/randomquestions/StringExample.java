package com.randomquestions;

public class StringExample {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal : Panama";
        String lowercaseString = str.toLowerCase();

        // Sadece harfleri ve boşlukları içeren bir string elde etme
        String filteredString = lowercaseString.replaceAll("[^a-zA-Z0-9]", "");


        System.out.println(filteredString);
    }
}
