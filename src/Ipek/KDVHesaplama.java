package Ipek;
import java.util.Scanner;
/**
 * @author OnurCil on 03/05/2023
 * @project Java101
 */
public class KDVHesaplama {
    public static void main(String[] args) {
        //KDV tutarını hesaplama KDV oranı: %18
        //değişken tanımla
        double price,kdvoran,kdvtutari,kdvlitutar;
        //Scanner sınıfını tanımla
        Scanner input=new Scanner(System.in);
        System.out.println("enter price value:");
        price=input.nextDouble();
        kdvoran=0.18;
        kdvtutari=price*kdvoran;
        kdvlitutar=kdvtutari+price;
        System.out.println("KDV tutarı:"+kdvtutari);
        System.out.println("KDV'li tutar:"+kdvlitutar);
        System.out.println("KDV Oranı:"+kdvoran);
        System.out.println("KDV'siz tutar:" +price);
       /*
       boolean kosul=kdvlitutar>120;
       String str=kosul? "Uygun değil":"Uygun";
       System.out.println(str);
        */
        String result;
        result= (kdvlitutar>120)? "Uygun değil":"Uygun";
        System.out.println(result);


    }
}
