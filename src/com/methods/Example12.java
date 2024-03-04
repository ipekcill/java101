package com.methods;
// 16 11 6 1 -4 1 6 11 16
// 16-5=11 , 11-5=6, 6-5=1, 1-5=-4, -4+5=1, 1+5=6, 6+5=11, 11+5=16 ( Sayı 0 veya 0'dan küçük olana kadar 5 çıkar. Sonra sayıyı elde edene kadar 5 ekle.

public class Example12 {
    static void f(int n){
        System.out.println(n-5);
    }
    public static void main(String[] args) {
        f(10);
    }
}
