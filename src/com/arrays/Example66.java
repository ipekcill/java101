package com.arrays;

public class Example66 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 5, 3,2};
        int input = 1;
        int firstIndex = -1;
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == input) {
                firstIndex = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] == input) {
                        lastIndex = j;
                    }
                }
                break;
            }


        }
        if(lastIndex == -1 && firstIndex != -1)
            lastIndex = firstIndex;


        System.out.println(firstIndex);
        System.out.println(lastIndex);


    }
}

