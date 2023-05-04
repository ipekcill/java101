package Ipek;
import java.util.Scanner;


/**
 * @author OnurCil on 03/05/2023
 * @project Java101
 */
public class NotOrtalamasiHesabi {
    public static void main(String[] args) {
        //değişkenleri tanımla
        int mat,fizik,kimya,biyo,toplam;
        double ortalama;
        //Scanner sınıfı tanımla
        Scanner input=new Scanner (System.in);
        //Kullanıcıdan değerleri al
        System.out.print("Mat notu:");
        mat=input.nextInt();
        System.out.print("Fizik notu:");
        fizik=input.nextInt();
        System.out.print("Kimya notu:");
        kimya=input.nextInt();
        System.out.print("Biyoloji notu:");
        biyo=input.nextInt();
        toplam=mat+fizik+kimya+biyo;
        ortalama= toplam/4.0;
        System.out.println("Ortalama:"+ortalama);
        //ortalama >60 geçti, <60 kaldı koşulunu uygula
        boolean durum1=ortalama>=60;
        String str=durum1? "Geçti" :"Kaldı";
        System.out.println("Dersi geçme durumu:" + str);


        }
}
