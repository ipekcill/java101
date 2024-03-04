package com.exception;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class q2 {
    public static int MathChallenge(int num1, int num2) {
        Set<Integer> divisorsOfNum1 = new HashSet<>();
        List<Integer> commonDivisors = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                divisorsOfNum1.add(i);
            }
        }
        for (int i = 1; i <= num2; i++) {
            if (num2 % i == 0) {
                if (!divisorsOfNum1.add(i)) {
                    commonDivisors.add(i);
                }
            }
        }
        for (int divisor : commonDivisors) {
            if (divisor > max){
                max = divisor;
            }

        }
        return max;

    }

    public static void main(String[] args) {
        System.out.println(MathChallenge(36, 54));
    }
}
