package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Enter your name and contact information</h1>\n");
      out.write("                                       \n");
      out.write("                            <form  id=\"theForm\" action=\"UserServlet\"  method=\"post\">\n");
      out.write("                                   \n");
      out.write("                            \n");
      out.write("                            <table border=\"0\" width=\"100%\">\n");
      out.write("                                  \n");
      out.write("                                  <tr><td>ID<span class=\"red\">*</span></</td>\n");
      out.write("                                        <td><input id =\"name\" type=\"text\" name=\"id\"/></td>\n");
      out.write("                                        <td id=\"nameError\" class=\"red\">&nbsp;</td></tr>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr><td>Firstname<span class=\"red\">*</span></</td>\n");
      out.write("                                        <td><input id =\"name\" type=\"text\" name=\"voornaam\"/></td>\n");
      out.write("                                        <td id=\"nameError\" class=\"red\">&nbsp;</td></tr>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr><td>Lastname<span class=\"red\">*</span></td>\n");
      out.write("                                        <td><input id =\"lname\" type=\"text\" name=\"achternaam\"/></td>\n");
      out.write("                                        <td id=\"lnameError\" class=\"red\">&nbsp;</td></tr>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr><td>Street<span class=\"red\">*</span></td>\n");
      out.write("                                        <td><input id=\"street\" type=\"text\" name=\"adres\"/></td>\n");
      out.write("                                        <td id=\"streetError\" class=\"red\">&nbsp;</td></tr>\n");
      out.write("                                    </tr>\n");
      out.write("                                    </tr>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr><td>Phone<span class=\"red\">*</span></td>\n");
      out.write("                                        <td><input id=\"phone\" type=\"text\" name=\"telefoon\"/></td>\n");
      out.write("                                        <td id=\"phoneError\" class=\"red\">&nbsp;</td></tr>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr><td>ZipCode<span class=\"red\">*</span></td>\n");
      out.write("                                        <td><input id=\"zipcode\" type=\"text\" name=\"postcode\"/></td>\n");
      out.write("                                        <td id=\"zipcodeError\" class=\"red\">&nbsp;</td></tr>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                       <td><input type=\"submit\" name=\"submit\" value=\"SUBMIT\"/></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <br>\n");
      out.write("                                </table>\n");
      out.write("                            </form>\n");
      out.write("                        </ul>\n");
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
