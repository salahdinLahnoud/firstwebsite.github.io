/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.DateFormat;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Checkout;
import model.Product;
import model.User;
import model.operation;

/**
 *
 * @author salahdin
 */
public class CheckoutServlet extends HttpServlet {
    
    
    operation op ;
     public void init()throws ServletException{
    
        op = new operation();        
    }
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
           
        RequestDispatcher dispatcher = request.getRequestDispatcher("/ShoppingCart.jsp");
        HttpSession session = request.getSession(true);
        String code = request.getParameter("code");
        String description = request.getParameter("description");
        double price = Double.parseDouble(request.getParameter("price"));
        String image = request.getParameter("image");
        int qty = Integer.parseInt(request.getParameter("qty"));
        Product prod = new Product(code, description, price, image, qty);
        User user = new User();
        Checkout checkout = new Checkout(user, prod, qty);
        
        
        CheckoutBeans cb = new CheckoutBeans();
        //op.addCheckout(user, prod, qty);
        cb.setCheckoutlijst(op.getChecklijst());
        request.setAttribute("model", cb);
        request.getRequestDispatcher("ShoppingCart.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

     
    }
}


