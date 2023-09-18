package com.arrays;

import java.util.Scanner;

public class Example53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int input = sc.nextInt();
        boolean isPrime = true;
        boolean isLoopContinue = true;
        while (isLoopContinue) {
            if (input == 0) {
                isPrime = false;
            } else {
                for (int i = 2; i < input; i++) {
                    if (input % i == 0) {
                        isPrime = false;
                        break;
                    } else {
                        isPrime = true;
                    }
                }


            }
        }
        if (isPrime) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}