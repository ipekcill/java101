package com.makeup;

import java.util.Scanner;
// girilenlerden max olanı bulma

public class LoopExample25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        System.out.println("How many numbers will you enter?");
        int howMany = sc.nextInt();
        for (int i = 1; i <= howMany; i++) {
            System.out.println("Enter" + i + ". number:");
            int number = sc.nextInt();
            if (number > max) {
                max = number;
            }
        }
        System.out.println("max:" + max);
    }
}

