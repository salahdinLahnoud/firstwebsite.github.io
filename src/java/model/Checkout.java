/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.sql.Date;

/**
 *
 * @author salahdin
 */
public class Checkout {
    
    private User user;
    private Product product;
    //private Date date ;
    private int checkoutNumber;
    
    public Checkout(){}
    public Checkout(User user , Product product, int checkoutNumber){
        
        this.user = user;
        this.product = product;
        this.checkoutNumber = checkoutNumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    public int getCheckoutNumber() {
        return checkoutNumber;
    }

    public void setCheckoutNumber(int checkoutNumber) {
        this.checkoutNumber = checkoutNumber;
    }

    @Override
    public String toString() {
        return "Checkout : " + "user :" + user + ", product :" + product + ", checkoutNumber :" + checkoutNumber;
    }    
}
