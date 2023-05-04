package Ipek;
import java.util.Scanner;

/**
 * @author OnurCil on 03/05/2023
 * @project Java101
 */
public class HipotenusHesabi {
    public static void main(String[] args) {
        //değişkenleri tanımla
        int kenar1,kenar2;
        double hipotenus;
        //scanner sınıfı tanımla
        Scanner input=new Scanner(System.in);
        //kullanıcıdan verileri al
        System.out.print("kısa kenar:");
        kenar1=input.nextInt();
        System.out.println("uzun kenar:");
        kenar2=input.nextInt();
        hipotenus=Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
        System.out.println("Hipotenüs" +hipotenus);



    }
}
