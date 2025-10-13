package com.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String url = "jdbc:mysql://localhost:3306/studentdetails";
        String username = "root";
        String password = "root@123";
        try(Connection con = DriverManager.getConnection(url , username, password)){
            System.out.println(con);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}