package com.objectOrientedLesson;

import java.util.Date;

public class BankA implements IBank {
    private String bankName;
    private String terminalID;
    private String password;

    public BankA(String bankName, String terminalId, String password) {
        this.bankName = bankName;
        this.terminalID = terminalID;
        this.password = password;
    }

    public boolean connect(String ipAddress) {
        System.out.println("User ip address: " + ipAddress);
        System.out.println("Machine ip address" + this.hostIpAdress);
        System.out.println(" Connection has been provided to " + this.getBankName());
        return true;
    }

    public boolean payment(double amount, String cardNumber, String cvc, String expireDate) {
        Date d1=new Date(expireDate);
        if(new Date().after(d1)){
            System.out.println("Expire card");
            return false;
        }
        System.out.println("Successful");
        return true;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getTerminalID() {
        return terminalID;
    }

    public void setTerminal_id(String terminalID) {
        this.terminalID = terminalID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
