package com.makeup;

import java.util.Scanner;

public class LoopExamples1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total=0;
        int number;
        do {
            System.out.println("Enter number:");
             number=sc.nextInt();
            if (number %2==1){
                total+=number;
            }
        }while ( number>0);
        System.out.println("Total:" + total);
    }
}
//Negatif değer girilene kadar kullanıcı irişlerini kabul eden ve girilenler arasından tek sayı olanları toplayan program
