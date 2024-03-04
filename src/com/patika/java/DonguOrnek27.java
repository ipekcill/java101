package com.patika.java;

import java.util.Scanner;

public class DonguOrnek27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("enter n"); // Kule kaç satırdan oluşacak? Kullanıcıdan istedik.
        n=scan.nextInt();

        for (int i = 1; i <= n; i++) { // 6 satır oluşturduk
            for (int j = 1; j <= (n - i); j++) {  // her satırdaki boşlukları oluşturduk
                System.out.print(" ");   // boşlıkları yan yana yazdırmak için print olarak yazdık
            }
            for (int k = 1; k <= (2 * i) - 1; k++) { // her satırdaki yıldızları yazdırdık
                System.out.print("*");
            }

            System.out.println(" "); // her satırdan sonra aşağı inmesi için boşluk ekledik


        }

    }
}
