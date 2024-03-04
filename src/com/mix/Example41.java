package com.mix;

public class Example41 {
    public static void main(String[] args) {
        /*int max = 0;
        int secondMax = 0;
        int[] arr = {2, 4, 3, 5,10, 7, 6, 9,12,9};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax=max;
                max = arr[i];
            }else{
                if(arr[i]>secondMax ) {
                    secondMax = arr[i];
                }
            }
        }
        System.out.println(secondMax);*/
        int min = 1000;
        int secondMin = 1000;
        int[] arr = {1,2, 4, 3, 5,10, 7, 6, 9,12,9};
        for (int j : arr) {
            if (j < min) {
                secondMin = min;
                min = j;
            } else {
                if (j < secondMin) {
                    secondMin = j;
                }
            }
        }
        System.out.println(secondMin);


    }

}

