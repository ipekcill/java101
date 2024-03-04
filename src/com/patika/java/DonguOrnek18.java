package com.patika.java;

import java.util.Scanner;

public class DonguOrnek18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input, remain, remain2, sum = 0, sum2 = 0;
        System.out.println("enter input:");
        input = scan.nextInt();

        /*while (input != 0) {
            remain = input % 10;
            sum = sum + remain;
            input = input / 10;
        }*/
        System.out.println(sum);

        for(int i = 0; i<2; i++) {
            remain2 = input % 10;
            sum2 += remain2;
            input = input / 10;
        }
        System.out.println(sum2);
    }
}








