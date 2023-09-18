package Ipek;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Değişkenler tanımlanır
        int mat, fizik, kimya, biyo, turkce, sum, count, avg;
        System.out.println("Mat");
        mat = sc.nextInt();
        System.out.println("Fizik");
        fizik = sc.nextInt();
        System.out.println("Kimya");
        kimya = sc.nextInt();
        System.out.println("Biyoloji");
        biyo = sc.nextInt();
        System.out.println("Türkçe");
        turkce = sc.nextInt();
        sum = 0;
        count = 0;

        if (mat>0 && mat<100) {
            //sum=sum+mat;
            sum += mat;
            count += 1;

        }
        if (fizik>0 && fizik<100) {
            sum += fizik;
            count += 1;
        }
        if (kimya>0 && kimya<100) {
            sum += kimya;
            count += 1;
        }
        if (biyo>0 && biyo<100) {
            sum += biyo;
            count += 1;
        }
        if (turkce>0 && turkce<100) {
            sum += turkce;
            count += 1;
        }
        avg=sum/count;
        System.out.println("Ortalamanız:" + avg);
    }
}
