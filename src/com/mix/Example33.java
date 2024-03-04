package com.mix;
//Q3 2 String'teki ortak harfler ve indisleri

import java.util.HashMap;
import java.util.Map;

public class Example33 {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String s1 = "kalemlik";
        String s2 = "kelam";

        for (int i = 0; i < s2.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i))
                map.put(s1.charAt(i), i);

        }
        System.out.println(map);
    }
}

/*
char (primitive type) --> Character (obje)
int --> Integer
double --> Double
boolean --> Boolean
*/
