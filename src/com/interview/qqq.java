package com.interview;

public class qqq {
    public static void main(String[] args) {
        int[] array = {5,34,78,2,45,1,99,23};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int num : array) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num!= max1) {
                max2 = num;
            }
        }
        System.out.println(max1);
        System.out.println(max2);


    }
}
