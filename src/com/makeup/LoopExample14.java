package com.makeup;

import java.util.Scanner;

public class LoopExample14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int n2 = sc.nextInt();
        int ekok=1;

        for (int i = 24; i <= (n1 * n2); i++) {
            if (i % n1 == 0 && i % n2 == 0) {
                ekok=i;
                break;
            }

        }
        System.out.println("Ekok:" +ekok);
    }
}
/*  for (int i = 24; i <= (n1 * n2); i++) {
            if (i % n1 == 0 && i % n2 == 0) {
                print(i)
                break;
            }
        }
 */
