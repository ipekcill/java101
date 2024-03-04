package com.mix;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
//Tekrar eden elemanın çıkarılarak dizinin yeniden yazdırılması
public class Example54 {
    public static void main(String[] args) {
        int[] arr = {6, 3, 3, 4, 8, 1, 4};
        Set<Integer> set = new HashSet<>();
        for (int eleman : arr) {
            set.add(eleman);
        }
        int[] arr2 = new int[set.size()];
        int i = 0;
        for (Integer eleman : set) {
            arr2[i] = eleman;
            i++;
        }
        System.out.println(Arrays.toString(arr2));

        /*for (int number : arr2) {
            System.out.print(number + " ");
        }*/
    }
}



