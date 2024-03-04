package com.makeup;

import java.util.Scanner;

public class LoopExample9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = sc.nextLine();
        int count = word.length();
        String reverse="";
        for (int i = count-1; i >= 0; i--) {
            reverse=reverse + word.charAt(i);

        }
        System.out.println(reverse);

    }
}