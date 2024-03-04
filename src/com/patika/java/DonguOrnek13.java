package com.patika.java;

import java.util.Scanner;

public class DonguOrnek13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //While kullanarak faktöriyel hesaplama
        int k, total=1;
        System.out.print("enter k:");
        k = scan.nextInt();
        int i = 1;
        while (i <= k) {
        total*=i;
        i++;
        }
        System.out.println(total);
    }
}
