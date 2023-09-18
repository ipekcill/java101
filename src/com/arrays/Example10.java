package com.arrays;

import java.util.Arrays;
import java.util.Scanner;
public class Example10 {
    //kullanıcıdan dizinin boyutunu ve elemanlarını alarak küçükten büyüğe sıralama
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the array: ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter" + i + ".element: ");
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

}
