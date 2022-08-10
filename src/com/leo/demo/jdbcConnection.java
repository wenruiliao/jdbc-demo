package com.leo.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbcConnection {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql://127.0.0.1:3306/db1?useSSL=false";
        String username = "root";
        String password = "1234";
        Connection conn = DriverManager.getConnection(url, username, password);

        String sql = "update stu set english = english - 150 where id = 1";

        Statement stmt = conn.createStatement();

        int count = stmt.executeUpdate(sql);

        System.out.println(count);

        stmt.close();

        conn.close();

    }
}
