package com.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question33 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {-1, 1, 5, 2, 4, 9, 6};
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < arr1.length; j++) {
            if (!set.add(arr1[j])) {
                list.add(arr1[j]);
            }
        }
        if( list.size() == 0){
            System.out.println(" All elements are common");
        }else{
            System.out.println(" Common elements are: " + list + " Number of common elements is : " + list.size());
        }

    }
}
