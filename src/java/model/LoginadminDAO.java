/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;


/**
 *
 * @author salahdin
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginadminDAO {

    static Connection currentCon = null;
    static ResultSet rs = null;

    public static admin login(admin bean) {
        Statement stmt = null;
        String username = bean.getUsername();
        String password = bean.getPassword();
        String searchQuery = "select * from admin where username='" + username + "' AND password='" + password + "'";

        try {
//connecting to the DB
            currentCon = DBAManager.getConnection();

            stmt = currentCon.createStatement();
            rs = stmt.executeQuery(searchQuery);
            boolean userExists = rs.next();

            if (!userExists) {
                System.out.println("Username/Password entered is Incorrect or User doesnot Exists.");
                bean.setValid(false);
            } else if (userExists) {
                username = rs.getString("username");
                password = rs.getString("password");
                System.out.println("Welcome : " + username);
                bean.setUsername(username);
                bean.setPassword(password);
                bean.setValid(true);
            }

        } catch (Exception ex) {
            System.out.println("Log In failed: An Exception has occurred! " + ex);
        }
        return bean;
    }
}


