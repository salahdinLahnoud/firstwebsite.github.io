/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author salahdin
 */
public class admin {

     private String username;
     private String password;
     private boolean Valid;

    public admin() {
    }

    public admin(String username, String password) {

        this.username = username;
        this.password = password;

    }

    public String getUsername() {
        if (username == null) {
            return "Invalide username";
        } else if (username.equals("")) {
            return "Invalide username";

        } else {
            return username;
        }
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        if (password.equals("")) {
            return "Invalide password";
        } else if (password == null) {
            return "Invalide password";
        } else {
            return password;
        }
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isValid() {

        return Valid;
    }

    public void setValid(boolean newValid){
    
        this.Valid = newValid ;
    }
    public static ArrayList getAuthentication() {
        Database db = new Database();
        ArrayList users = new ArrayList();

        try {
            ResultSet rs = db.executSelect("SELECT username and password from admin where username =? and password =?");
            while (rs.next()) {
                admin user = new admin();
                user.username = rs.getString(1);
                user.password = rs.getString(2);

                users.add(user);

            }
        } catch (Exception ex) {
            throw new SecurityException(ex);
        }
        return users;
    }
}


