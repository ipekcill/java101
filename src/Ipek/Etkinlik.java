package Ipek;

import java.util.Scanner;

public class Etkinlik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        System.out.println("Enter temp.");
        temp = sc.nextInt();
        if (temp < 5) {
            System.out.println("Kayak");
        }
        if (temp > 5 && temp <= 15) {
            System.out.println("Cinema");
        }
        if (temp >= 15 && temp < 25) {
            System.out.println("Picnic");

        } else {
            System.out.println("swimming");
        }
    }
}
