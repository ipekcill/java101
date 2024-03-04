package com.methods;


public class Example17 {
    static void printArr(int[]arr){
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }

    }

    public static void main(String[] args) {

        int [] arr={1,2,3};
        printArr(arr);


    }
}
