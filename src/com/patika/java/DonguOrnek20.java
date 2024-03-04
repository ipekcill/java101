package com.patika.java;

import java.util.Scanner;

public class DonguOrnek20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input, sum = 0;
        System.out.print("enter input");
        input = scan.nextInt();
        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                sum = sum + (i);
            }

        }
        System.out.println(sum);
    }
}


