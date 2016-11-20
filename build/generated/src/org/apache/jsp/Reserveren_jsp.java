package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.naming.spi.DirStateFactory.Result;
import java.util.Iterator;
import controle.ProductBeans;
import java.util.ArrayList;
import model.Product;

public final class Reserveren_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Show Products</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/Show.css\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-1.7.2.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.cycle.all.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/code.js\"></script>\n");
      out.write("            </head>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("    <body>\n");
      out.write("          ");
 
            ProductBeans pb ;
            if(request.getAttribute("model")!= null){
                pb = (ProductBeans) request.getAttribute("model");
            }else{
                pb = new ProductBeans();
            } 
        
      out.write("\n");
      out.write("            <div id=\"slider\">\n");
      out.write("                    <img src=\"images/pizza1.jpg\" alt=\" \" width=\"720\" height=\"300\"/>\n");
      out.write("                    <img src=\"images/pizza2.jpg\" alt=\" \" width=\"720\" height=\"300\"/> \n");
      out.write("                    <img src=\"images/pizza3.jpg\" alt=\" \" width=\"720\" height=\"300\"/> \n");
      out.write("                    <img src=\"images/pizza4.jpg\" alt=\" \" width=\"720\" height=\"300\"/>  \n");
      out.write("                    <img src=\"images/pizza5.jpg\" alt=\" \" width=\"720\" height=\"300\"/> \n");
      out.write("                    <img src=\"images/pizza6.jpg\" alt=\" \" width=\"720\" height=\"300\"/> \n");
      out.write("                    <img src=\"images/pizza7.jpg\" alt=\" \" width=\"720\" height=\"300\"/>\n");
      out.write("                    <img src=\"images/lasagne.jpg\" alt=\" \" width=\"720\" height=\"300\"/> \n");
      out.write("                </div><!---\n");
      out.write("        \n");
      out.write("        <div id=\"container\">\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <h1>Project Test Restaurant</h1>\n");
      out.write("                <p>Project Test </p>             \n");
      out.write("                <img src=\"images/menukaart2.jpg\" alt=\"logo2\"/>\n");
      out.write("                \n");
      out.write("            </div><!--- end header--->\n");
      out.write("            <div id=\"warpper\">\n");
      out.write("                &nbsp;\n");
      out.write("                <div id=\"slider\">\n");
      out.write("                    <img src=\"images/pizza1.jpg\" alt=\" \" width=\"720\" height=\"300\"/>\n");
      out.write("                    <img src=\"images/pizza2.jpg\" alt=\" \" width=\"720\" height=\"300\"/> \n");
      out.write("                    <img src=\"images/pizza3.jpg\" alt=\" \" width=\"720\" height=\"300\"/> \n");
      out.write("                    <img src=\"images/pizza4.jpg\" alt=\" \" width=\"720\" height=\"300\"/>  \n");
      out.write("                    <img src=\"images/pizza5.jpg\" alt=\" \" width=\"720\" height=\"300\"/> \n");
      out.write("                    <img src=\"images/pizza6.jpg\" alt=\" \" width=\"720\" height=\"300\"/> \n");
      out.write("                    <img src=\"images/pizza7.jpg\" alt=\" \" width=\"720\" height=\"300\"/>\n");
      out.write("                    <img src=\"images/lasagne.jpg\" alt=\" \" width=\"720\" height=\"300\"/> \n");
      out.write("                </div><!--- end slider--->\n");
      out.write("\n");
      out.write("                <div id=\"contant\">\n");
      out.write("                    <div id=\"All_rec_s\" >\n");
      out.write("\n");
      out.write("                        <ul>\n");
      out.write("                            <li>\n");
      out.write("                                <div class=\"rec_s_f\">\n");
      out.write("                                    <table border=\"0\" width=\"100%\" >\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Menu Code</td>\n");
      out.write("                                            <td>Description</td>\n");
      out.write("                                            <td>Price</td>\n");
      out.write("                                            <td>Image</td>\n");
      out.write("                                            <td>Quantity</td>\n");
      out.write("                                            <td>Add To Cart</td>\n");
      out.write("                                            \n");
      out.write("                                       \n");
      out.write("                                         \n");
      out.write("                                        </tr>\n");
      out.write("                                    </table>\n");
      out.write("                                </div><!--- end rec_s--->\n");
      out.write("                            </li>\n");
      out.write("                            ");


                                ArrayList allProducten = model.Product.getAll();
                                for (int i = 0; i < allProducten.size(); i++) {
                                    Product st = (Product) allProducten.get(i);
                                    String id = st.getCode();
                                    String description = st.getDescription();
                                    double price = st.getPrice();
                                    String image = st.getImage();
                            
      out.write("\n");
      out.write("                            <li>\n");
      out.write("                                <div class=\"rec_s\">\n");
      out.write("                                    <form action=\"MenuServlet\" method=\"post\">\n");
      out.write("                                     \n");
      out.write("                                    <table border=\"0\" >\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td name =\"code\">");
      out.print( id);
      out.write("</td>\n");
      out.write("                                            <input type=\"hidden\" name= \"code\" value='");
      out.print( id );
      out.write("'>\n");
      out.write("                                            <td name =\"description\">");
      out.print( description);
      out.write("</td>\n");
      out.write("                                            <input type=\"hidden\" name= \"description\" value='");
      out.print( description);
      out.write("'>\n");
      out.write("                                            <td name =\"price\">");
      out.print( price);
      out.write("Euro</td>\n");
      out.write("                                            <input type=\"hidden\" name= \"price\" value='");
      out.print( price);
      out.write("'>\n");
      out.write("                                            <td name =\"image\">");
      out.print( image);
      out.write("</td>\n");
      out.write("                                            <input type=\"hidden\" name= \"image\" value='");
      out.print( image);
      out.write("'>\n");
      out.write("                                            <td><input type=\"text\" value=\"0\" name=\"qty\" size=\"3\"></td>\n");
      out.write("                                            <td input type=\"text\" value=\"0\" name=\"qty\"></td>\n");
      out.write("                                            <td><input type=submit value= '+'  name=\"action\"></td>\n");
      out.write("                                           \n");
      out.write("                                           \n");
      out.write("                                        </tr>\n");
      out.write("                                    </table>\n");
      out.write("                                    </form>\n");
      out.write("                                            \n");
      out.write("                                </div><!--- end rec_s--->\n");
      out.write("                            </li>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                                      </ul>\n");
      out.write("                                      \n");
      out.write("                    </div><!--- end All_rec_s --->\n");
      out.write("                    \n");
      out.write("                 </div><!--- end contant--->\n");
      out.write("            \n");
      out.write("                <div id=\"footer\">\n");
      out.write("                    <div id=\"footerIn\">\n");
      out.write("                        <p>All the right received</p>\n");
      out.write("                        <p>Example copyright &copy 2013</p>\n");
      out.write("                        <ul>\n");
      out.write("                            <li>\n");
      out.write("                                <img src=\"images/facebook.png\" alt=\"facebook\" />\n");
      out.write("                                <a href=\"https://www.facebook.com\">Our facebook page</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <img src=\"images/youtube.png\" alt=\"youtube\" />\n");
      out.write("                                <a href=\"http://www.youtube.com\">Our channel in youtube</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div><!--- end footerIn--->\n");
      out.write("                </div><!--- end footer--->\n");
      out.write("            </div><!--- end warpper--->\n");
      out.write("        </div><!--- end container--->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
