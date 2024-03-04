package com.makeup;

import java.util.Scanner;

public class UserLoginExample {
    public static void main(String[] args) {
        String userName1 = "Seher";
        String password1 = "Seher123";
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Username:");
        String userName= scn.nextLine();
        System.out.println("Enter Password:");
        String password= scn.nextLine();
        if (userName.equals(userName1) && password.equals(password1)){
            System.out.println("successful login");
        }else {
            System.out.println("Failed");
            System.out.println("Try again");
            System.out.println("Enter password:");
            String newPassword=scn.nextLine();
            if (newPassword.equals(password1)){
                System.out.println("Succesful");
             }else if(newPassword!=password1){
                System.out.println(" Do you want to change your password?");
                String userChoice=scn.nextLine();
                if (userChoice.equals("OK")){
                    System.out.println("Enter new password");
                    String newPassword1=scn.nextLine();
                    if (newPassword1.equals(password1)){
                        System.out.println("Your new password and old one can't be same");
                        System.out.println("Enter new password:");

                    }else{
                        System.out.println("Your password has been changed");
                    }
                }
            }

            }
        }

    }


