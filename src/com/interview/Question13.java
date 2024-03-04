package com.interview;

public class Question13 {
    //Finding subarrays
    public static void main(String[] args) {
        // The array elements
        int arr[] = {1,-2,4,-5,1};
        System.out.println("The subarrays are-");

        // For loop for start index
        for (int i = 0; i < arr.length; i++)

            // For loop for end index
            for (int j = i; j < arr.length; j++) {

                // For loop to print subarray elements
                for (int k = i; k <= j; k++)
                    System.out.print(arr[k] + " ");
                System.out.println("");
            }
    }
}
