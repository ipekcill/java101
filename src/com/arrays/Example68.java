package com.arrays;

public class Example68 {
    public static void main(String[] args) {
        int input = 6;
        int s1 = 0;
        int s2 = 1;

        for (int i = 1; i <= input; i++) {
            System.out.print(s1 + ",");
            int sum = s1 + s2;
            s1 = s2;
            s2 = sum;
        }

    }
}

