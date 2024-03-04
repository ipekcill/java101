package com.exception;

public class q1 {
    public static String StringChallenge(int num) {

        int hours = num / 60;
        int minutes = num % 60;


        return hours + ":" + minutes;
    }
    public static void main(String[] args) {
//
        System.out.println(StringChallenge(45));
    }
}
