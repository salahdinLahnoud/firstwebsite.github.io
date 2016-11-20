package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Restaurant Maxima</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-1.7.2.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.cycle.all.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/code.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/googleMap.js\"></script>\n");
      out.write("        <script src=\"http://maps.googleapis.com/maps/api/js?key=AIzaSyDY0kkJiTPVd2U7aTOAwhc9ySH6oHxOIYM&sensor=false\">\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            function initialize()\n");
      out.write("            {\n");
      out.write("                var mapProp = {\n");
      out.write("                    center: new google.maps.LatLng(51.816582, 4.678012),\n");
      out.write("                    zoom: 5,\n");
      out.write("                    mapTypeId: google.maps.MapTypeId.ROADMAP\n");
      out.write("                };\n");
      out.write("                var map = new google.maps.Map(document.getElementById(\"googleMap\"), mapProp);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            google.maps.event.addDomListener(window, 'load', initialize);\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"container\">\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <h1>Project Test Restaurant</h1>\n");
      out.write("                <p>Project Test </p>\n");
      out.write("                <img src=\"images/pizzasalahdin.jpg\" alt=\"logo\" width=\"250\"/>\n");
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
      out.write("                    <div id=\"nav\">\n");
      out.write("                        <div id=\"googleMap\" style=\"width:500px;height:380px;\"></div>\n");
      out.write("\n");
      out.write("                        <form action=\"MenuPage.jsp\" method=\"post\">\n");
      out.write("                            <ul>\n");
      out.write("                                <p> Lorem ipsum dolor sit amet,</p>\n");
      out.write("                                <br>\n");
      out.write("                                <p>consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi. Nam eget dui.</p>\n");
      out.write("                                <br>\n");
      out.write("                                <p>Click hier :</p>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><input type=\"submit\" value=\"Menu\" name=\"submit\"/></td>\n");
      out.write("                                </tr>\n");
      out.write("                            </ul>\n");
      out.write("                        </form>\n");
      out.write("                        <form action=\"RestaurantFotos.jsp\" method=\"post\"><p>Fotos:<input type=\"submit\" value=\"Fotos\"></p></form>\n");
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
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
