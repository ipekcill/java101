package com.mix;
import java.util.Arrays;
public class Example48 {
    public static void main(String[] args) {

        String s="IPEK";
        StringBuilder stringBuilder=new StringBuilder(s);
        int[]arr={1,2,3,4};
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        String b="onur";
        String a= Arrays.toString(arr);
        System.out.println(a);
        stringBuilder.append(b);
        System.out.println(stringBuilder);


    }
}
