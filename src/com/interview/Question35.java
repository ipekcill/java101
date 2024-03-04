package com.interview;

public class Question35 {

    public static void main(String[] args) {
        // Example usage
        String initialTime = "03:38";
        int n = 19;

        calculateCuckooTime(initialTime, n);


    }

    public static void calculateCuckooTime(String initialTime, int n) {

        String[] timeParts = initialTime.split(":");
        int hour = Integer.parseInt(timeParts[0]);
        int minute = Integer.parseInt(timeParts[1]);


        int cuckooCount = 0;

        while (cuckooCount < n) {

            if (minute!=60 && minute % 15 == 0) {
                cuckooCount += 1;
            }

            if (minute == 60) {
                minute = 0;
                hour += 1;
                cuckooCount += hour;
            }
            
            minute++;
        }
        System.out.println(hour + ":" + minute);



    }


}


