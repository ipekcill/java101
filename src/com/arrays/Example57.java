package com.arrays;

public class Example57 {
    public static void main(String[] args) {
        int[] dizi = {3, 2, 1, 2, 4, 1, 6}; // Örnek dizi

        int toplam = 0;

        for (int i = 0; i < dizi.length; i++) {
            boolean benzersiz = true;

            for (int j = 0; j < i; j++) {
                if (dizi[j] == dizi[i]) {
                    benzersiz = false;
                    break;
                }
            }

            if (!benzersiz) {
                int yeniEleman = dizi[i] + 1;
                boolean yeniBenzersiz;

                while (true) {
                    yeniBenzersiz = true;

                    for (int j = 0; j < dizi.length; j++) {
                        if (dizi[j] == yeniEleman) {
                            yeniBenzersiz = false;
                            break;
                        }
                    }

                    if (yeniBenzersiz) {
                        dizi[i] = yeniEleman;
                        break;
                    } else {
                        yeniEleman++;
                    }
                }
            }

            toplam += dizi[i];
        }

        // Sonuçları yazdır
        System.out.print("Benzersiz Dizi: [");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i]);
            if (i < dizi.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("Toplam: " + toplam);
    }
}

