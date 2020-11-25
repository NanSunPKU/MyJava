package com.company;

public class LoanAccount extends Account {
    public LoanAccount(int accountNumber, String name, String address, int phoneNumber, String dob, String email) {
        super(accountNumber, name, address, phoneNumber, dob, email);
    }
    public void payEMI(long amt) {
        balance -= amt;
    }
    public void repay(long amt) {
        if(balance==amt) {
            balance = 0;
        }
    }
}
