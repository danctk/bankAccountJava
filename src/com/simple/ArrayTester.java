package com.simple;

import com.simple.account.BankAccount;

public class ArrayTester {

    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[4];
        accounts[0] = new BankAccount(1, "jeff lebowski", 100f);
        accounts[1] = new BankAccount(2, "j123", 5000f);
        accounts[2] = new BankAccount(3, "132", 1f);
        BankAccount first = accounts[0];
        System.out.println("First account has id:" + first.getAccountID());
        BankAccount second = accounts[1];
        System.out.println("second account is owned by " + second.getOwnerName());

    }
}
