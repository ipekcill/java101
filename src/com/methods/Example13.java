package com.methods;

public class Example13 {
    public static void main(String[] args) {
            System.out.println("1'den 100'e kadar olan asal sayılar:");
            for (int i = 2; i <= 100; i++) {
                if (asalMi(i)) {
                    System.out.println(i);
                }
            }
        }

        public static boolean asalMi(int sayi) {
            if (sayi <= 1) {
                return false;
            }
            for (int i = 2; i <= sayi-1; i++) {
                if (sayi % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


