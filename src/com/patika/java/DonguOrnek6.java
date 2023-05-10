package com.patika.java;

import java.util.Scanner;

public class DonguOrnek6 {
    public static void main(String[] args) {
        //Girilen değer negatif olana kadar kullanıcıdan sayı girmesini isteyen, girilenlerden
        // tek sayıları toplayıp yazdıran program
        Scanner scan = new Scanner(System.in);
        int n, total = 0;
        do {
            System.out.print("enter n:");
            n = scan.nextInt();
            if (n % 2 == 1) {
                total += n;
            }
        } while (n > 0);
        System.out.println("The sum of the odd numbers:" + total);
    }

}
