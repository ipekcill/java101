package com.mix;


public class Example4 {
    static void printArrays(int [] arr){
        System.out.print("[");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        int[]list1={1,2,3,4};
        printArrays(list1);

    }
}
