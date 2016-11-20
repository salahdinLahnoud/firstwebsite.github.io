/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controle;

import java.util.ArrayList;
import model.Checkout;

/**
 *
 * @author salahdin
 */
public class CheckoutBeans {

    
    Checkout checkout = new Checkout();
    
    ArrayList<Checkout> checkoutlijst = new ArrayList<Checkout>();

    public Checkout getCheckout() {
        return checkout;
    }

    public void setCheckout(Checkout checkout) {
        this.checkout = checkout;
    }

    public ArrayList<Checkout> getCheckoutlijst() {
        return checkoutlijst;
    }

    public void setCheckoutlijst(ArrayList<Checkout> checkoutlijst) {
        this.checkoutlijst = checkoutlijst;
    }
    
    
    
}
