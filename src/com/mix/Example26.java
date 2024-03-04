package com.mix;

//Q 3 hatalı ve eksik sayı
public class Example26 {
    public static void main(String[] args) {

        int n=0;
        int m=0;

        int[] arr = {1, 2, 3, 4, 4, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i + 1] == arr[i]) {
                arr[i+1]=arr[i]+1;
                n=arr[i];
                m=arr[i+1];
                break;
            }
        }
        System.out.print(n +" ");
        System.out.print(m);


    }
}
