package com.interview;

import java.util.ArrayList;
import java.util.List;

public class Question12 { //Bir stringin alt stringlerinden palindrom olanları veren algoritma
    public static List<String> findSubstrings (String str){
        List<String> substringList= new ArrayList<>();
        for(int i=0; i<str.length(); i++){
            for(int j=i+2; j<str.length()+1; j++){
                String str2=str.substring(i,j);
                substringList.add(str2);
            }
        }
        System.out.println(substringList);
        return substringList;
    }
    public static List<String> findPalindromSubstrings (List<String> list){
        List<String> palindromSubstringsList=new ArrayList<>();
        for(String item: list){
            StringBuilder sb=new StringBuilder(item);
            if(item.equals(sb.reverse().toString())){
                palindromSubstringsList.add(item);
            }
        }
        return palindromSubstringsList;
    }
    public static void main(String[] args) {
        String str="araba";
        List<String> list=findSubstrings(str);
        List<String>palindromList=findPalindromSubstrings(list);
        System.out.println("**************");
        System.out.println(palindromList);
    }
}
