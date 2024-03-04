package com.patika.java;

import java.util.Scanner;

public class DonguOrnek12 {
    // for kullanarak Üslü sayı

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, r, total = 1;
        System.out.print("enter n:");
        n = scan.nextInt();
        System.out.print("enter r:");
        r = scan.nextInt();
        for (int i = 1; i <=r; i++) {
            total *= n;

        }
        System.out.println("result:" + total);
    }
}
