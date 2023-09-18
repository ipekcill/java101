package com.arrays;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Example16 {
    public static void main(String[] args) {
        //Queue interface ve linkedlist kullanımı
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(10);
        q.add(-4);
        q.add(1);
       // q.remove(10);
       // q.peek();
        System.out.println(q);
        Iterator<Integer> itr=q.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        for (Integer number:q){
            System.out.println(number);
        }
    }
}
