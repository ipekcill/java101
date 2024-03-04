package com.methods;
// recursive üs alma

public class Example9 {
    public static int pow(int base, int exp) {
        if (exp == 0 || base==1) {
            return 1;
        }

            return base * pow(base, exp-1);
    }


    public static void main(String[] args) {
        System.out.println(pow(1,3));

    }
}
