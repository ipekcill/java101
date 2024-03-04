package com.mix;
//Q7 ilk 50 asal sayıyı yazdırma
public class Example30 {
    public static void main(String[] args) {
        int count = 0;
        boolean isLoop = true;

        while (isLoop) {

            for (int i = 2; i <= 300; i++) {
                boolean isPrime =true;
                //int ctrl = 0;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        //ctrl = 1;
                        isPrime=false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(i + " ");
                    count++;
                    if(count%10==0){
                        System.out.println();
                    }
                }
                if (count == 50) {
                    isLoop = false;
                    break;
                }

            }


        }
    }
}








 /*for(int sayi=2;sayi<=100;sayi++) {
            int kontrol = 0;
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    kontrol = 1;
                    break;
                }
            }
            if(kontrol==0) {
                System.out.print(sayi+"\n");
            }
        }*/
