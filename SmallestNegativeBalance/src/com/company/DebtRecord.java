package com.company;

public class DebtRecord {
    String borrower = "";
    String lender = "";
    int amount = 0;

    public DebtRecord(String borrower, String lender, int amount) {
        this.borrower = borrower;
        this.lender = lender;
        this.amount = amount;
    }

    public DebtRecord() {
    }
}
