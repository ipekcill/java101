package com.makeup;

import java.util.Scanner;

public class LoopExample6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum =0;
        System.out.print("enter number:");
        int n=scan.nextInt();
        for (int i=1;i<=n; i++){
            sum+=1.0/i;

        }
        System.out.println("Total:" + sum);
    }
}
