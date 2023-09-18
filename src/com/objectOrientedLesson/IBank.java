package com.objectOrientedLesson;

public interface IBank {
    final String hostIpAdress="127.0.45.6";
    boolean connect(String ipAdress);
    boolean payment (double amount, String cardNumber, String cvc, String expireDate);
}
