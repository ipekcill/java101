package com.mix;

import java.util.Arrays;
import java.util.Scanner;

//Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve büyük en yakın sayıyı bulan programı yazınız.
public class Example8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3, 6, 44, 78, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int nearSmall = 0;
        int nearBig = 0;

        boolean isQuestion = true;
        while (isQuestion) {
            System.out.print("Enter number: ");
            int number = sc.nextInt();
            if (number != 0) {
                for (int i = 0; i < arr.length; i++) {
                    if (number - arr[i] < number && number - arr[i] > 0) {
                        nearSmall = arr[i];
                    }
                    if (arr[i] - number > number && arr[i] - number > 0) {
                        break;
                    }
                    nearBig = arr[i];
                }
                System.out.println(nearSmall);
                System.out.println(nearBig);

            } else {
                isQuestion = false;
                break;
            }
        }
    }
}
