package com.methods;
// recursive metot kullanarak girilen sayının asal olup olmadığını kontrol etme

import java.util.Scanner;

public class Example15 {
    static boolean isPrime(int num, int den) {
        if (num == 1) {
            return false;
        }
        if (den == num) {
            return true;
        }
        if (num % den == 0) {
            return false;
        }
        return isPrime(num, den + 1);
    }

    public static void main(String[] args) {

        boolean isLoop = true;
        while (isLoop) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter number:");
            int num = sc.nextInt();
            if (num == 0) {
                isLoop = false;
                break;
            } else {

                if (isPrime(num, 2)) {
                    System.out.println(num + " is a prime number");
                } else {
                    System.out.println(num + " is not a prime number.");
                }

            }
        }
    }
}
