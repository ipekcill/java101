package com.methods;

public class Example16 {
    static int function(int a) {
        if (a == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }

    static boolean isCheck(int n) {
        if (n == 0) {
            return false;
        }
        for (int i = 1; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(function(5));
        System.out.println(isCheck(7));
        if (isCheck(7) == false) {
            System.out.println("not a prime");
        } else {
            System.out.println("prime");
        }
    }

}
