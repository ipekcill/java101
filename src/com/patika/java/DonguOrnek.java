package com.patika.java;

import java.util.Scanner;

public class DonguOrnek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("enter n:");
        n=scan.nextInt();
        int i=1;
        while (i<n){
            if( n%i==0){
                System.out.println(i);
            }
            i++;

        }
    }
}
