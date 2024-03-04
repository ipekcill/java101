package com.patika.java;

import java.util.Scanner;

public class DonguOrnek21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = "Ipek";
        String realPassword = "Ipek132";
        String username, password;
        int right = 3, operations;

        while (right > 0) {
            System.out.print("Enter username:");
            username = scan.next();
            System.out.println("Enter password");
            password = scan.next();
            if (username.equals(name) && password.equals(realPassword)) {
                System.out.println("Access confirmed");
                System.out.println("Select action you want");
                System.out.println("1.Withdraw Money \n 2.Deposit Money \n 3.Show balance");
                operations = scan.nextInt();
            } else {
                System.out.println("Incorrect username/password");
                right--;
                System.out.println("Remaining right:" + right);


            }
            if (right == 0) {
                System.out.println("Blocked. Please meet with your bank");


            }

        }

    }
}
