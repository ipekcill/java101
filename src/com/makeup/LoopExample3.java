package com.makeup;

import java.util.Scanner;

public class LoopExample3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total=1;
        System.out.print("n value:");
        int n=sc.nextInt();
        for (int i=1; i<=n; i++){
            total*=i;
        }
        System.out.println(total);
    }
}
