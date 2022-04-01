package com.simple.account;

public class BankAccount {

    private int accountID;
    private String ownerName;
    private float balance;
    private static float interestRate;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "An account with id "+ this.getAccountID() + " with balance " + this.getBalance() + " owned by " + this.getOwnerName();
    }

    public static void setInterestRate(float interestRate) {
        BankAccount.interestRate = interestRate;
    }
    public void withdraw(float amount) throws InsufficientFunsException{
        if(amount > this.getBalance()) {
            throw new InsufficientFunsException("Amount "+ amount + " exceeds balance " + this.getBalance());
        }
        this.setBalance(this.getBalance() - amount);
    }
   public void print() {
        System.out.println("\nAn Account");
        System.out.println("Account Id: " + this.getAccountID());
       System.out.println(" Owner: " + this.getOwnerName());
       System.out.println("Balance : " + this.getBalance());
   }

    public static float getInterestRate() {
        return interestRate;
    }

    public BankAccount(int accountID, String ownerName, float balance) {
        super();
        this.accountID = accountID;
        this.ownerName = ownerName;
        setBalance(balance);
    }

    public void deposit(float amount) {
        this.balance = this.balance + amount;
    }

    public void setAccountID(int ID) {
        this.accountID = ID;
    }

    public void setOwnerName(String setOwnerName) {
        this.ownerName = setOwnerName;
    }

    public void setBalance(float balance) {
        if (balance > 0f) this.balance = balance;
        else System.out.println("error. balance cant be negative.");
    }

    public float getBalance() {
        return balance;
    }

    public int getAccountID() {
        return accountID;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

}
