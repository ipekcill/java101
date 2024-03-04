package com.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question29 {
    public static void main(String[] args) {
        String str ="abbcdeceda" ;
        char ch ='a';
        Map<Character, List<Integer>> map = new HashMap<>();
        List <Integer> list = new ArrayList<>();
        for (int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
            if (ch == c){
                list.add(i);
                map.put(c,list);
            }
        }
        System.out.println(map);
    }
}
