package com.patika.java;

import java.util.Scanner;

public class DonguOrnek9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Printing the power of 4 and 5 that less than entered value by using for

        //Taking n value from user and assign it to variable
        int n;
        System.out.print("enter n:");
        n=scan.nextInt();
        for (int i = 1; i<n; i=4*i){
            System.out.println(i);
        }
        for (int i = 5; i<n; i=5*i){
            System.out.println(i);
        }
    }
}
