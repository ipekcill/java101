package com.interview;

import java.util.Arrays;

public class Question32 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arr2 = new int[arr.length];
        int number = 2;
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i] * 2;
        }
        System.out.println(Arrays.toString(arr2));

    }
}
