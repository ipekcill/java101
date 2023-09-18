package com.exception;

import java.util.Scanner;

public class CustomExceptionExample {
    public static int findElement(int[] arr, int indices) throws CustomException{
        if (indices < arr.length && indices >= 0) {
            return arr[indices];
        }
        if (indices<0){

            throw new CustomException("Enter a number greater than -1");
        }
        throw new ArrayIndexOutOfBoundsException("The limit index of the array has been exceeded.");
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
        }catch (CustomException e ){
            System.out.println("Special exception has been detected: " + e.getMessage());
        }
    }
}

