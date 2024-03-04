package com.patika.java;

import java.util.Scanner;

public class DonguOrnek15 {
    public static void main(String[] args) {
        //for ile faktöriyel hesaplama
        Scanner scan = new Scanner(System.in);
        int k,total=1;
        System.out.print("enter k:");
        k=scan.nextInt();
        for (int i=1; i<=k; i++){
            total=total*i;
        }
        System.out.println("Result:"+total);
    }
}
