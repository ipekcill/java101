package Ipek;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String realPassword = "java123";
        String userName, password, newPassword;
        String userPref;
        Scanner inp = new Scanner(System.in);
        System.out.print("Username:");
        userName = inp.nextLine();
        System.out.print("Password:");
        password = inp.nextLine();

        if (userName.equals("ipekcill") && password.equals(realPassword)) {
            System.out.println("Successfull");
        } else {
            System.out.println("Unknown user: Do you want to change your password?");
            userPref = inp.nextLine();
            if (userPref.equals("OK")) {
                System.out.println("Enter new password");
                newPassword = inp.nextLine();
                if (newPassword.equals(password) || newPassword.equals(realPassword)) {
                    System.out.println("Error");
                } else {
                    System.out.println("Password changed:" + newPassword);
                }
            } else
                System.out.println("BOK");
        }


    }
}

