package com.arrays;

import java.util.ArrayList;
import java.util.List;

//Q4 2 String'in ortak alt String'i
public class Example35 {
    public static void main(String[] args) {
        String s1 = "abccccccddf";
        String s2 = "abccccdd";

        List<String> stringList1 = new ArrayList<>();
        List<String> stringList2 = new ArrayList<>();
        List<String> commonList = new ArrayList<>();

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 1; j <= s1.length(); j++) {
                if (j > i) {
                    stringList1.add(s1.substring(i, j));
                }
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if (j > i) {
                    stringList2.add(s2.substring(i, j));
                }
            }
        }

        for (String s : stringList1) {
            if (stringList2.contains(s)) {
                commonList.add(s);
            }
        }

        String enUzunString = commonList.get(0);
        for (String str : commonList) {
            if (str.length() > enUzunString.length()) {
                enUzunString = str;
            }
        }
        System.out.println(enUzunString);
    }
}
