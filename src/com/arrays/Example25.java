package com.arrays;
//Q2 2 tane dizideki elemanları karşılaştırıp aynı elemanları veren program
import java.util.HashSet;
import java.util.Set;

public class Example25 {
    public static void main(String[] args) {
        Set<Integer>numbers=new HashSet<>();
        int[]arr1={2,4,6};
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        int []arr2={1,3,4,5,6};
        for (int i=0; i<arr2.length; i++){
            if(!numbers.add(arr2[i])){
                System.out.print(  arr2[i] + " , ");
            }
        }

    }
}
