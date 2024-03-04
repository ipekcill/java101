package com.makeup;

import java.util.Scanner;

public class LeapYearExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Artık Yıl Nasıl Hesaplanır?

Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:

1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.
100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:

Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.

         */

        System.out.println(" enter a year");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");

        }
    }
}
