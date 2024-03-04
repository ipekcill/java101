package com.patika.java;

import java.util.Scanner;

public class DonguOrnek0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number, sum = 0;
        System.out.println("enter");
        number = scan.nextInt();
        /*while (number >= 0) {
            System.out.println("enter");
            number = scan.nextInt();
            if (number % 2 == 1) {
                sum+=number;
            }

        }*/

        do {
            System.out.println("enter");
            number = scan.nextInt();
            if (number % 2 == 1) {
                sum+=number;
            }
        } while (number >= 0);
        System.out.println(sum);
    }
}

