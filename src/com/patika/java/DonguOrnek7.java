package com.patika.java;

import java.util.Scanner;

public class DonguOrnek7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Girilen sayı negatif olana kadar girilen sayılardan tek olanların toplamını yazdırma: While kullanarak
        int k, total = 0;
        System.out.print("enter k:");
        k=scan.nextInt();
        while (k > 0) {
            if (k % 2 == 1) {
                total += k;
            }
        }
        System.out.println("Total:" + total);
    }
}

