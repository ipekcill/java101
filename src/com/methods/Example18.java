package com.methods;

import java.util.ArrayList;
import java.util.List;

public class Example18 {
    public static void main(String[] args) {
        String s = "abcdf";
        List<String> subList = new ArrayList<>();
        for (int i = 0; i < s.length()-2; i++) {
            String subString = s.substring(i, i + 3);
            subList.add(subString);
        }
        System.out.println(subList);
    }
}
