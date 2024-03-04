package com.makeup;

import java.util.Scanner;

//Kullanıcıdan alınan sayının asal olup olmadığını konrol eden program. Cevap verildiğinde tekrar sayı girilmesi istensin.
public class LoopExample24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isLoopContinue = true;
        boolean isPrime = true;
        while (isLoopContinue) {

            System.out.println("Number:");
            int number = sc.nextInt();
            if (number == 0) {
                isLoopContinue = false;
            } else {
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println("Prime number");
            } else {
                System.out.println("Not a prime number");
            }

        }
    }

}


