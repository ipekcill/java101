package com.methods;
// girilen sayının asal olup olmadığını recursive metot ile kontrol etme


public class Example10 {
    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        isPrime(6);
        if (isPrime(6)) {
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }

    }
}
