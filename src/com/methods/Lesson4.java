package com.methods;
// recursive 1 den n'ye kadar olan sayıların toplamı
public class Lesson4 {
    static int f(int n){
        if(n==1){
            return 1;
        }
        return f(n-1)+n;
    }
    public static void main(String[] args) {
        System.out.println(f(4));

    }
}
