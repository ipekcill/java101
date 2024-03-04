package com.interview;

public class Question26 { //Sağ ve solda kalan sayıarın toplamı eşit olan indeksi bulma
    static int findEquilibriumIndex(int[] array) {
        int totalSum = 0;
        int leftSum = 0;

        // Calculate the total sum of the array
        for (int num : array) {
            totalSum += num;
        }

        // Iterate through the array to find the equilibrium index
        for (int i = 0; i < array.length; i++) {
            totalSum -= array[i];  // Subtract the current element from the total sum
            if (leftSum == totalSum) {
                return i;  // Return the current index if leftSum equals totalSum
            }
            leftSum += array[i];  // Add the current element to the left sum
        }

        // If no equilibrium index is found, return -1 or any appropriate value
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {20, 10, -80, 10, 10, 15, 35};
        int[] arr = {1, 2, 3, 4, 3, 2, 1};
        int equilibriumIndex = findEquilibriumIndex(arr);

        System.out.println("Equilibrium Index: " + equilibriumIndex);
    }
}
