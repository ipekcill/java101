package com.makeup;

import java.util.Scanner;

public class LoopExample10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word1:");
        String word1 = sc.nextLine();
        System.out.println("Enter word2:");
        String word2 = sc.nextLine();
        int count1 = word1.length();

        String reverse = "";

        for (int i = count1-1; i >=0; i--) {
            reverse = reverse + word1.charAt(i);

        }

        if (reverse.equals(word2)) {
            System.out.println("panipani");
        }

    }
}
