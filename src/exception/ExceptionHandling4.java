package exception;

import java.util.Scanner;

public class ExceptionHandling4 {
    public static int calculate (int a, int b){
        if(b==0){
            throw new ArithmeticException("Can not divided 0");
        }
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        try {
            int number = sc.nextInt();
            System.out.println("Result: " + calculate(number,1));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("This part will work whether an exception occurs or not.");
        }
        System.out.println("Program is over");
    }
}



