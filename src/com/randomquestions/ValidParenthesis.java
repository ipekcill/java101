package com.randomquestions;

import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.size() == 0) {
                    return false;
                } else {
                    char lastCh = stack.pop();
                    if (ch == ')' && lastCh != '(') {
                        return false;
                    }
                    if (ch == ']' && lastCh != '[') {
                        return false;
                    }
                    if (ch == '}' && lastCh != '{') {
                        return false;
                    }


                }
            }

        }
        return stack.size() == 0 ? true : false;
    }

        public static void main (String[]args){
            String str = "{}()[]";
            System.out.println(isValid(str));
        }
    }
