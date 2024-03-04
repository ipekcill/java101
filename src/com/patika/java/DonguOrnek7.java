package com.patika.java;

import java.util.Scanner;

public class DonguOrnek7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        System.out.print("enter n:");
        n = scan.nextInt();
        for (int i = 1; i <= n; i = i * 2) {
            System.out.println("powers:" + i);

        }
    }
}


