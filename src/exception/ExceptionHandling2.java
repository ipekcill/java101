package exception;

import java.util.Scanner;

public class ExceptionHandling2 {
    public static void checkAge (int age) throws Exception { //General

        if (age<18){
            throw new Exception("Not available");
        }
        System.out.println("Available");

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        int age=sc.nextInt();
        try{
            checkAge(age);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
