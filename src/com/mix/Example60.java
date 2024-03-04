package com.mix;

public class Example60 {

    static StringBuilder s(String word){
        StringBuilder sb =new StringBuilder(word);

        return sb.reverse();
    }

    /*static String s(String word){
        String none="";
        for(int i=word.length()-1; i>=0; i--){
            char ch=word.charAt(i);
            none=none+ch;
        }
        return none;
    }*/
    public static void main(String[] args) {
        String word="ONUR";
        System.out.println(s(word));


    }
}
