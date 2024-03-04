package com.makeup;

import java.util.Arrays;
import java.util.Scanner;

public class LoopExample16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("how many number will you enter");
        int howMany=sc.nextInt();
        int[] intDizi = new int[howMany];
        int max=0;
        for (int i=0; i<howMany; i++){
            System.out.println(i+ ".number");
            int number=sc.nextInt();
            intDizi[i] = number;
            if (number>max){
                max=number;
            }
        }
        System.out.println(Arrays.toString(intDizi));
        System.out.println(max);




    }
}
