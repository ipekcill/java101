package com.patika.java;

import java.util.Scanner;
// Örnek 1: Girilen sayıya kadar olan sayılarda 3 ve 4 'e bölünebilen sayıların ortalamasını alma
public class DonguOrnek1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k, sum = 0, count = 0;
        System.out.println("Enter k value:");
        k = scan.nextInt();
        for (int i = 1; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
                sum+=i;
                count ++;
            }
        }
        System.out.println("Avg:" + (sum/count));
    }
}
