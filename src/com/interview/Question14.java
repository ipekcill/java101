package com.interview;

public class Question14 {
    //the algorithm that gives have negative sum subarrays of given array
    public static int findNumberOfNegativeSubarrays (int n, int[]arr){
        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum < 0) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, -2, 4, -5, 1};
        int n=arr.length;
        System.out.println(findNumberOfNegativeSubarrays(n,arr));
    }
}



