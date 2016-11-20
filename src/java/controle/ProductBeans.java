/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controle;

import java.util.ArrayList;
import model.Product;

/**
 *
 * @author salahdin
 */
public class ProductBeans {

    Product prod = new Product();
    ArrayList<Product> productlijst = new ArrayList<Product>();

    public Product getProd() {
        return prod;
    }

    public void setProd(Product prod) {
        this.prod = prod;
    }

    public ArrayList<Product> getProductlijst() {
        return productlijst;
    }

    public void setProductlijst(ArrayList<Product> productlijst) {
        this.productlijst = productlijst;
    }
    
    
    
}
