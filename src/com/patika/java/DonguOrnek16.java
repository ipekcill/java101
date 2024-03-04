package com.patika.java;

import java.util.Scanner;

public class DonguOrnek16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input, count=0,sum = 0;
        System.out.println("enter k");
        int remainder,sum2;
        input = scan.nextInt();
        int temp = input;
        int temp2 = input;
        while (input!=0){
            input=input/10;
            count ++;
        }

        for (int i=0; i<count; i++) {
            remainder = temp % 10;
            //sum += Math.pow(remainder, count);
            sum2=1;
            for (int j = 0; j <count; j++) {
                sum2 *= remainder;
            }
            sum+=sum2;
            temp /= 10;

        }
       if(temp2 == sum) {
           System.out.println("Armstrong");
       } else {
           System.out.println("Not");
       }
    }

}
