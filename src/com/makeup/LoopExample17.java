package com.makeup;

import java.util.Scanner;

public class LoopExample17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int n2 = sc.nextInt();
        int i=1;
        int ebob=1;
        while(i<=n1){
            if ((n1%i==0)&& (n2%i==0)){
                ebob=i;
            }
            i++;
        }
        System.out.println(ebob);
    }
}
