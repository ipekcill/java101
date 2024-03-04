package Ipek;

import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int total = 1;
        /*do{
            System.out.println("enter year:");
             number=sc.nextInt();
             for (int i=1; i<=3; i++){
                 total*=number;
             }
            System.out.println(total);
             total=1;

        }while (number!=1);

         */
        boolean case1 = false;
        while (!case1) {
            System.out.println("enter number:");
            number = sc.nextInt();
            for (int i = 1; i <= 3; i++) {
                total *= number;

            }
            System.out.println(total);
            total=1;
            if ( number==0){
                case1=true;
            }

        }
    }
}
