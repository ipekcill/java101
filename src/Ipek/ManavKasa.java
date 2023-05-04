package Ipek;
import java.util.Scanner;


/**
 * @author OnurCil on 04/05/2023
 * @project Java101
 */
public class ManavKasa {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67, domates=1.11,muz=0.95,patlıcan=5.00, kgarmut,kgelma,kgdomates,kgmuz,kgpatlıcan,total;
        Scanner input=new Scanner(System.in);
        System.out.print("Armut (kg):");
        kgarmut=input.nextDouble();
        System.out.print("Elma (kg):");
        kgelma=input.nextDouble();
        System.out.print("Domates (kg):");
        kgdomates=input.nextDouble();
        System.out.print("Muz (kg):");
        kgmuz=input.nextDouble();
        System.out.print("Patlıcan (kg):");
        kgpatlıcan=input.nextDouble();
        total=muz*kgmuz+elma*kgelma+armut*kgarmut+patlıcan*kgpatlıcan+domates*kgdomates;
        System.out.println("Toplam ödenecek tutar:"+total);
    }
}
