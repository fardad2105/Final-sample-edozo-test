package com.dvdstore.service;


import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;

@Service
public class PGServer {


    /**
     * Get an active connection to the database
     *
     * @return Connection
     */
    public static Connection getConnection() {
        String connectionUrl = "jdbc:postgresql://localhost:5432/dvdstore";
        Connection con = null;

        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(connectionUrl, "postgres", "123");
        } catch (Exception e) {
            // Do nothing
            System.out.println("connection error " + e.getMessage());
        }
        return con;
    }

}
