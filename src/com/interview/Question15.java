package com.interview;

import java.util.Arrays;

public class Question15 { //Bir dizideki elemanları k kadar öteleme
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        int[] arr2 = new int[arr.length];
        int strtIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i + k < arr.length) {
                arr2[i + k] = arr[i];
            } else {
                arr2[strtIndex] = arr[i];
                strtIndex++;
            }

        }
        System.out.println(Arrays.toString(arr2));

    }
}
