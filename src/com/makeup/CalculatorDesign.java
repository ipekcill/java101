package com.makeup;

import java.util.Scanner;

public class CalculatorDesign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number1:");
        double number1=sc.nextDouble();
        System.out.print("number2:");
        double number2=sc.nextDouble();
        System.out.println("Please choose number of calculation that will be made");
        System.out.println("1-Sum\n2-Subtraction\n3-Multiplication\n4-Division");
        int select = sc.nextInt();
       // double Result= number1/number2;
        if (select==1){
            System.out.println("Result:" + (number1+number2));
        }else if ( select==2){
            System.out.println("Result:" + (number1-number2));
        }else if ( select==3){
            System.out.println("Result:" + (number1*number2));
        }else{

            System.out.println("Result:" +(number1/number2));
        }

    }

}
