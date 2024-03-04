package com.makeup;

import java.util.Scanner;

public class WhileLoopExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // kullanıcı doğru şifreyi girene kadar şifre girmesini isteyen program
        int password;
        boolean trial= true;
        while(trial){
            System.out.print("Enter your password:");
            password=sc.nextInt();
            if( password==123){
                trial=false;
                System.out.println("Correct password");

            }else {
                System.out.println(" Incorrect password.Try again");
            }
        }
    }
}
