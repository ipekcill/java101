package com.mix;

import java.util.HashSet;
import java.util.Set;

// Bir dizideki tekrar edenleri çıkarıp diziyi yeniden yazdırma metot ile for each kullanarak,
public class Example50 {
    static Set< Integer> set(int[] arr){
        Set<Integer>set=new HashSet<>();
        for (int eleman:arr){
            set.add(eleman);
        }
        return set;
    }

    public static void main(String[] args) {
        int [] arr={2,1,3,2,1,4,5,2};
        System.out.println(set(arr));

    }

}
