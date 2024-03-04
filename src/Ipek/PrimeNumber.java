package Ipek;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        boolean isPrime = true;
        int number;

        do {
            System.out.println("Enter number");
            number = sc.nextInt();
            if (number == 1) {
                isPrime = false;
                System.out.println("not prime");
            } else {
                for (int i = 2; i <= number - 1; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;

                    } else {
                        isPrime = true;
                    }
                }
                if (isPrime) {
                    System.out.println("Prime");
                } else {
                    System.out.println("not prime");
                }
            }


        } while (number != 0);
    }
}




