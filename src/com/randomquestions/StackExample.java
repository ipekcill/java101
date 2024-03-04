package com.randomquestions;

import java.util.Stack;

public class StackExample { //LIFO LAST IN FIRST OUT
    public static void main(String[] args) {
        Stack<String> s = new Stack();
        s.push("Ipek");
        s.push("Serkan");
        s.push("semen");
        System.out.println(s.peek());  // peek ile en son eklenen stacktan kaldırılmadan görüntülenir. pop ile kaldırılır.
        System.out.println(s);

    }
}
