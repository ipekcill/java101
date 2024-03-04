package com.makeup;

import java.util.Scanner;

public class LoopExampleDiamond22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter line");
        int line = sc.nextInt();
        int space=line/2;
        int star=1;
        for (int i=0; i<line; i++){
            for (int j=0; j<space; j++){
                System.out.print(" ");
            }
            for (int k=0; k<star;k++){
                System.out.print("*");
            }
            if(i<(line/2)){
                space--;
                star+=2;
            }else{
                space++;
                star-=2;
            }
            System.out.println();
        }
    }
}
