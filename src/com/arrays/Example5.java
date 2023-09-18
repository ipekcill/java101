package com.arrays;
import java.util.Arrays;
public class Example5 {
    public static void main(String[] args) {
        int[] arr = {1, 6, 3, -1, -5};
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr, 2);
        Arrays.fill(arr,0,2,5);
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, 6);
        System.out.println(index);

        int[] liste = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};

        int[] copyArray = Arrays.copyOf(liste, 3);
        System.out.println(Arrays.toString(copyArray));

        int[] copyOfRangeArray = Arrays.copyOfRange(liste, 0, 5);
        System.out.println(Arrays.toString(copyOfRangeArray));

        int[] list1 = {1, 2, 3};
        int[] list2 = {1, 2, 3};
        int[] list3 = {1, 2, 10};

        System.out.println(Arrays.equals(list1, list2)); // true
        System.out.println(Arrays.equals(list2, list3)); // false*/
    }


}

