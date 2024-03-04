package com.makeup;

import java.util.Scanner;

public class NumberSortingExample {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a, b, c;
        System.out.println("enter first number");
        a = scn.nextInt();
        System.out.println("enter second number");
        b = scn.nextInt();
        System.out.println("enter third number");
        c = scn.nextInt();
        if ((a < b) && (a < c)) {
            // a en küçük
            if (b < c) {
                System.out.println("a<b<c");
            } else {
                System.out.println("a<c<b");
            }
        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.println("b<a<c");
            } else {
                System.out.println("b<c<a");
            }
        } else {
            if (b < a) {
                System.out.println("c<b<a");
            } else {
                System.out.println("c<a<b");
            }

        }
    }
}
