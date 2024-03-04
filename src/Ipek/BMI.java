package Ipek;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double boy, kilo, index;
        System.out.println("Boy:");
        boy = sc.nextDouble();
        System.out.println("Kilo");
        kilo = sc.nextDouble();
        index = kilo / (boy * boy);
        System.out.println("BMI:" + index);
        if (index < 18) {
            System.out.println("Less");
        }else if (index > 30) {
            System.out.println("Over");
        } else
            System.out.println("Normal");
    }


    }

