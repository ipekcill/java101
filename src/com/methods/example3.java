package com.methods;

//palindrom sayılar
public class example3 {
    static boolean isPalindrom(int number) {
        int temp = number, reversedNumber = 0, lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reversedNumber = (reversedNumber * 10) + lastNumber;
            temp /= 10;

        }

        if (number == reversedNumber)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(101)) ;

    }
}
