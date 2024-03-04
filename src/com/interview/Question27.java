package com.interview;

public class Question27 { //Sağ ve solda kalan sayıarın toplamı eşit olan indeksi bulma
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,3,2,1};

        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            int leftSum = sum- arr[i];
            int rightSum = totalSum-sum;
            if ( leftSum == rightSum){
                System.out.println(i);
            }

        }
    }
}
