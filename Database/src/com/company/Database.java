package com.company;

import java.sql.*;

public class Database {

    public static void main(String[] args) throws Exception {

        Class.forName("org.sqlite.JDBC");

        Connection conn = DriverManager.getConnection("jdbc:sqlite:C://MyJava//sqlite-tools//univ.db");

        Statement stm =conn.createStatement();
        ResultSet rs = stm.executeQuery("select * from students");
        while (rs.next()) {
            System.out.print(rs.getInt("roll") + " ");
            System.out.print(rs.getString("name") + " ");
            System.out.print(rs.getString("city") + " ");
            System.out.println(rs.getInt(4) + " ");

        }
        stm.close();
        conn.close();
    }
}
