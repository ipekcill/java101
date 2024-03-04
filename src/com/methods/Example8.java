package com.methods;

import java.util.Scanner;

public class Example8 {
    static int sum(int a, int b){
        return a+b;
    }
    static int minus (int a, int b) {
        return a - b;
    }
    static void multp (int a, int b) {
        System.out.println(a*b);
    }
    static int div (int a, int b) {
        return a /b;
    }
    static int power(int a, int b){
       int result=1;
       for (int i=1; i<=b; i++){
           result*=a;
       }
       return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isLoopContinue = true;
        while (isLoopContinue) {

            String menu = "1.Sum \n 2. Minus \n 3. Multiplication \n 4. Division \n 5. Power";
            System.out.println(menu);
            System.out.println("Make your selection");
            int select = sc.nextInt();
            if (select == 0) {
                isLoopContinue = false;
            } else {
                System.out.println("enter first number: \n enter second number:");
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                switch (select) {
                    case 1:
                        System.out.println(sum(n1,n2));
                        break;

                    case 2:
                        System.out.println(minus(n1,n2));
                        break;
                    case 3:
                        multp(n1,n2);
                        break;
                    case 4:
                        System.out.println(div(n1,n2));
                        break;
                    case 5:
                        System.out.println(power(n1,n2));
                        break;
                    default:
                         System.out.println("Error: Invalid Choice");

                }

            }

        }
    }
}


