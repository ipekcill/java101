package com.patika.java;

public class MultiplicationTableExample {
    public static void main(String[] args) {
       for (int i=1; i<=10; i++) {
           System.out.print("  ");
           System.out.print(i + " ");
       }
        System.out.println();
       for (int j=1; j<=15; j++){
           System.out.print("  ");
           System.out.print("_");
           }
        System.out.println();
       for (int k=1; k<=10;k++){
           System.out.println(k+ "|");
           for (int m=1; m<=10; m++){
               System.out.print(k*m + " ");
           }
           System.out.println(" ");
       }
       }
    }

