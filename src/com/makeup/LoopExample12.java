package com.makeup;

import java.util.Scanner;

public class LoopExample12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int n1=sc.nextInt();
        System.out.println("Enter 2nd number:");
        int n2=sc.nextInt();
        int ebob=1;
        for (int i=1; i<=n1; i++){
            if ((n1%i==0)&& (n2%i==0)){
                ebob=i;
            }

        }
        System.out.println("Ebob:" + ebob);

    }
}
