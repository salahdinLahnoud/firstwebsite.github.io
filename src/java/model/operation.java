/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.event.ActionEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author salahdin
 */
public class operation {

    private ArrayList<Product> lijst = new ArrayList<Product>();
    private ArrayList<Checkout> checklijst = new ArrayList<Checkout>();
    User user = new User();
    int counter = 0;
    Checkout checkout = new Checkout();

    public Checkout getCheckout() {
        return checkout;
    }

    public void setCheckout(Checkout checkout) {
        this.checkout = checkout;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Product> getLijst() {
        return lijst;
    }

    public void setLijst(ArrayList<Product> lijst) {
        this.lijst = lijst;
    }

    public ArrayList<Checkout> getChecklijst() {
        return checklijst;
    }

    public void setChecklijst(ArrayList<Checkout> checklijst) {
        this.checklijst = checklijst;
    }

    public void add(String code, String description, double price, String image, int qty, int qtyOrdered) {

        Iterator<Product> it = lijst.iterator();
        while (it.hasNext()) {
            Product product = it.next();
            if (product.getCode().equals(code)) {

                product.setQty(product.getQty() + qtyOrdered);
                return;
            }
        }
        lijst.add(new Product(code, description, price, image, qtyOrdered));
    }
  
    public int getCount(){return counter;}
    public void setCount(int count){ this.counter = counter;}
    public void increment(ActionEvent event){counter++;}
    public void decrement(ActionEvent event){counter--;}
    

    /**
     * public void Plus(int qtyOrdered) {
     *
     * Iterator<Product> it = lijst.iterator(); while (it.hasNext()) { Product
     * product = it.next();
     *
     * product.setQty(product.getQty() + qtyOrdered + 1); return; }
     *
     * }
     *
     * public void Min(int qtyOrdered) {
     *
     * Iterator<Product> it = lijst.iterator(); while (it.hasNext()) { Product
     * product = it.next();
     *
     * product.setQty(qtyOrdered - 1); return; }
     *
     * }
     *
     */
    public void addUser(User user) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "");
            PreparedStatement pr = cn.prepareStatement("INSERT INTO user VALUES(?,?,?,?,?,?)");
            pr.setInt(1, user.getId());
            pr.setString(2, user.getVoornaam());
            pr.setString(3, user.getAchternaam());
            pr.setString(4, user.getAdres());
            pr.setString(5, user.getTelefoon());
            pr.setString(6, user.getPostcode());
            pr.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void addBestellingen(Bestellingen bestellingen) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "");
            PreparedStatement pr = cn.prepareStatement("INSERT INTO bestellingen VALUES(?,?,?,?,?)");
            pr.setInt(1, bestellingen.getId());
            pr.setString(2, bestellingen.getNaam());
            pr.setInt(3, bestellingen.getQty());
            pr.setDouble(4, bestellingen.getTotaal());
            pr.setString(5, bestellingen.getBesteller());

            pr.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
