package com.methods;
// 1'den n'ye kadar olan sayıların toplamını recursive method ile hesaplama

public class Example1 {
    static int f(int n) {
        if (n == 1) {
            return 1;
        }
        return n+f(n-1);

    }

    public static void main(String[] args) {
        System.out.println(f(2));

    }
}
