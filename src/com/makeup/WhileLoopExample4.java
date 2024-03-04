package com.makeup;

import java.util.Scanner;

public class WhileLoopExample4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int password=123;
        int password1;
        System.out.print("enter password:");
        password1=sc.nextInt();
        while (password1!=password){
            System.out.print("enter password:");
            password1=sc.nextInt();
        }
    }
}
