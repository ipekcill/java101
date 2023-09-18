package com.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example51 {
    static Set<Integer> set(int []arr){
        Set<Integer> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        for(int number: arr){
            if(set.contains(number)){
                list.add(number);
            }else{
                set.add(number);
            }
        }
        return set;
    }
    public static void main(String[] args) {
        /*Set<Integer> set=new HashSet<>();
        List<Integer>list=new ArrayList<>();
        for (int number: arr){
            if(set.contains(number)){
                list.add(number);
            }else{
                set.add(number);
            }
        }
        System.out.println(list);
        System.out.println(set);
*/
        int []arr={1,2,3,3,4,1,2,4,3};
        System.out.println(set(arr));
    }
}
