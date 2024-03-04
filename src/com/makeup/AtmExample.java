package com.makeup;

import java.util.Scanner;

public class AtmExample {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int passwordReal = 7292, balance = 1000;
        System.out.println("enter password");
        int password = scn.nextInt();
        if (password == passwordReal) {
            System.out.println("success login");
            System.out.println("Select the operation you want");
            System.out.println("1.Withdraw money \n 2.Deposit money \n 3.View Balance");
            int select = scn.nextInt();
            if (select==1){
                System.out.println("How much money you want to withdraw?");
                int withdrawAmount=scn.nextInt();
                if (withdrawAmount>balance){
                    System.out.println("Insufficient balance");
                }else{
                    System.out.println("New balance:" + (balance-withdrawAmount));
                }
            }
            if (select ==2){
                System.out.println("How much money you want to deposit?");
                int depositAmount=scn.nextInt();
                System.out.println("New balance:" +(depositAmount+balance));
            }

        } else {
            System.out.println("Failed login");
        }

    }
}
