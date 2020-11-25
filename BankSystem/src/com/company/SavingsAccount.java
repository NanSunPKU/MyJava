package com.company;

public class SavingsAccount extends Account {

    public SavingsAccount(int accountNumber, String name, String address, int phoneNumber, String dob, String email) {
        super(accountNumber, name, address, phoneNumber, dob, email);
    }

    public void deposit(long amt) {
        balance += amt;
    }
    public void withdraw(long amt) {
        balance -= amt;
    }
}
