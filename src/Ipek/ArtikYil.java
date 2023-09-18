package Ipek;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.print("Enter year:");
        year = sc.nextInt();
        if ((year % 4 == 0 && !(year %100 == 0))|| (year % 100 == 0 && year % 400 == 0)) {
            System.out.println("Artık yıl");
        } else {
            System.out.println("Artık yıl değil");

        }
    }
}
