package com.postgresql.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class Example1 {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/example1","postgres","garethjr");
            System.out.println("Connection established");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Failed to establish connection");
        }

    }
}
