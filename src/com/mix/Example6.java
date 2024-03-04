package com.mix;
// dizideki elemanların ortalaması
public class Example6 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        double sum=0.0;
        for(int i=0;i<arr.length; i++){
            sum+=arr[i];
        }
         double avg=sum/arr.length;
        System.out.println(avg);
    }
}
