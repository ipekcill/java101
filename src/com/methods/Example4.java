package com.methods;
//1'den n'ye kadar olan sayıların toplamı
public class Example4 {
    static int sum(int a){
        int sum=0;
        for(int i=1; i<=a;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int result=sum(4);
        System.out.println("Result:" + result);

    }
}
