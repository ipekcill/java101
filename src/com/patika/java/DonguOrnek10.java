package com.patika.java;

import java.util.Scanner;

public class DonguOrnek10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Printing the power of 4 and 5 that less than entered value by using do-while
        int k, i = 1, j = 1;
        System.out.print("enter k:");
        k = scan.nextInt();

        do {

            System.out.println(i);
            i *= 4;


        } while (i < k);

        do {

            System.out.println(j);
            j *= 5;


        } while (j < k);

    }


}



