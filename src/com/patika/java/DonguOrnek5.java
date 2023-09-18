package com.patika.java;

import java.util.Scanner;

public class DonguOrnek5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Do-while örneği (Girilen sayı çift olana kadar sayı isteme örneği
        int k;
        System.out.println("enter k");
        k=scan.nextInt();
        do {
            System.out.println("enter k");
            k=scan.nextInt();


        }while (k % 2 == 1);

    }
}
