package com.makeup;

public class LoopExample19 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= (5 - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");

            }
            System.out.println();
        }

        for (int l = 4; l >= 1; l--) {
            System.out.print(" ");
            for (int m = 1; m <= 4 - l; m++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= 2 * l - 1; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}

