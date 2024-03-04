package com.makeup;

public class WhileLoopExample3 {
    public static void main(String[] args) {
        int i =1;

        while (i<=5){
            System.out.println(i);
            int k=1;
            while (k <=10){

                System.out.print(k + ",");
                k++;

            }
            System.out.println( );
            i++;
        }
    }
}
