package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>(Map.of(0, "A", 1, "B"));

        tm.put(2, "c");

        Map.Entry<Integer, String> e = tm.firstEntry();
        System.out.println(e.getKey()+" "+e.getValue());
        System.out.println(tm.get(2));
        System.out.println(tm);

        HashMap<Integer, String> hm = new HashMap<>(Map.of(0, "A", 1, "B"));
        System.out.println(hm);
    }
}
