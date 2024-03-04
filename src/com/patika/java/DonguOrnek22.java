package com.patika.java;

import java.util.Scanner;

public class DonguOrnek22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, ebob = 1;
        System.out.print("enter a number:");
        a = scan.nextInt();
        System.out.print("enter b number:");
        b = scan.nextInt();
        for (int i = a; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                ebob = i;
                break;

            }
        }
        System.out.println(ebob);

    }
}
