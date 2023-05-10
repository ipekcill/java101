package Ipek;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int km , age, type;
        double perkm = 0.10;


        System.out.print("Age:");
        age = sc.nextInt();
        System.out.print("Type:");
        type = sc.nextInt();
        System.out.print("km:");
        km = sc.nextInt();
        double price = perkm * km * type;
        if (((km > 0) && (age > 0)) && (type == 1 || type == 2)) {
            if ((age < 12) && (type == 1)) {
                price = 0.5 * price;
            } else if (age < 12) {
                price = price * 0.5;
                price = price * 0.8;
            }
            if (((age > 12) && (age < 24)) && (type == 2)) {
                price = price * 0.9;
                price = price * 0.8;
            } else if (age > 12 && age < 24) {
                price = price * 0.9;
            }
            if ((age > 65) && (type == 2)) {
                price = price * 0.7;
                price = price * 0.8;
            } else if (age > 65) {
                price = 0.7 * price;
            }
        } else {
            System.out.println("Hatalı");
        }
        System.out.println("Price:" + price);
    }
}


