package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class Example59 {

    public static void main(String[] args) {

        String s1 = "abccba";

        List<String> stringList = new ArrayList<>();
        List<String> palList = new ArrayList<>();

        for (int i = 0; i < s1.length(); i++) {
            for (int j = i+1; j <= s1.length(); j++) {
                stringList.add(s1.substring(i, j));
            }
        }
        for (String s:stringList){
            StringBuilder stringBuilder=new StringBuilder(s);
             stringBuilder.reverse();
             if(s.contentEquals(stringBuilder)){
                palList.add(s);
             }
        }
        System.out.println(palList);
        System.out.println(palList.size());
    }
}
