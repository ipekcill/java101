package com.arrays;
// Yıldızlar ile V
import java.util.Scanner;

public class Example37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row ");
        int input = scanner.nextInt();
        for(int i=1; i<=input;i++){
            for(int j=1; j<=2*input-1; j++){
                if(i==j || j==(2*input-i)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
