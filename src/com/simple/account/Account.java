package com.simple.account;

public interface Account {

    public void withdraw(float amount) throws InsufficientFunsException;
    public void deposit(float amount);

    public int getAccountID();
}
