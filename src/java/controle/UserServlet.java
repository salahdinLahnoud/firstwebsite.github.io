/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Bestellingen;
import model.Database;
import model.User;
import model.operation;

/**
 *
 * @author salahdin
 */
public class UserServlet extends HttpServlet {
    
      private operation op ;
    
    public void init()throws ServletException{
    
        op = new operation();        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            
            throws ServletException, IOException {
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/ShoppingCart.jsp");
        int id = Integer.parseInt(request.getParameter("id"));
        String voornaam = request.getParameter("voornaam");
        String achternaam = request.getParameter("achternaam");
        String adres = request.getParameter("adres");
        int qty = Integer.parseInt(request.getParameter("qty"));
        String telefoon = request.getParameter("telefoon");
        String postcode = request.getParameter("postcode");
        double subtotaal = Double.parseDouble(request.getParameter("subtotaal"));
        String description = request.getParameter("description");
        
        
        
        
                
        User user = new User(id, voornaam, achternaam, adres, telefoon, postcode, voornaam, postcode);
        Bestellingen bestel = new Bestellingen(id, description, qty, subtotaal, voornaam);
                
        UserBeans ub = new UserBeans();
        BestellingenBeans bb = new BestellingenBeans();
        
        op.addUser(user);
        op.addBestellingen(bestel);
        
        user.addUser();
        //request.setAttribute("model", bb);
        request.getRequestDispatcher("Checkout.jsp").forward(request, response);
        
        
    }
}
