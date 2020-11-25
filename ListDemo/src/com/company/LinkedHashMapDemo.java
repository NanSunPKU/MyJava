package com.company;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5, .75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return size() > 5;
            }
        };

        lhm.put(1, "A");
        lhm.put(2, "B");
        System.out.println(lhm);

        lhm.put(4, "D");
        lhm.put(3, "C");
        lhm.forEach((k, v) -> System.out.println(k + ": " +v));

        lhm.get(4);
        lhm.get(1);
        lhm.put(5, "e");
        System.out.println("after accessOrder is true, least recently used will be ordered last:");
        lhm.forEach((k, v) -> System.out.println(k + ": " +v));

        lhm.put(6, "f");
        System.out.println("after remove the ones exceeds capacity:");
        lhm.forEach((k, v) -> System.out.println(k + ": " +v));
    }
}
