package com.methods;

public class Example11 {
    public static void recursiveIslem(int sayi) {
        if (sayi <= 0) {
            System.out.println(sayi);
            return;
        }

        System.out.println("Çıkarma: " + sayi + " - 5 = " + (sayi - 5));
        recursiveIslem(sayi - 5);
        System.out.println("Ekleme: " + sayi + " + 5 = " + (sayi));
    }

    static void test() {
        if ("onur".equals("onur")) {
            System.out.println("ipek");
            return;
        }
        test();
        System.out.println("onur");
    }


    public static void main(String[] args) {
        test();
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = sc.nextInt();
        recursiveIslem(sayi);*/
    }

}

