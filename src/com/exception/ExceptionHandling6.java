package com.exception;

public class ExceptionHandling6 {
    public static void main(String[] args) {
         String s=null;
         char ch= 'a';
        Character character = null;
        try{
            //System.out.println(s.toCharArray());
            System.out.println(character.toString());
        }catch (NullPointerException exception){
            System.out.println(exception.toString());
            System.out.println("Hata algılandı");
        }
    }
}
