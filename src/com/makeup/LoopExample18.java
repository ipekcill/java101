package com.makeup;

import java.util.Scanner;

public class LoopExample18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word");
        String word = sc.nextLine();
        int length= word.length();
        for (int i= length-1; i>=0; i--){
            System.out.print(word.charAt(i));
        }
    }
}
