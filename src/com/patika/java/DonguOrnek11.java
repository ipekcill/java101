package com.patika.java;

import java.util.Scanner;
//Calculation of factorial for entered number and finding combination

public class DonguOrnek11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, r, totaln = 1, totalr = 1, totalnr=1;
        System.out.println("enter n");

        n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            totaln = totaln * i;

        }
        System.out.println("n factorial:" + totaln);
        System.out.println("enter r");
        r = scan.nextInt();

        for (int i = 1; i <= r; i++) {
            totalr = totalr * i;

        }
        System.out.println("r factorial:" + totalr);

        for (int i = 1; i <= (n-r); i++) {
            totalnr= totalnr * i;

        }
        System.out.println("n-r factorial:" + totalnr);


        System.out.println("Combination n-r: " + (totaln)/(totalr*totalnr));
    }
}
