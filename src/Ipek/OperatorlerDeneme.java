package Ipek;

/**
 * @author OnurCil on 29/04/2023
 * @project Java101
 */
public class OperatorlerDeneme {
    public static void main(String[] args) {
        int m=1, n=2;
        // Atama operatörleri  b=b+a b+=a olarak yazılabilir;
        n+=m;
        System.out.println(n);

        //Karşılaştırma operatörleri ==, >,<,<=,>=
        int x=5,y=5;
        boolean sonuc=x>=y;
        System.out.println(sonuc);

        //Mantıksal operatörler && ve, || veya, ! değili
        int a=5,b=5,c=1;
        boolean kosul1=a==b;
        boolean kosul2=c<(a-b);
        boolean sonuc1=kosul1||kosul2;
        System.out.println(!sonuc1);

        //Tek bir satırda göstermek için
        boolean sonuc2=((a==b)||(c<(a-b)));
        System.out.println("Deneme 2:" + sonuc2);

        // ekrana istenileni yazdırmak için sonuç doğruysa doğru değilse değil yazdırmaya çalıştım
        String str =sonuc2? "Doğru" : "Değil";
        System.out.println(str);
        //veya sayıyla bir şey yazdırmak için sonuç doğruysa 1 değilse 0 yazdırmaya çalıştım
        int result =sonuc? 1:0;
        System.out.println("Deneme 3:" + result);

        //yeni deneme
        int f=3,t=1,u=9;
        boolean secenek1=f==3*t;
        boolean secenek2=u<3*t;
        boolean cevap= secenek1&&secenek2;
        System.out.print("Deneme 4:");
        System.out.print(cevap);


        /* yorum
         Deneme4: false çıktısınu bu yazımla alabilmek için 2 yol:
        1. yol=System.out.print("Deneme 4:");
        System.out.print(cevap);
        2. yol=System.out.print("Deneme 4 :" + cevap);
         */
    }
}
