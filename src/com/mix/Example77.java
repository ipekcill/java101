package com.mix;

import java.util.ArrayList;
import java.util.List;

public class Example77 { // Algorithm that returns pairs of numbers whose sum equals the given target value

    public static List<int[]> findPairs(int[] arr, int target) {
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == complement) {

                }
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7};
        int target = 10;

    }
}
