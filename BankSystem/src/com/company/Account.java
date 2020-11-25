package com.company;

public class Account {
    private int accountNumber;
    private String name;
    private String address;
    private String dob;
    private int phoneNumber;
    private String email;
    protected long balance;

    public Account(int accountNumber, String name, String address, int phoneNumber, String dob, String email) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dob = dob;
        this.email = email;
    }

    public int getAccountNumber() {return accountNumber;}
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getDob() { return dob; }
    public String getEmail() { return email; }
    public long getBalance() { return balance; }
    public int getPhoneNumber() { return phoneNumber; }

    public void setAddress(String address) { this.address = address; }
    public void setPhoneNumber(int phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setDob(String dob) { this.dob = dob; }
    public void setEmail(String email) { this.email = email; }

}
