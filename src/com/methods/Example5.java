package com.methods;
//recursive faktöriyel
public class Example5 {
    static int f(int input) {
        if ((input == 1) || (input == 0)) {
            return 1;
        }
        if (input<0){
            return 0;
        }
        

        return input * f(input - 1);
    }

    public static void main(String[] args) {
        System.out.println(f(-1));

    }
}
