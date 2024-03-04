package com.mix;

import java.util.Arrays;

public class Example42 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] tempArr = new int[arr.length];
        int k = 2;
        int startIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i + k < arr.length) {
                tempArr[i + k] = arr[i];
            } else {

                tempArr[startIndex] = arr[i];
                startIndex++;
            }

        }
        System.out.println(Arrays.toString(tempArr));
    }
}
