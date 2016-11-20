/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import com.sun.corba.se.spi.presentation.rmi.StubAdapter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import model.DBAManager;
import model.LoginadminDAO;
import model.admin;

/**
 *
 * @author salahdin
 */
public class LoginAdminServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            System.out.println("/LoginAdminServlet");
            admin useradmin = new admin();
            useradmin.setUsername(request.getParameter("username"));
            useradmin.setPassword(request.getParameter("password"));
            useradmin = LoginadminDAO.login(useradmin);
            if (useradmin.isValid()) {
                HttpSession session = request.getSession(true);
                session.setAttribute("currentSessionUserAdmin", useradmin);
                response.sendRedirect("adminPanel.jsp");
                
            }
            else{
            
                //response.sendRedirect("error.jsp");
                request.getRequestDispatcher("error.jsp").include(request, response);
            }

        } catch (SecurityException ex) {
            ex.printStackTrace();

        }
        
    }
      public void destroy() {
        try {
            
            DBAManager.getConnection().close();
            
        } catch (SQLException e) {
            while(e != null) {
		log("SQLException: " + e.getSQLState() + '\t' +
		    e.getMessage() + '\t' +
		    e.getErrorCode() + '\t');
		e = e.getNextException();
            }
        } catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
