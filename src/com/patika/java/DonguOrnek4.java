package com.patika.java;

import java.util.Scanner;
// girilen sayıya kadar olan çift sayıları yazdırma
public class DonguOrnek4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k;
        System.out.println("enter k");
        k=scan.nextInt();
        for (int i =1; i<=k; i++){
            if (i % 2==0){
                System.out.println(i);
            }
        }

    }
}
