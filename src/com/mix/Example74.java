package com.mix;

import java.util.ArrayList;
import java.util.List;
// Verilen stringin tersten yazdırılıp verilen karakterin denk geldiği indexleri döndüren algoritma
public class Example74 {
    public static String findReverse(String string){
        StringBuilder stringBuilder = new StringBuilder(string);
        String reverseStr= stringBuilder.reverse().toString();
        return reverseStr;
    }
    public static List<Integer> findIndicesOfGivenCharacter (String reverseString, Character character){
        List<Integer> indicesList =new ArrayList<>();
        for(int i=0; i<reverseString.length(); i++){
            Character ch = reverseString.charAt(i);
            if(ch==character){
                indicesList.add(i);

            }
        }
        return indicesList;
    }

    public static void main(String[] args) {
        String str="koopeng";
        String reverseStr=findReverse(str);
        Character character='o';
        List<Integer>indices=findIndicesOfGivenCharacter(reverseStr,character);
        System.out.println(indices);
    }
}
