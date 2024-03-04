package com.interview;

import java.util.ArrayList;
import java.util.List;

public class Question2 { // ARRAY İÇİNDEKİ SAYILARDAN TOPLAMLARI VERİLEN TARGET DEĞERİNE EŞİT OLAN SAYILARIN INDIS NUMARALARINI VEREN ALGORİTMA
    public static List<Integer> findIndexOfNumbers(int[] arr) {
        List<Integer> indexOfNumbers=new ArrayList<>();
        int target = 9;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target){
                    indexOfNumbers.add(i);
                    indexOfNumbers.add(j);
                }
            }
        }
        return indexOfNumbers;
    }

    public static void main(String[] args) {
        int[]arr={2,7,11,15};
        System.out.println(findIndexOfNumbers(arr));

    }
}
