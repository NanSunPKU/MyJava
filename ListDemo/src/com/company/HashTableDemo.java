package com.company;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

    public static void main(String[] args) {
        //HashTable is legacy class, key and values are treated as objects
        //and users can not specify the type
        Hashtable hashtable = new Hashtable();
        hashtable.put(1, "a");
        hashtable.put(2, "b");
        String s = (String) hashtable.get(2);

        System.out.println(hashtable);

        Enumeration enumeration = hashtable.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

    }
}
