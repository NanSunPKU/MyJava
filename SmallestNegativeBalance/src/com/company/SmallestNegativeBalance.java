package com.company;

import java.util.*;

public class SmallestNegativeBalance {

    public List<String> smallestNegBalAccounts(
            int numRows,
            int numCols,
            List<DebtRecord> records) {
        if (numRows == 0 || records == null)
            return new ArrayList<>();

        HashMap<String, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();

        for (DebtRecord record : records) {
            String borrower = record.borrower;
            String lender = record.lender;
            int debtAmount = record.amount;
            map.put(borrower, map.getOrDefault(borrower, 0) - debtAmount);
            map.put(lender, map.getOrDefault(lender, 0) + debtAmount);
        }

        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
                (a, b) -> a.getValue() == b.getValue()?
                        a.getKey().compareTo(b.getKey()):
                        a.getValue()-b.getValue());

        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            if (entry.getValue()<0)
                pq.add(entry);
                System.out.println(entry);
        }

        if (pq.isEmpty()) {
            result.add("Nobody has negative amount");
            return result;
        } else {
            int minimum = pq.peek().getValue();
            while (!pq.isEmpty() && pq.peek().getValue() == minimum) {
                result.add(pq.poll().getKey());
            }
        }

        return result;
    }
}
