package Ipek;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter character");
        String st = sc.nextLine();
        int stringSize = st.replaceAll("\\s", "").length();

        if (stringSize % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");


    }
}
