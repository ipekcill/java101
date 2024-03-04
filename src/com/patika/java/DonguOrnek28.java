package com.patika.java;

import java.util.Scanner;

public class DonguOrnek28 {
    // ters üçgen kule
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("enter n");
        n=scan.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=(i-1); j++){
                System.out.print(" ");
            }
            for (int k= ((2*n)-1); k>=(2*i -1); k--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
