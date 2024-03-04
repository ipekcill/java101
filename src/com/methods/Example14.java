package com.methods;
// recursive olmadan faktöriyel hesaplama

import java.util.Scanner;

public class Example14 {
    static int f(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;

            }
        if (n == 0) {
            return 1;
        }
            return result;

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int fin= f(n);
        System.out.println("Result:" + fin);

    }
}
