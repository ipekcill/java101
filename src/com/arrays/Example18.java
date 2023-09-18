package com.arrays;

import java.util.HashMap;
import java.util.Map;

//Map-HashMap kullanarak bir dizideki tekrar eden elemanları ve tekrar sayılarını bulan program
public class Example18 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 5, 4, 6, 7, 8, 8};
        Map<Integer, Integer> tekrarlar = new HashMap<>();

        for (int eleman : arr) {
            if (tekrarlar.containsKey(eleman)) {
                // Eleman daha önce görülmüşse, tekrar sayısını artırın
                int tekrarSayisi = tekrarlar.get(eleman);
                tekrarlar.put(eleman, tekrarSayisi + 1);
            } else {
                // Eleman ilk kez görülüyorsa, haritaya ekleyin ve tekrar sayısını 1 olarak ayarlayın
                tekrarlar.put(eleman, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : tekrarlar.entrySet()) {
            int eleman = entry.getKey();
            int tekrarSayisi = entry.getValue();
            if (tekrarSayisi > 1) {
                System.out.println(eleman + " elemanı " + tekrarSayisi + " kez tekrarlanıyor.");
            }
        }

        // Başka bir öenek: ekrana verileri bastırma
        /*HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Elma", 3);
        hashMap.put("Armut", 5);
        hashMap.put("Muz", 2);

        // Tüm verileri dolaşarak ekrana bastırın
        hashMap.forEach((anahtar, deger) -> {
            System.out.println(anahtar + ": " + deger);
        });*/
    }
}




