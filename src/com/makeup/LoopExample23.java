package com.makeup;

import java.util.Scanner;

public class LoopExample23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, total, s1 = 0, s2 = 1;
        System.out.print("Enter element number of Fibonacci series:");
        n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(s1 + ",");
            total = s1 + s2;
            s1 = s2;
            s2 = total;
        }
    }
}

