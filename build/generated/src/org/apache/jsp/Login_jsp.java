package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-1.7.2.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.cycle.all.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/code.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/LoginValidation.js\"></script>\n");
      out.write("        <title>J.S.P Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"container\">\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <img src=\"images/pizzasalahdin.jpg\" alt=\"logo\" width=\"250\"/>\n");
      out.write("            </div>\n");
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
      out.write("                </div>\n");
      out.write("                <div id=\"contant\">\n");
      out.write("                    <div id=\"nav\">\n");
      out.write("                        <h1>Login : </h1>\n");
      out.write("                        <form action=\"LoginAdminServlet\" method=\"GET\" onsubmit=\"checkForBlank()\">\n");
      out.write("                            <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><p>Username : </p></td><td><input type=\"text\" id=\"username\" name=\"username\" value=\"\"></td></tr>\n");
      out.write("\n");
      out.write("                                <tr><td><p>Password : </p></td><td><input type=\"password\" id=\"password\" name=\"password\" value=\"\"></td>\n");
      out.write("\n");
      out.write("                                <tr><td><input type=\"submit\" name=\"submit\" value=\"Submit\">\n");
      out.write("                                        <input type=\"reset\" value=\"CLEAR\" id=\"reset\"></td>\n");
      out.write("                                </tr>\n");
      out.write("                            </table>\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div><!--end nav--->\n");
      out.write("                </div><!--- end contant--->\n");
      out.write("                <div id=\"footer\">\n");
      out.write("                    <div id=\"footerIn\">\n");
      out.write("                        ");

                            Integer hitsCount = (Integer) application.getAttribute("hitCounter");
                            if (hitsCount == null || hitsCount == 0) {
                                /* First visit */
                                //out.println("Welcome to my website!");
                                hitsCount = 1;
                            } else {
                                /* return visit */
                                //out.println("Welcome back to my website!");
                                hitsCount += 1;
                            }
                            application.setAttribute("hitCounter", hitsCount);
                        
      out.write("\n");
      out.write("\n");
      out.write("                        <p>Total number of visits: ");
      out.print( hitsCount);
      out.write("</p>\n");
      out.write("                        <p>All the right received copyright &copy 2014</p>\n");
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
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
