package com.makeup;

import java.util.Scanner;

public class BooleanExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total;

        System.out.println("enter a:");
        int a = sc.nextInt();
        System.out.println("enter b:");
        int b = sc.nextInt();
        total = a + b;

        boolean case1=total>10;

        System.out.println(case1); // çıktısı true olacak
        System.out.println(case1 ? "büyük" :"küçük");
        String str= case1? "Büyüktür": "Küçüktür";
        System.out.println(str);


       /* if (total < 10) {
            System.out.println("proper");
        }else{
            System.out.println("not");*/
        }
    }



