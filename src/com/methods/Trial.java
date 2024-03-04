package com.methods;

public class Trial {
    public static String getName(String name){
        return name;
    }
    static void setName(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        String name="ppp";
        System.out.println(getName(name));
        setName("ooo");
    }
}
