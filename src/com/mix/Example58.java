package com.mix;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Example58 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 2, 4, 1, 6};


        Set<Integer> mySet = new HashSet<>();
        int sum = 0;
        for (int num : arr) {
            while (mySet.contains(num)) {
                num++;
            }
            mySet.add(num);
            sum += num;
        }

        int[] newArr = new int[mySet.size()];
        int i = 0;
        for (int num : mySet) {
            newArr[i] = num;
            i++;
        }

        System.out.println(Arrays.toString(newArr));
        System.out.println(sum);
    }
}

