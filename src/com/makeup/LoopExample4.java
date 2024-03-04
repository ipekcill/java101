package com.makeup;

import java.util.Scanner;

public class LoopExample4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total=1;
        System.out.println("enter exponential");
        int exp=sc.nextInt();
        System.out.println("enter base number");
        int n=sc.nextInt();
        for(int i=1; i<=exp; i++){
            total*=n;
        }
        System.out.println(total);
    }
}
