package com.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question5 { // stringteki tekrar edenleri veren algoritma
    public static void main(String[] args) {
        Set<Character> charSet = new HashSet<>();
        List<Character> charList = new ArrayList<>();
        String s = "abbcddffag";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!charSet.add(ch)) {
                charList.add(ch);
            }
        }

        for(Character item:charList){
            System.out.println(item);
        }

    }

}

