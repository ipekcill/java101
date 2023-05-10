package com.patika.java;

import java.util.Scanner;

public class DonguOrnek3 {
    public static void main(String[] args) {
        // girilen sayı çift olana kadar sayı girilmesini isteme
        Scanner scan = new Scanner(System.in);
        int k=0;
        System.out.println("enter k");
        k = scan.nextInt();
        while (k % 2 == 1) {
            System.out.println("enter k");
            k = scan.nextInt();


        }
    }
}
