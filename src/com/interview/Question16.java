package com.interview;

public class Question16 { // stringin string builder ile tersten yazdırılması
    public static void main(String[] args) {

        String s="abcdef";
        StringBuilder sb=new StringBuilder(s);
        String reverseStringS= sb.reverse().toString();
        System.out.println(reverseStringS);
    }
}
