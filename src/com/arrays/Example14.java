package com.arrays;

import java.util.HashSet;

//Dizideki tekrar eden sayıları bulma (HashSet ile)
public class Example14 {
    public static void main(String[] args) {
        int[] dizi = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 8};

        // Tekrar eden sayıları bulmak için HashSet kullanma
        HashSet<Integer> benzersizElemanlar = new HashSet<>();
        HashSet<Integer> tekrarEdenler = new HashSet<>();

        for (int eleman : dizi) {
            if (!benzersizElemanlar.add(eleman)) {
                // Ekleme başarısız olduysa, bu eleman daha önce eklenmiş demektir
                tekrarEdenler.add(eleman);
            }
        }

        // Tekrar eden sayıları yazdırma
        System.out.println("Tekrar eden sayılar: " + tekrarEdenler);
    }
}

