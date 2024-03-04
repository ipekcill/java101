package com.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Question17 { // tekrar edenlerin çıkarılarak array'in yeniden oluşturulması
    public static void main(String[] args) {
        int[]arr={6,3,3,4,8,1,4};
        Set<Integer> set=new HashSet<>();
        for(int i=0;i< arr.length;i++){
            set.add(arr[i]);
        }
        int[]arr2=new int[set.size()];
        int i=0;
        for(Integer item: set){
            arr2[i]=item;
            i++;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
