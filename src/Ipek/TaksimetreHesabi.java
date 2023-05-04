package Ipek;
import java.util.Scanner;


/**
 * @author OnurCil on 03/05/2023
 * @project Java101
 */
public class TaksimetreHesabi {
    public static void main(String[] args) {
        //DATA: Kilometre başına 2.20 tl, min. ücret 2o tl (indi bindi), taksimetre açılış ücreti 10 tl,odenecektutar;
        double km,birimfiyat=2.20,odenecektutar=15;
        double minucret=20.0;
        Scanner girdi=new Scanner(System.in);
        System.out.println("km bilgisi giriniz:");
        km=girdi.nextDouble();
        odenecektutar+=(km*birimfiyat);
        odenecektutar = Math.max(odenecektutar, minucret);
        System.out.println("Ödeme miktarı:"+odenecektutar);

    }
}
