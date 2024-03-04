package com.mix;

import java.util.HashSet;
import java.util.Set;
//Kelimedeki ilk tekrar eden harfi metotsuz yazdırma
public class Example19 {
    public static void main(String[] args) {

        Set<String> s = new HashSet<>();
        String word = "ABABC";
        for (int i = 0; i < word.length(); i++) {
            String ch=word.substring(i,i+1);
            if(!s.contains(ch)){
                s.add(ch);

            /*if(!s.add(ch)){
                System.out.println(ch);
                break;*/
            }else{
                System.out.println(ch);
                break;
            }
        }
    }
}
