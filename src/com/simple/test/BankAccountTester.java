package com.simple.test;

import com.simple.account.BankAccount;
import com.simple.account.InsufficientFunsException;
import com.simple.account.SavingsAccount;

public class BankAccountTester {

    public static void main(String[] args) {
        BankAccount account2 = new BankAccount(2, "bob", 1000f);
        BankAccount account3 = new BankAccount(3, "james", 10000f);
        BankAccount account = new BankAccount(1, "jeff", 100f);
        SavingsAccount sAccount = new SavingsAccount(3, "donny", 1);
       System.out.println(account2);
        System.out.println(account3);
System.out.println(account);
        System.out.println(sAccount);
        try {
            account.withdraw(200f);
        } catch (InsufficientFunsException e) {
            System.out.println("there was an error withdrawing");
            System.out.println(e.getMessage());
        }
//        BankAccount.setInterestRate(5.5f);
//        BankAccount.getInterestRate();
//        account.deposit(50f);
//        System.out.println("A Bank account");
//        System.out.println("ID: " + account.getAccountID());
//        System.out.println("balance: " + account.getBalance());
//        System.out.println("owner: " + account.getOwnerName());
//        System.out.println("account 2 is owned by " + account2.getOwnerName() + " and balance is "
//                + account2.getBalance() + " interest rate is " + account2.getInterestRate());
//        System.out.println("account 3 is owned by " + account3.getOwnerName() + " and balance is "
//                + account3.getBalance() + " interest rate is " + account3.getInterestRate());
//
//
//        System.out.println("The saving account's balance is " + sAccount.getBalance());
//        sAccount.deposit(500f);
//        sAccount.payInterest();
//        System.out.println("The savings account new balance is " + sAccount.getBalance());

    }
}
