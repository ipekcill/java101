package com.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question30 {
    public static void main(String[] args) {
        String str ="abbcdeceda" ;
        char ch ='a';
        Map<Character, List<Integer>> indicesMap = new HashMap<>();
        for (int i = 0; i<str.length(); i++){
            char c= str.charAt(i);
            if (!indicesMap.containsKey(c)){
                indicesMap.put(c,new ArrayList<>());
            }
            indicesMap.get(c).add(i);
        }
        System.out.println(indicesMap.get(ch));
    }
}
