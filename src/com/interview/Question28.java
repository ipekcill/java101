package com.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abcfbrcab";
        System.out.println("enter character: ");
        List<Integer> list = new ArrayList<>();
        char ch = sc.next().charAt(0);
        for (int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
            if (ch == c){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
