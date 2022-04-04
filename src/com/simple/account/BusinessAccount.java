package com.simple.account;

import java.io.Serializable;

public class BusinessAccount implements Account, Serializable {
private static final int serialVersionUID = 1;
    private float balance;
    private int accountID;
    private String companyName;
    private String companyAddress;

    public BusinessAccount(float balance, int accountID, String companyName, String companyAddress) {
        this.balance = balance;
        this.accountID = accountID;
        this.companyName = companyName;
        this.companyAddress = companyAddress;
    }
    public void deposit(float amount) {
        this.setBalance(this.getBalance() + amount);
    }

    public void withdraw(float amount) throws InsufficientFunsException {
        if (amount > this.getBalance()) {
            throw new InsufficientFunsException(("Amount " + amount + " exceeds balance " + this.getBalance()));
        }
        this.setBalance(this.getBalance() - amount);
        }

    public String toString() {
        return "A business account belonging to  " + this.getCompanyName() + " with balance " + this.getBalance();
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }
}
