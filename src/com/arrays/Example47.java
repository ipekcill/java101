package com.arrays;

// StringBuilder ile bir stringin tersten yazdırılması
public class Example47 {
    static String reversedString(String word) {

        StringBuilder reversed = new StringBuilder(word);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        String word = "Ipek";
        System.out.println(reversedString(word));

        //StringBuilder stringBuilder = new StringBuilder();

     /*   for (int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            stringBuilder.append(ch);
        }
        System.out.println(stringBuilder);*/



        /*String reverse= stringBuilder.reverse().toString();
        System.out.println(reverse);*/

        /*String stringReverse=" ";
        for (int i = string.length()-1; i >=0; i--) {
            char ch=string.charAt(i);
            stringReverse+= ch;
        }
        System.out.println(stringReverse);*/
    }
}
