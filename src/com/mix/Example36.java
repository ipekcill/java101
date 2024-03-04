package com.mix;
//Yıldızlar ile X
import java.util.Scanner;

public class Example36 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Satır sayısını girin: ");
        int satirSayisi = scanner.nextInt();

        for (int i = 1; i <= satirSayisi; i++) {
            for (int j = 1; j <= satirSayisi; j++) {
                // X harfini oluşturmak için koşul ifadelerini kullanırız
                if (j == i || j == (satirSayisi - i + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Her satırın sonunda yeni bir satır başı ekler
        }

    }
}
