package com.mix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example72 {
    public static void main(String[] args) {
        int[] arr = {31, 15, 7, 3, 2};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int number = arr[i];
            int count = 0;
            int remain = 0;
            while (arr[i] > 0) {
                remain = arr[i] % 2;
                if (remain == 1) {
                    count++;
                }
                arr[i] = arr[i] / 2;
            }
            map.put(number, count);
        }
      /*  for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Number " + key + " count " + value);
        }*/

        List<Integer> keys = new ArrayList<>(map.keySet());
        List<Integer> values = new ArrayList<>(map.values());

        // Değerleri küçükten büyüğe sırala ve anahtarları buna göre al
        for (int i = 0; i < values.size() - 1; i++) {
            for (int j = i + 1; j < values.size(); j++) {
                if (values.get(i) > values.get(j)) {
                    // Değerleri sırala
                    int temp = values.get(i);
                    values.set(i, values.get(j));
                    values.set(j, temp);

                    // Anahtarları da sırala
                    int tempKey = keys.get(i);
                    keys.set(i, keys.get(j));
                    keys.set(j, tempKey);
                }
            }
        }

        // Sıralanmış anahtarları ve değerleri ekrana bastır
        for (int i = 0; i < values.size(); i++) {
            System.out.println("Key: " + keys.get(i) + ", Value: " + values.get(i));
        }
    }
}
    //Bu kod örneğinde, keys ve values adında iki ayrı liste oluşturarak anahtarları ve değerleri ayrı ayrı bu listelere ekliyoruz. Daha sonra, değerleri sıralamak için basit bir sıralama algoritması kullanarak anahtarları da buna göre sıralıyoruz. Son olarak, sıralanmış anahtarları ve değerleri ekrana bastırıyoruz.







