package com.makeup;

import java.util.Scanner;

public class WhileLoopExample5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number=sc.nextInt();
        int i=1;
        while(i<=number){
            if (i%2==0){
                System.out.println(i);
            }
            i++;
        }
    }

}
/* for(int i=1; i<=number; i++){
    if(i%2==0){
    println(i)
 */
