package com.interview;

import java.util.ArrayList;
import java.util.List;

public class Question8 { // String içindeki tekrar edenleri ve tekrar sayılarını veren algoritma
    public static void duplicateChars(String word) {
        String tempWord = word;
        ArrayList list = new ArrayList();
        List<Character> list2 = new ArrayList<>();
        // aavvcca
        char tempChar;

        for (int i = 0; i < tempWord.length(); i++) {
            int count = 1;
            tempChar = tempWord.charAt(i);

            if (!list2.contains(tempChar)) {
                for (int j = i + 1; j < tempWord.length(); j++) {

                    if (tempChar == tempWord.charAt(j)) {
                        count++;

                    }
                }

                if (count > 1) {
                    list2.add(tempChar);
                    System.out.println(tempWord.charAt(i));
                    System.out.println(count );

                }
            }
        }
    }

    public static void main(String[] args) {
        duplicateChars("aavvccaddddd");

    }


}



