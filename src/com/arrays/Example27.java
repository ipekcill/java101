package com.arrays;



//Q5 bir stringteki harf dışındaki karakterleri veren program
public class Example27 {
    public static void main(String[] args) {
        //StringBuilder sonuc = new StringBuilder();
        String str = "ab2c!fo?-u5";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isLetter(ch)) {
                System.out.println(ch);
            }
        }
    }
}

