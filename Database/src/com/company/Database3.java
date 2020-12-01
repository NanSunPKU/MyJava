package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database3 {
    public static void main(String[] args) throws Exception {

        // invoke JDBC driver for sqlite DB
        Class.forName("org.sqlite.JDBC");

        Connection conn = DriverManager.getConnection("jdbc:sqlite:C://MyJava//sqlite-tools//univ.db");

        Statement stm = conn.createStatement();
//        stm.executeUpdate("create table Temp1 (a integer, b float)");
        stm.executeUpdate("drop table Temp1");

        stm.close();
        conn.close();
    }

}
