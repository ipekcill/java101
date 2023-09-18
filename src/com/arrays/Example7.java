package com.arrays;

//dizideki max-min bulma
public class Example7 {
    public static void main(String[] args) {
        int[] arr = {3, -4, -5, 6, 10};
        int max = 0;
        int min = 1000000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println("MAX:" + max);
        System.out.println("MIN:" + min);
    }
}

   /* FOREACH :
   int[] list = {56, 34, 1, 8, 101, -2, -33};
    int min = list[0];
    int max = list[0];

        for (int i : list) {
            if (i < min) {
            min = i;
            }
            if (i > max) {
            max = i;
            }
            }

       System.out.println("Minimum Değer " + min);
       System.out.println("Maximum Değer " + max);*/