package com.simple.account;

public class SavingsAccount extends BankAccount {


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
        return super.toString()+ "with interest rate " + this.getInterestRate() + " and min balance " + this.minimumBalance;

    }

    public void payInterest() {
        float newBalance = this.getBalance() * (1 + (BankAccount.getInterestRate() / 100));
        if( this.getBalance() >= this.minimumBalance) {
            this.setBalance(newBalance);
        }
    }
    private float minimumBalance = 1000f;

    public SavingsAccount(int accountID, String ownerName, float balance) {
        super(accountID, ownerName, balance);
    }
 public void print() {
        System.out.println("\n Saving summary:");
        super.print();
     System.out.println(" interest rate:"+this.getInterestRate());
     System.out.println(" Minimum balance:" +minimumBalance);
 }
}
