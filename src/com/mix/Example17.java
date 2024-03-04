package com.mix;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

//Map Interface; HashMap ve HashTable
public class Example17 {
    public static void main(String[] args) {
        Map<Integer, Integer> c = new HashMap<>();
        Map<Integer, String> c2 = new Hashtable<>();
        c.put(0, 28);
        c.put(1, 0);
        c.put(2, 6);
        //System.out.println(c.get(2));
        // c.remove(1);
        for (Integer numbers : c.values()) {
            System.out.println(numbers);
        }
        for (Integer nu : c.keySet()) {
            System.out.println(nu);
        }
        for (Integer numb : c.keySet()) {
            System.out.println(c.get(numb));
        }
        /*for(Map.Entry value:c.entrySet() ){
            System.out.println(value.getValue());
            System.out.println(value.getKey());
        }*/
    }
}
