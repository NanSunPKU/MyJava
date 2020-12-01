package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.*;
import java.util.Scanner;

public class Database2 {

    public static void main(String[] args) throws Exception {

        // invoke JDBC driver for sqlite DB
        Class.forName("org.sqlite.JDBC");

        Connection conn = DriverManager.getConnection("jdbc:sqlite:C://MyJava//sqlite-tools//univ.db");

//        Statement stm = conn.createStatement();
//        stm.executeUpdate("insert into dept values(80, 'MATH')");
//        stm.executeUpdate("delete from dept where deptno = 80");
//        stm.executeUpdate("update dept set dname = 'AERO' where deptno = 50");
        PreparedStatement statement = conn.prepareStatement("insert into students values (?, ?, ?, ?)");
        System.out.println("Enter roll No., name, city, dept No one line each: ");
        Scanner sc = new Scanner(System.in);
        int roll = sc.nextInt();
        String name = sc.next();
        String city = sc.next();
        int dno = sc.nextInt();

        statement.setInt(1, roll);
        statement.setString(2, name);
        statement.setString(3, city);
        statement.setInt(4, dno);

        statement.executeUpdate();
        statement.close();
        conn.close();
    }
}
