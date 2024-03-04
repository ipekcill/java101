package com.mix;

import java.util.Scanner;

public class Example55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input, remain,count=0;
        System.out.println("Enter input:");
        input=sc.nextInt();
        int sum2=0;
        int temp=input;
        int temp2=input;
        while (input!=0){
            input=input/10;
            count ++;
        }

        while (temp != 0) {
            remain = temp % 10;
            int sum = 1;
            for (int i = 1; i <= count; i++) {
                sum = sum * remain;
            }
            sum2 = sum + sum2;
            temp = temp / 10;
        }
        if (temp2 == sum2) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not");
        }
    }
}


