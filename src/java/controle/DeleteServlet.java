/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controle;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Bestellingen;
import org.eclipse.jdt.internal.compiler.classfmt.ClassFileConstants;

/**
 *
 * @author salahdin
 */
@WebServlet(name= "DeleteServlet",description="Menu Restaurant Servlet",urlPatterns = "/DeleteServlet")
public class DeleteServlet extends HttpServlet {
    
    private Bestellingen b ;
    
    public DeleteServlet(){
    
    super();
    b= new Bestellingen();
    
    
    }
   
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        int id = Integer.parseInt(request.getParameter("id"));
        b.deleteBestellingen(id);
        request.setAttribute("id", b.getAll());
        request.getRequestDispatcher("UserBestellingen.jsp").forward(request, response);
        
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.getRequestDispatcher("UserBestellingen.jsp").forward(request, response);
        
    }

  
}
