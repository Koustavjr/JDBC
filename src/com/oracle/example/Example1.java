package com.oracle.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class Example1 {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Garethjr");
            System.out.println("Connection Established!");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Failed to establish connection");
        }
    }
}
