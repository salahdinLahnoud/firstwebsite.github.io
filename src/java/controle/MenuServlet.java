/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controle;

import java.io.IOException;
import java.io.PrintWriter;
import javax.jws.WebService;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Product;
import model.operation;

/**
 *
 * @author salahdin
 */

@WebServlet(name= "MenuServlet",description="Menu Restaurant Servlet",urlPatterns = "/MenuServlet")
public class MenuServlet extends HttpServlet {
    private operation op ;
    
    public void init()throws ServletException{
    
        op = new operation();        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.err.println("get Request");
        response.sendRedirect("MenuPage.jsp");
       /* String action = request.getParameter("action");
        if(action.equalsIgnoreCase("min")){
        
        int qty = Integer.parseInt(request.getParameter("qty"));
        //int updatedQty = qty - 1;
        Product p = new Product();
        operation op = new operation();
        //op.Min(qty);
        //request.setAttribute("qty", op.getLijst());
        //request.getRequestDispatcher("ShoppingCart.jsp").forward(request, response);
        }
        else if(action.equalsIgnoreCase("plus")){
            int qty = Integer.parseInt(request.getParameter("qty"));
        //int updatedQty = qty + 1;
        Product p = new Product();
        operation op = new operation();
        op.Plus(qty);
        request.setAttribute("qty", op.getLijst());
        request.getRequestDispatcher("ShoppingCart.jsp").forward(request, response);
        
        }
        
        */
    }
               

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/MenuPage.jsp");
        HttpSession session = request.getSession(true);
        String code = request.getParameter("code");
        String description = request.getParameter("description");
        double price = Double.parseDouble(request.getParameter("price"));
        String image = request.getParameter("image");
        int qty = Integer.parseInt(request.getParameter("qty"));
        
        Product prod = new Product(code, description, price, image, qty);
        ProductBeans pb = new ProductBeans();
        op.add(code, description, price, image, qty, qty);
        pb.setProductlijst(op.getLijst());
        request.setAttribute("model", pb);
        request.getRequestDispatcher("ShoppingCart.jsp").forward(request, response);
        
        
        
        
        
    }


}
