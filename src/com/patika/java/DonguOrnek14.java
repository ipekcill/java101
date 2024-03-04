package com.patika.java;

import java.util.Scanner;

public class DonguOrnek14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // while kullanarak üslü sayı hesaplama
        int k, n, total = 1;
        System.out.println("enter k");
        k = scan.nextInt();
        System.out.println("enter n");
        n = scan.nextInt();
        int i = 1;
        while (i <= n) {
            total *= k;
            i++;
        }
        System.out.println(total);
    }
}
