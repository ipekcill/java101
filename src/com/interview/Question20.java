package com.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question20 {
    // girilen sayının hangi indislere denk geldiğini veren algoritma - exception handling uygulaması
    public static List<Integer> findIndices(int[] arr, int number) throws NullPointerException {
        List<Integer> indicesList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                indicesList.add(i);
            }
        }
        if ( indicesList.isEmpty()){
            throw new NullPointerException(" not found ");
        }
        return indicesList;
    }


        public static void main (String[]args){
            int[] arr = {1, 2, 3, 1, 2, 1, 4, 5};
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter one of the numbers in the array: ");
                int number = sc.nextInt();
                List<Integer> newList = findIndices(arr, number);
                System.out.println(newList);
            } catch ( NullPointerException e) {
                System.out.println(e.getMessage());
            }
        }
    }



