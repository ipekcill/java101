package com.arrays;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

//Kullanıcıdan alınan değerlerin bir listeye eklenmesi ve listenin return edilmesi
public class Example71 {
    public static List<Integer> createList (int[]arr) {
        List<Integer> list = new ArrayList<>();
        for(int number: arr){
            list.add(number);
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" how many number will you give");
        int number = sc.nextInt();
        int[] arr = new int[number];
        try {
            int startIndex = 0;
            for (int i = 1; i <= number; i++) {
                System.out.println("Enter " + i + " . number :");
                int enteredValue = sc.nextInt();
                arr[startIndex] = enteredValue;
                startIndex++;

            }
            System.out.println( "List : " + createList(arr));
        }catch (InputMismatchException e){
            System.out.println(e.toString());
        }



    }
}
