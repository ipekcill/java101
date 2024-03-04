package com.mix;
// 1,2,3,4 şeklinde elemanlara sahip olan diziyi hem tersten hem düz yazdırma
public class Example2 {
    public static void main(String[] args) {
        int[] arr=new int[4];
        int [] reverseArr=new int [4];
        int number=1;

        for (int i=0; i<arr.length; i++){
            arr[i]=number;
            number++;
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        int numb=arr[reverseArr.length-1];
        for(int j=0; j< reverseArr.length; j++){
            reverseArr[j]=numb;
            numb--;
            System.out.print(reverseArr[j] + " ");
        }
    }
}
