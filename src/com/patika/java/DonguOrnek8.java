package com.patika.java;

import java.util.Scanner;

public class DonguOrnek8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
// DonguOrnek 7 solution by using while
        int n, i=1;
        System.out.print("enter n:");
        n=scan.nextInt();

        while (i<n){
            System.out.println(i);
            i*=2;
        }
    }
}
