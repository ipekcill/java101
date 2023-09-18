package com.arrays;

//Q4 dizideki elemanlardan çift olanları toplama eğer sayı tekrar etmişse bir kere al
import java.util.HashSet;
import java.util.Set;

public class Example28 {

    static void sum(int[]arr){
        Set<Integer> numbers= new HashSet<>();
        int sum=0;
        for (int i:arr){
            numbers.add(i);
        }
        for (Integer element: numbers){
            if (element%2==0){
                sum+=element;
            }
        }
        System.out.println(sum);

    }
    public static void main(String[] args) {

        int []arr={4,2,3,6,1,7,9,4};
        sum(arr);
    }
}
