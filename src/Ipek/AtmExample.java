package Ipek;

import java.util.Scanner;

public class AtmExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int options, balance = 5000, amount, deposit;
        String oldPassword = "Cil357", newPassword, password;
        System.out.println("1.Withdraw Money \n 2.Deposit Money \n 3.Password Operations");
        System.out.print("Select the number of the action you want to do:");
        options = input.nextInt();

        switch (options) {
            case 1:
                System.out.println("Enter how much money you want to withdraw");
                amount = input.nextInt();
                if (amount % 50 == 0 && amount <= balance) {
                    balance -= amount;
                    System.out.println("Current balance:" + balance);
                } else {
                    System.out.println("ERROR");
                }
                break;
            case 2:
                System.out.println("Enter how much money you want to deposit");
                deposit = input.nextInt();
                balance += deposit;
                System.out.println("Current balance:" + balance);
                break;
            case 3:
                System.out.println("Enter your password");
                password = input.next();
                if (password.equals(oldPassword)) {
                    System.out.println("Enter your new password");
                    newPassword = input.next();
                    if (newPassword.length() >= 5) {
                        System.out.println("Passsword has been changed as :" + newPassword);
                    } else {
                        System.out.println("error");
                    }
                }

                break;

        }
    }
}

