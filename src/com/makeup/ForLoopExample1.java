package com.makeup;

import java.util.Scanner;

public class ForLoopExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int total=0;
        int amount=0;
        int number=sc.nextInt();
        for(int i=1; i<=number; i++){
            if ((i%4==0)&&(i%3==0)){
                total+=i;
                amount+=1;

            }
        }
        System.out.println("Total:" + total);
        System.out.println("Amount:" + amount);
        System.out.println("Average:" + total/amount);

    }
}
