package com.makeup;

import java.util.Scanner;

public class WhileLoopExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        boolean case1 = true;
        while (case1) {
            System.out.println("enter a year");
            year = sc.nextInt();
            if (year != 0) {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
                    System.out.println("Leap year");
                } else {
                    System.out.println("Not a leap year");
                }
            } else {
                case1 = false;
            }
        }
    }
}
// Yıl bilgisini program bizden sürekli istesin. Programdan çıkış için 0 girildiğinde program sonlansın.

