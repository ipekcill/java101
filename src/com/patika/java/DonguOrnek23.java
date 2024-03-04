package com.patika.java;

import java.util.Scanner;

public class DonguOrnek23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, ekok = 1;
        System.out.print("enter a number:");
        a = scan.nextInt();
        System.out.print("enter b number:");
        b = scan.nextInt();


        for (int i = a * b; i >= 1; i--) {
            if (i % a == 0 && i % b == 0) {
                ekok = i;

            }
        }
        System.out.println(ekok);
    }

}



