package com.patika.java;

import java.util.Scanner;

public class DonguOrnek24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number, max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        System.out.println("kaç sayı");
        number=scan.nextInt();
        for (int i=1; i<=number; i++){

            int currentNumber;
            System.out.println("Enter " + i + ". number");
            currentNumber=scan.nextInt();
            if (currentNumber > max){
                max=currentNumber;
            }
            if (currentNumber < min){
                min=currentNumber;
            }
        }
        System.out.println("Max:" + max);
        System.out.println("Min:" + min);
    }
}
