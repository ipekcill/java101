package com.makeup;

import java.util.Scanner;

public class DoWhileLoopExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int passwordReal = 123;
        int password;
        do {
            System.out.println("enter password:");
            password = sc.nextInt();
        } while (password != passwordReal);
    }
}
