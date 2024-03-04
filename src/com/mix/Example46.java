package com.mix;

import java.util.ArrayList;
import java.util.List;

//Bir stringteki harf dışındaki karakterler metotlu çözüm
public class Example46 {
    static List<Character> charactersThatNotLetter (String s){ // bu metot bir listeyi geri döndüreceği için veri tipi liste. Alacağı parametre ise kullanıcının girdiği string olacak.
        List<Character>list=new ArrayList<>(); // Listeyi oluşturduk
        for (int i=0; i<s.length(); i++){
            if (!Character.isLetter(s.charAt(i)))
            list.add(s.charAt(i)); // karakter eğer harf değilse listeye ekledi.

        }
        return list; // listeyi döndü
    }
    public static void main(String[] args) {
        String s="ab-?:ddf6";
        System.out.println(charactersThatNotLetter(s));

    }
}
