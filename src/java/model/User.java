/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author salahdin
 */
public class User {

    private int id;
    private String voornaam;
    private String achternaam;
    private String adres;
    private String telefoon;
    private String postcode;
    private String username;
    private String password;

    public User() {
    }

    public User(int id, String voornaam, String achternaam, String adres, String telefoon, String postcode, String username, String password) {
        this.id = id;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.adres = adres;
        this.telefoon = telefoon;
        this.postcode = postcode;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefoon() {
        return telefoon;
    }

    public void setTelefoon(String telefoon) {
        this.telefoon = telefoon;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "voornaam=" + voornaam + ", achternaam=" + achternaam + ", adres=" + adres + ", telefoon=" + telefoon + ", postcode=" + postcode + ", username=" + username + ", password=" + password + '}';
    }
    
    public void addUser(){
    
    try{
        
        Database db = new Database();
        PreparedStatement ps = null;        
        db.executDML("INSERT INTO user (id, voornaam, achternaam , adres, telefoon, postcode)VALUES (?,?,?,?,?,?)");
        

  /*  public static void addUser(int id, String voornaam, String achternaam, String adres, String telefoon, String postcode) {
        try {
            Database db = new Database();
            PreparedStatement ps = null;
            int updateQuery = 0;
            String insertSql="INSERT INTO user('id','voornaam','achternaam','adres','telefoon','postcode') VALUES("+id+ ","+voornaam+","+achternaam+","+adres+","+telefoon+","+postcode+")";
            ps.setInt(1, id);
            ps.setString(2, voornaam);
            ps.setString(3, achternaam);
            ps.setString(4, adres);
            ps.setString(5, telefoon);
            ps.setString(6, postcode);
            
    */        
// db.executDML("INSERT INTO user VALUES (" + this.id + " , '" + this.voornaam + "','" + this.achternaam + "','" + this.adres + "','" + this.telefoon + "','" + this.postcode + "',')");

            db.close();
        } catch (Exception ex) {
            System.out.print(ex);
        }

    }

    public void fillUser() {

        Database db = new Database();

        try {
            ResultSet rs = db.executSelect("SELECT * FROM user where id=" + this.id);
            rs.next();
            this.id = rs.getInt(1);
            this.voornaam = rs.getString(2);
            this.achternaam = rs.getString(3);
            this.adres = rs.getString(4);
            this.telefoon = rs.getString(5);
            this.postcode = rs.getString(6);

            db.close();
        } catch (Exception ex) {
            System.out.print(ex);
        }

    }

}
