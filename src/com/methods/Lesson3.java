package com.methods;
// metotlar ile üslü sayı hesaplama

public class Lesson3 {
    static int power(int a,int b){

        int result=1;
        for (int i=1;i<=b;i++){
            result*=a;
            if ( b==0){
                return 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(power(2,0));

    }
}
