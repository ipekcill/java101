package com.methods;

public class Lesson2 {
    //overloading
    static void print (){

        System.out.println("Ipek");
    }
    static void print (String name){

        System.out.println(name);
    }
    static void print (int a){
        System.out.println(a);
    }
    static int print(int a,int b){

        return a+b;
    }


    public static void main(String[] args) {
        print();
        print("onur");
        print(3);
        System.out.println(print(3,4));

    }
}
