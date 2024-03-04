package com.methods;
//Overloading

public class Example7 {
    static void print(){
        System.out.println("helloWorld!");
    }
    static void print(int a){
        System.out.println(a);
    }
    static void print(int a,int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        print();
        print(3);
        print(2+3);


    }
}
