package Ipek;

import java.util.Scanner;

public class CalculatorDesign {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);
        System.out.print("n1:");
        n1 = input.nextInt();
        System.out.print("n2");
        n2 = input.nextInt();
        System.out.print("1-Sum\n2-Subtraction\n3-Multiplication\n4-Division");
        System.out.println();
        System.out.print("Which:");
        select = input.nextInt();
        if (select == 1) {
            System.out.print("Result:" + (n1 + n2));
        }else if (select == 2) {
            System.out.print("Result:" + (n1 - n2));
        } else if (select == 3) {
            System.out.print("Result:" + (n1 * n2));
        } else if (select == 4) {
            if (n2 == 0) {
                System.out.print("Can't be divided by zero");
            } else {
                System.out.print("Result:" + (n1 / n2));
            }
        } else
            System.out.println("Error: Wrong selection");


    }
}
