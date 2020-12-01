package com.company;

import java.sql.*;
import java.util.Scanner;

public class PrepareStatement {
    public static void main(String[] args) throws Exception {

        // invoke JDBC driver for sqlite DB
        Class.forName("org.sqlite.JDBC");

        Connection conn = DriverManager.getConnection("jdbc:sqlite:C://MyJava//sqlite-tools//univ.db");

        PreparedStatement stm =conn.prepareStatement("select * from students where deptno = ?");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dept Number: ");
        int dno = sc.nextInt();
        stm.setInt(1, dno);

        ResultSet rs = stm.executeQuery();

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
