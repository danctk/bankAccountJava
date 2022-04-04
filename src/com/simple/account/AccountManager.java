package com.simple.account;

import java.io.*;
import java.util.HashMap;

public class AccountManager {
    private HashMap<Integer, Account> accounts = new HashMap<>();

public void addAccount( Account account){
    int key = account.getAccountID();
    this.accounts.put(key,account);
}

public void persist() throws IOException {
    File f = new File("C:/Projects/users.dat");
    OutputStream os = new FileOutputStream(f);
    try(ObjectOutputStream output = new ObjectOutputStream(os))
    {
        output.writeObject(this.accounts);
    }
    catch(IOException io) {
        System.out.println("IO Exception");
        io.printStackTrace();
    }
}

public void load() throws IOException, ClassNotFoundException {
    File f = new File("C:/Projects/users.dat");
    InputStream is = new FileInputStream((f));
    try(ObjectInputStream input = new ObjectInputStream(is)){
        this.accounts=(HashMap<Integer, Account>)
                input.readObject();
    }
    catch (IOException io){
        System.out.println("IO Exception");
        io.printStackTrace();
    }
    catch (ClassNotFoundException cnf){
        System.out.println("Class not found Exception");
        cnf.printStackTrace();
    }

}
public Account getAccount(int id){
    return (Account)
 this.accounts.get(id);
}
    public void deposit(int id, float amount) {
        Account account = this.accounts.get(id);
        account.deposit(amount);
    }

    public String toString() {
    return this.accounts.toString();
    }
    public void withdraw (int id, float amount) throws InsufficientFunsException {
        Account account = this.accounts.get(id);
        account.withdraw(amount);
    }


}
