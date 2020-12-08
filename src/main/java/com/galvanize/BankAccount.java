package com.galvanize;
//        deposit(long cents): Adds cents to the bank account
//        withdraw(long cents): Removes cents from the bank account
//        balance(): Returns the current balance on the bank account
//        isOverDrawn(): Returns true if the balance on the account is negative
public class BankAccount {

    double balance;

    public BankAccount() {
        this.balance = 133.11;
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(long cents) {
       // balance += (double) (cents / 100);
        balance += (cents / 100d);
    }

    public void withdraw(long cents) {
        balance -= (double) (cents / 100d);
    }

    public double balance(){
        return balance;
    }

    public boolean isOverDrawn(){
        if(balance < 0) return true;
        return false;
    }

    public static void main(String[] args) {
        BankAccount tom = new BankAccount(12);
        BankAccount sid = new BankAccount();
        System.out.println(sid.balance);
        System.out.println(tom.balance);
        tom.deposit(53);
        System.out.println(tom.balance);
        System.out.println(tom.isOverDrawn());
        tom.withdraw(12);
        System.out.println(tom.balance);
        tom.withdraw(343333);
        System.out.println(tom.balance);
        System.out.println(tom.isOverDrawn());


    }
}
