package exception;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=5;
        int b=1;
        int c;
        int []arr=new int[3];
        try{
            System.out.println("Program started");
            System.out.println(a/b);  // b=0 => ArithmeticException
            System.out.println("Division is finished");
            System.out.println("Enter number");
            c=sc.nextInt();      //InputMismatchException
            arr[10]=1;           // ArrayIndexOutOfBoundsException
        }catch(ArithmeticException e){
            System.out.println("Arithmetic exception detected");
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.toString());
        }finally {
            System.out.println(" This part will run");
        }

        System.out.println("Program is over");
    }
}
