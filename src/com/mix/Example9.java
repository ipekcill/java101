package com.mix;

import java.util.ArrayList;
import java.util.List;

//dizideki tekrar eden sayıları bulma
public class Example9 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 5, 8, 32, -8, 32, 32};
        List<Integer> dublicateList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && !dublicateList.contains(arr[i])) {
                    dublicateList.add(arr[j]);
                }

            }
        }
        System.out.println(dublicateList);

    }
}

