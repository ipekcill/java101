package com.patika.java;

import java.util.Scanner;

public class DonguOrnek17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input, remain,count=0;
        System.out.println("Enter input:");
        input=scan.nextInt();
        int sum2=0;
        int temp=input;
        int temp2=input;
        while (input!=0){
            input=input/10;
            count ++;
        }
        System.out.println(count);
        // basamağın değerini belirleme
        while (temp!=0){
            remain=temp%10;
            int sum=1;
            // basamağın üstünü alma
            for (int i=1; i<=count; i++){
                sum=sum*remain;
            }
            sum2=sum+sum2;
            temp=temp/10;
        }
        if (temp2==sum2){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not");
        }
    }
}
