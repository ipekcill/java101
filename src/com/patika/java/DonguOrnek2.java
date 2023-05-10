package com.patika.java;

import java.util.Scanner;
//Örnek : Girilen sayıya kadar olan sayılardan 2 ye tam bölünenleri yazdırma
public class DonguOrnek2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k;
        System.out.println("Enter k value");
        k = scan.nextInt();
        for (int i = 1; i <= k; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
