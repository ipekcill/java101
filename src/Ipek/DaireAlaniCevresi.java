package Ipek;
import java.util.Scanner;


/**
 * @author OnurCil on 04/05/2023
 * @project Java101
 */
public class DaireAlaniCevresi {
    public static void main(String[] args) {
        double radius, pi=3.14,alan,cevre;
        Scanner input=new Scanner(System.in);
        System.out.print("Radius:");
        radius= input.nextDouble();
        alan = pi * (radius * radius);
        cevre= 2*pi*radius;

        //önceki örnekteki gibi koşul nasıl uygulanr?
        alan=(alan<20)? 10:alan;
        System.out.println("Alan:"+alan);
        System.out.println("Çevre:" +cevre);
    }
}
