package com.exception;

import java.util.*;

public class ExceptionHandling8 {
    public static void main(String[] args) {

        String str = "abbcdeceda";
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter character : ");
            char character = sc.next().charAt(0);
            List<Integer> list = findIndices(str, character);
            System.out.println(list);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
    public static List<Integer> findIndices(String string, char character) throws NullPointerException {
        Map<Character, List<Integer>> indicesMap = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (!indicesMap.containsKey(ch)) {
                indicesMap.put(ch, new ArrayList<>());
            }
            indicesMap.get(ch).add(i);
        }
        if (indicesMap.get(character).isEmpty()) {
            throw new NullPointerException("String does not involve the character you entered");
        }
        return indicesMap.get(character);
    }

}


