package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<DebtRecord> records = new ArrayList<>();
        records.add(new DebtRecord("Alex", "Blake", 2));
        records.add(new DebtRecord("Blake", "Alex", 2));
        records.add(new DebtRecord("Casey", "Alex", 5));
        records.add(new DebtRecord("Blake", "Casey", 7));
        records.add(new DebtRecord("Alex", "Blake", 4));
        records.add(new DebtRecord("Alex", "Casey", 4));

        SmallestNegativeBalance snb = new SmallestNegativeBalance();
        List<String> result = snb.smallestNegBalAccounts(6, 3, records);
        System.out.println(result);

        records = new ArrayList<>();
        records.add(new DebtRecord("Alex", "Blake", 2));
        records.add(new DebtRecord("Blake", "Alex", 2));
        records.add(new DebtRecord("Casey", "Alex", 5));
        records.add(new DebtRecord("Alex", "Casey", 5));
        result = snb.smallestNegBalAccounts(4, 3, records);
        System.out.println(result);
    }
}
