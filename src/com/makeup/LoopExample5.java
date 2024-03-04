package com.makeup;

import java.util.Scanner;

public class LoopExample5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int rem;
        int total = 0;
        System.out.println("Enter number");
        int input = scan.nextInt();
        int n = input;
        while (input != 0) {
            input = input / 10;
            count++;
        }
        for (int i = 1; i <= count; i++) {
            rem = n % 10;
            total += rem;
            n = n / 10;
        }
        System.out.println(total);


    }

}
