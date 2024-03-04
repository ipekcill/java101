package com.makeup;

import java.util.Scanner;

public class LoopExampleEbob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int n1=sc.nextInt();
        System.out.println("Enter 2nd number:");
        int n2=sc.nextInt();

        for (int i=n1; i>=1; i--) {
            if ((n1%i==0)&& (n2%i==0)){
                System.out.println(i);
                break;
            }
        }

    }
}
