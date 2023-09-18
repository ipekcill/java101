package com.exception;

import java.util.Scanner;

public class ExceptionHandling5 {
    public static int findElement(int[] arr, int indices) { // throws ArrayIndexOutOfBoundsException{
        if (indices < arr.length && indices >= 0) {
            return arr[indices];
        } else {
            throw new ArrayIndexOutOfBoundsException("The limit index of the array has been exceeded.");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter indices of element");

        try {
            int indices = sc.nextInt();
            System.out.println(findElement(arr, indices));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
