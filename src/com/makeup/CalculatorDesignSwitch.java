package com.makeup;

import java.util.Scanner;

public class CalculatorDesignSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result;
        System.out.print("n1:");
        int n1=sc.nextInt();
        System.out.print("n2:");
        int n2=sc.nextInt();
        System.out.println("Select operation");
        System.out.println(" 1.Toplama \n 2.Çıkarma \n 3.Çarpma \n 4.Bölme");
        int select= sc.nextInt();
        switch (select){
            case 1:
                result= n1+n2;
                System.out.println(result);
                break;
            case 2:
                result= n1-n2;
                System.out.println(result);
                break;
            case 3:
                result= n1*n2;
                System.out.println(result);
                break;
            default:
                result= n1/n2;
                System.out.println(result);
                break;

        }

    }
}
