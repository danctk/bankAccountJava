package com.simple.test;
import com.simple.account.*;

import java.io.IOException;

public class AccountManagerTester {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
AccountManager manager = new AccountManager();
BankAccount account = new BankAccount(1, "Jeff " , 90f);
SavingsAccount sAccount = new SavingsAccount(2, "maude", 10000f);
BusinessAccount busAccount = new BusinessAccount(1000f, 3, "simcorp", "blah street");
manager.addAccount(account);
manager.addAccount(sAccount);
manager.addAccount(busAccount);
manager.deposit(2,100f);

manager.persist();
AccountManager readTest = new AccountManager();
readTest.load();
System.out.println(readTest);
    }
}
