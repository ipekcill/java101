package com.arrays;

import java.util.HashSet;
import java.util.Set;

//String içindeki ilk tekrar eden harfi bulup geri döndüren program (Metot ile) (hashMap ve hashSet ile çözüm)
public class Example20 {
    static String s(String word) {
        //Map<String, Integer> w=new HashMap<>();
        Set<String> w = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            String ch = word.substring(i, i + 1);
            //1.yol
            if (!w.add(ch)) {
                return ch;
            }
            //2.yol
            /*if(!w.contains(ch)){
                w.add(ch);
            }else{
                return ch;
            }*/
        }
        return null;
    }

    public static void main(String[] args) {
        String word= "ABCBA";
        System.out.println(s(word));

    }
}
