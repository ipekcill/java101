package Ipek;
import java.util.Scanner;

/**
 * @author OnurCil on 04/05/2023
 * @project Java101
 */
public class BMIIndex {
    public static void main(String[] args) {
        double boy,kilo,BMI;
        Scanner input=new Scanner(System.in);
        System.out.print("Boy (m):");
        boy=input.nextDouble();
        System.out.print("Kilo (kg):");
        kilo=input.nextDouble();
        BMI=kilo/(boy*boy);
        System.out.println(BMI);
        boolean kosul1=BMI>32;
        String str=kosul1?  "Over":"Less";
        System.out.println(str);





    }
}
