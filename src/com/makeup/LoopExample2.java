package com.makeup;

import java.util.Scanner;

public class LoopExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int total = 0;
        do {
            System.out.println("Enter number:");
            number = sc.nextInt();
            if (number % 4 == 0) {
                total += number;
            }
        }while (number % 2 == 0);

                System.out.println("Total:" + total);


    }
}
// tek sayı girilene kadar kullanıcı girişlerini kabul eden ve girilenler arasından 4 ün katı olanları toplayan program

