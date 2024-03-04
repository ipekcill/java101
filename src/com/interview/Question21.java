package com.interview;

import java.util.*;

public class Question21 { // girilen sayının indis numarasını döndüren uygulama map ile çözümü- exception handling uygulaması
    public static List<Integer> findIndices(int number, int[] arr) throws NullPointerException {
        Map<Integer, List<Integer>> indicesMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!indicesMap.containsKey(arr[i])) {
                indicesMap.put(arr[i], new ArrayList<>());
            }
            indicesMap.get(arr[i]).add(i);
        }
        List<Integer> indicesList = indicesMap.get(number);
        if (indicesList == null || indicesList.isEmpty()) {
            throw new NullPointerException("Array does not contain the entered number");
        }
        return indicesMap.get(number);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 4, 5,1};
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter one of the numbers in the array: ");
            int number = sc.nextInt();
            List<Integer> list = findIndices(number, arr);
            System.out.println(list);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}

