package com.arrays;

import java.util.HashSet;
import java.util.Set;
//Bir stringtki tekrar eden ve etmeyenleri yazdıran program
public class Example22 {
    public static void main(String[] args) {
        Set<String> repeaters = new HashSet<>();
        Set<String> s = new HashSet<>();


        Set<String> onlyOnes = new HashSet<>();
        String str = "ABCADBTGTG";

        for (int i = 0; i < str.length(); i++) {
            String ch = str.substring(i, i + 1);

            if (!s.add(ch)) {
                repeaters.add(ch);
            }

        }
        for (int i = 0; i < str.length(); i++) {
            String ch = str.substring(i, i + 1);

            if (!repeaters.contains(ch)) {
                onlyOnes.add(ch);
            }
        }
        System.out.println(repeaters);
        System.out.println(onlyOnes);


    }
}


