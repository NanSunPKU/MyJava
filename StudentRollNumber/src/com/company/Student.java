package com.company;
import java.util.Date;
import java.lang.Object;

public class Student {

    private String rollNo;
    private static int count = 1;

    public Student() {
        rollNo = generateRollNo();
    }

    private String generateRollNo() {
        Date date = new Date();
        String rn = "Unvi-" + (date.getYear()+1900) + "-" + count;
        count++;
        return rn;
    }

    public String getRollNo() {
        return rollNo;
    }
}
