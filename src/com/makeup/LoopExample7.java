package com.makeup;

import java.util.Scanner;

public class LoopExample7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int right = 3;
        String userNameReal = "Ipek";
        int passwordReal = 1234;
        while (right>0){
            System.out.println("Enter username");
            String userName=sc.next();
            System.out.println("Enter password");
            int password=sc.nextInt();
            if ((userName.equals(userNameReal)) && ( password==passwordReal)){
                System.out.println("Access enhanced");
            }else{
                right --;
                System.out.println("Your username or password is incorrect. Please try again");
                if (right ==0){
                    System.out.println("Your account has been blocked");
                } else{
                    System.out.println("Remaining right:" +right);
                }
            }

        }


        }

    }


