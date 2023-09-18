package com.objectOrientedLesson;

public class BankB implements IBank{
    private String bankName;
    private String terminalID;
    private String password;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getTerminalID() {
        return terminalID;
    }

    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BankB(String bankName, String terminalID, String password) {
        this.bankName = bankName;
        this.terminalID = terminalID;
        this.password = password;
    }

    @Override
    public boolean connect(String ipAddress) {
        System.out.println("User ip address: " + ipAddress);
        System.out.println("Machine ip address" + this.hostIpAdress);
        System.out.println(" Connection has been provided to " + this.getBankName());
        return true;
    }

    @Override
    public boolean payment(double amount, String cardNumber, String cvc, String expireDate) {
        System.out.println("Successful");
        return true;
    }
}
