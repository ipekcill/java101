package com.patika.java;

public class DonguKomutlar2 {
    //ekrana 5'i yazdırmamak için continue komutu kullan. Eğer 5 te durdurmakistersen break kullan.
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;

            }
            System.out.println(i);

        }
    }
}
