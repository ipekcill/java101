package com.makeup;

import java.util.Scanner;

public class DoWhileLoopExample1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int password;
        boolean isPassword = false;
        do {
            System.out.print("Enter password:");
            password=sc.nextInt();
            if (password==123){
                isPassword=true;
                System.out.println("Correct");
            }else{
                System.out.println("Incorrect password");
            }

        }while (!isPassword);

        // while(isPassword) şeklinde yazıldığında doğru şifre girildiğinde de şifre sormaya devam etti.1
    }
}
