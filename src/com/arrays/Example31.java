package com.arrays;
// JAVA SORU SETİ 2
//Q1: Bir metin içindeki geçen harflerin frekansları

import java.util.HashMap;
import java.util.Map;

public class Example31 {
    public static void main(String[] args) {

        String test ="Hello world";
        String test1=test.toLowerCase();
        String newTest= test1.replaceAll("\\s", "");
        Map<String, Integer>map=new HashMap<>();


        for(int i=0; i<newTest.length(); i++){
            String ch=newTest.substring(i,i+1);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);

            }else{
                map.put(ch,1);
            }
        }
        //map.entrySet().forEach(System.out::println); // Java Stream API
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println( entry.getKey()  + " harfi "  + entry.getValue()+ " kez tekrar ediyor.");
        }

        //map.forEach((key, value) -> System.out.println(key + ": " + value));


    }
}
