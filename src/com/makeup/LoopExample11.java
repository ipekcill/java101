package com.makeup;

public class LoopExample11 {
    public static void main(String[] args) {
        int a=-15, b=6;

        a = Math.abs(a);
        b = Math.abs(b);

        int newNumber=0;
        for (int i=1; i<=a; i++){
            if (i%b==0){
                newNumber=i;
            }
        }
        if (( a-newNumber)<((newNumber+b)-a)){

            System.out.println(newNumber);
        }else{
            newNumber=newNumber+b;
            System.out.println(newNumber);
        }
    }
}
