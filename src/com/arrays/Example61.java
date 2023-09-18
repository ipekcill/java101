package com.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example61 {
    public static void main(String[] args) {
        String s="AAAAACCCCCAAAAACCCCCAAAAGGGTTT";
        List<String>list=new ArrayList<>();
        Set<String > set2=new HashSet<>();
        Set<String > set=new HashSet<>();

        for (int i=0; i<s.length()-9; i++){
            list.add(s.substring(i,i+10));
        }
        for (String s2:list){
            StringBuilder sb=new StringBuilder(s2);
            list.add(sb.reverse().toString());
        }


        for (String s3:list){
            if(!set.add(s3)){
                set2.add(s3);
            }
        }
        System.out.println(set2);
        System.out.println(set2.size());
    }
}
