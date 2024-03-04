package com.randomquestions;

import java.util.HashMap;
import java.util.Map;

public class QuestionMarks {
    public static void main(String[] args) {

        int lastNum;
        String str = "9???1???9??1???9";
        int questionMarksCount = 0;
        Map<Integer, Integer> map = new HashMap<>();
        char[] chrArr = str.toCharArray();
        for (int i = 0; i < chrArr.length; i++) {
            if (Character.isDigit(chrArr[i])) {
                int currentNum = Character.getNumericValue(chrArr[i]);

                for (int j = i + 1; j < chrArr.length; j++) {

                    if (chrArr[j] == '?') {
                        questionMarksCount++;
                    }
                    if (Character.isDigit(chrArr[j])) {
                        lastNum = Character.getNumericValue(chrArr[j]);
                        int sum = lastNum + currentNum;
                        map.put(sum, questionMarksCount);
                        currentNum = lastNum;
                        questionMarksCount = 0;

                    }

                }
            }
        }
        int count = map.size();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (count == 1) {
                if (entry.getKey() == 10 && entry.getValue() == 3) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }

            } else if (count > 1) {
                int key = entry.getKey();
                int value = entry.getValue();
                if (key == 10) {
                    if (value == 3) {
                        System.out.println("true");
                    } else if (value != 3) {
                        System.out.println("false");
                    }
                }
                /*if (value == 3) {
                    if (key == 10) {
                        System.out.println("true");
                    } else {
                        System.out.println("false");
                    }
                }*/

            }
        }
    }
}
