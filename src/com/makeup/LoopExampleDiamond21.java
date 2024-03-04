package com.makeup;

import java.util.Scanner;

public class LoopExampleDiamond21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter line: ");
        int n = scanner.nextInt();


        int space = n / 2;
        int star = 1;

        // Üst kısım
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
            space--;
            star += 2;
        }

        // Alt kısım
        space= 1;
        star = n - 2;

        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
            space++;
            star -= 2;
        }

    }
}


