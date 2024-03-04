package com.mix;
//Q2 Girilen sayının tersten başlanarak ilk rastlanan 1 den sonra kalan tüm sıfırların bire, birlerin sıfıra dönüşütürülmesi
public class Example32 {
    public static void main(String[] args) {
        String s = "1100110101010100000";
        StringBuilder result = new StringBuilder();

        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);

            if(j >= s.lastIndexOf("1"))
                result.append(ch);

            if (j < s.lastIndexOf("1")) {
                switch (ch) {
                    case '1'-> {
                        result.append('0');
                    }
                    case '0' -> {
                        result.append('1');
                    }
                }
            }
        }
        System.out.println(result);
    }
}



