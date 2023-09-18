package com.objectOrientedLesson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount");
        double amount=sc.nextDouble();
        System.out.println("Enter the card number");
        String cardNumber =sc.next();
        System.out.println("Enter the card expire date");
        String expireDate =sc.next();
        System.out.println("Enter the cvc number");
        String cvc =sc.next();
        System.out.println("Which bank you want make operation with?");
        System.out.println("1. Bank A");
        System.out.println("1. Bank B");
        System.out.println("1. Bank C");
        int select= sc.nextInt();;
        switch (select){
            case 1:
                BankA aPos=new BankA("Bank A", "123456", "7292");
                aPos.connect("127.1.1.1");
                aPos.payment(amount,cardNumber,cvc,expireDate);
                break;
            case 2:
                BankA bPos=new BankA("Bank B", "123456", "7292");
                bPos.connect("127.1.1.1");
                bPos.payment(amount,cardNumber,cvc,expireDate);
                break;

            default:
                System.out.println("Select a valid bank");
        }
    }

}
