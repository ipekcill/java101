package com.methods;
//Palindrom sayılar

public class Example2 {
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10; // Son basamağı al
            reversed = reversed * 10 + digit; // Son basamağı tersine çevirilmiş sayıya ekle
            num /= 10; // Sayıyı bir basamak sağa kaydır
        }
        return reversed;
    }
    public static void main(String[] args) {
        int number = 12345; // Tersine çevirmek istediğiniz sayı
        int reversedNumber = reverseNumber(number);

        System.out.println("Orjinal Sayı: " + number);
        System.out.println("Tersine Çevrilmiş Sayı: " + reversedNumber);
    }


}




