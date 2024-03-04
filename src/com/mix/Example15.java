package com.mix;

import java.util.HashSet;
import java.util.Iterator;
//Set Interface ve HashSet kullanımı
public class Example15 {


    public static void main(String[] args) {
        HashSet<Integer>h=new HashSet<>();
        h.add(1);
        h.add(3);
        h.add(12);
        h.add(12);
        System.out.println(h);
        Iterator<Integer> itr=h.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        //System.out.println(h.size());
        for(Integer i:h){
            System.out.println(i);
        }

    }
}
