package com.company;

public class Main {

    public static void main(String[] args) {
        Store store = new Store();
        Customer customer = new Customer("Kate");
        Customer customer1 = new Customer("John");
        store.register(customer);
        store.register(customer1);
        store.inviteSale();
    }
}
