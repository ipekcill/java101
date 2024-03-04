package com.mix;

import java.util.HashSet;
import java.util.Set;

// Bir dizideki tekrar edenleri çıkarıp diziyi yeniden yazdırmak metotlu ve metotsuz
public class Example21 {
    static void m(int[] arr) {
        Set<Integer> newArr = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            newArr.add(arr[i]);
        }
        for (Integer k : newArr) {
            System.out.println(k);
        }
    }
    public static void main(String[] args) {
        int []arr={1,2,1,3,2,4,3,5};
        m(arr);
        /*Set<Integer> newArr=new HashSet<>();
        for (int i:arr){
            newArr.add(i);
        }
        System.out.println(newArr);*/
    }
}
