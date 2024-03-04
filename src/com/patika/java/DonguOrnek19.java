package com.patika.java;

import java.util.Scanner;

public class DonguOrnek19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input;
        double sum=0.0;
        System.out.print("Enter input:");
        input=scan.nextInt();
        for (double i=1; i<=input; i++){
            sum=sum+(1/i);
        }
        System.out.println(sum);

       /* for(int i=1; i<=input; i++) {
            sum = sum + (1.0 / i);
        }
        System.out.println(sum);*/










    }
}
