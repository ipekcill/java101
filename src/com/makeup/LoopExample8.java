package com.makeup;

import java.util.Scanner;

public class LoopExample8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int input=sc.nextInt();
        int count=0;
        int n=input;
        int n2=input;
        int rem;
        int total=1;
        int total2=0;
        while (input!=0){
            input=input/10;
            count ++;
        }
        for (int i=1; i<=count; i++){
            rem = n%10;
            for (int j=1; j<=count; j++){
                total*=rem;

            }
            total2+=total;
            n=n/10;
        }
        System.out.println(total2);
        if (total2==n2){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not Armstrong");
        }

    }
}
