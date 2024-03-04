package com.exception;

import java.util.*;

public class ExceptionHandling3 {
    public static void checkMatch(Object s) throws InputMismatchException {
        if (s instanceof String) {
            throw new InputMismatchException("Mismatch detected");
        }
    }

    public static Map<Character, List<Integer>> createCharIndexMap(String word) {
        Map<Character, List<Integer>> charIndexMap = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (!charIndexMap.containsKey(ch))
                charIndexMap.put(ch, new ArrayList<>());
            charIndexMap.get(ch).add(i);

        }
        return charIndexMap;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the letter");
        Character s = sc.next().charAt(0);
        String word = "aba";

        try {
            checkMatch(s);
            Map<Character, List<Integer>> newMap = createCharIndexMap(word);

            List<Integer> indeks = newMap.get(s);
            System.out.println(indeks);
        } catch (InputMismatchException e) {
            System.out.println("Input mismatch detected");
            System.out.println(e.getMessage());
        }
    }
}

