package com.patika.java;

// 1 den 100 e kadar olan asal sayıları yazdırma
// i = 1 2 3 4 5 6 .... 100
// i=10 iken j= 2 3 4 5 6 7 8 9
public class DonguOrnek26 {
    public static void main(String[] args) {


        for (int i = 2; i <= 100; i++) {
            boolean asalMi = true; // Asal sayılar için kontrol değişkeni
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asalMi = false;
                    count++;
                    break;
                }
            }
            if (count == 0)
                System.out.println(i);


        }

    }
}


