<%-- 
    Document   : ShowAll
    Created on : 3 août 2013, 12:16:46
    Author     : salahdin
--%>
<%@ page import="java.io.*,java.util.*" %>
<%@page import="controle.BestellingenBeans"%>
<%@page import="model.Bestellingen" session = "true"%>
<%@page import="javax.naming.spi.DirStateFactory.Result"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Show Products</title>
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <link rel="stylesheet" type="text/css" href="css/Show.css" />
        <script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
        <script type="text/javascript" src="js/jquery.cycle.all.js"></script>
        <script type="text/javascript" src="js/code.js"></script>
    </head>


    <body>


        <%
            BestellingenBeans bb;
            if (request.getAttribute("model") != null) {
                bb = (BestellingenBeans) request.getAttribute("model");
            } else {
                bb = new BestellingenBeans();
            }
        %>
        <div id="container">
            <div id="header">
                <h1>Project Test Restaurant</h1>
                <p>Project Test </p>             
                <img src="images/menukaart2.jpg" alt="logo2" />
                <%
                    // Set refresh, autoload time as 5 seconds
                    response.setIntHeader("Refresh", 30);
                    // Get current time
                    Calendar calendar = new GregorianCalendar();
                    String am_pm;
                    int hour = calendar.get(Calendar.HOUR);
                    int minute = calendar.get(Calendar.MINUTE);
                    int second = calendar.get(Calendar.SECOND);
                    if (calendar.get(Calendar.AM_PM) == 0) {
                        am_pm = "AM";
                    } else {
                        am_pm = "PM";
                    }
                    String CT = hour + ":" + minute + ":" + second + " " + am_pm;
                    out.println("Tijd is nu: " + CT + "\n");
                %>

            </div><!--- end header--->
            <div id="warpper">
                &nbsp;
                <div id="slider">
                    <img src="images/pizza1.jpg" alt=" " width="720" height="300"/>
                    <img src="images/pizza2.jpg" alt=" " width="720" height="300"/> 
                    <img src="images/pizza3.jpg" alt=" " width="720" height="300"/> 
                    <img src="images/pizza4.jpg" alt=" " width="720" height="300"/>  
                    <img src="images/pizza5.jpg" alt=" " width="720" height="300"/> 
                    <img src="images/pizza6.jpg" alt=" " width="720" height="300"/> 
                    <img src="images/pizza7.jpg" alt=" " width="720" height="300"/>
                    <img src="images/lasagne.jpg" alt=" " width="720" height="300"/> 
                </div><!--- end slider--->

                <div id="contant">
                    <div id="All_rec_s" >

                        <ul>
                            <li>
                                <div class="rec_s_f">
                                    <table border="0" width="100%" >
                                        <tr>
                                            <td>Code</td>
                                            <td>Naam</td>
                                            <td>Quantity</td>
                                            <td>Totaal</td>
                                            <td>Besteller</td>
                                            <td>Telefoon</td>
                                            <td>Action</td>



                                        </tr>
                                    </table>
                                </div><!--- end rec_s--->
                            </li>
                            <%
                                ArrayList allbesteller = model.Bestellingen.getAll();
                                Iterator it = allbesteller.iterator();
                                while (it.hasNext()) {

                                    Bestellingen b = (Bestellingen) it.next();
                                    int id = b.getId();
                                    String naam = b.getNaam();
                                    int qty = b.getQty();
                                    double totaal = b.getTotaal();
                                    String besteller = b.getBesteller();


                            %>
                            <li>
                                <div class="rec_s">

                                    <form action="DeleteServlet" method="GET">
                                        <table border="0" >
                                            <tr>
                                            <td name ="id"><%= id%></td>
                                            <input type="hidden" name= "id" value='<%= id%>'>
                                            <td name ="naam"><%= naam%></td>
                                            <input type="hidden" name= "naam" value='<%= naam%>'>
                                            <td name ="qty"><%= qty%></td>
                                            <input type="hidden" name= "qty" value='<%= qty%>'>
                                            <td name ="totaal"><%= totaal%>€</td>
                                            <input type="hidden" name= "totaal" value='<%= totaal%>'>
                                            <td name ="besteller"><%= besteller%></td>
                                            <input type="hidden" name= "besteller" value='<%= besteller%>'>


                                            <td><input type=submit value= 'Delete'></td>

                                            </tr>
                                        </table>
                                    </form>

                                </div><!--- end rec_s--->
                            </li>
                            <%}%>
                        </ul>

                    </div><!--- end All_rec_s --->

                </div><!--- end contant--->

                <div id="footer">
                    <div id="footerIn">
                        <p>All the right received</p>
                        <p>Example copyright &copy 2013</p>
                        <ul>
                            <li>
                                <img src="images/facebook.png" alt="facebook" />
                                <a href="https://www.facebook.com">Our facebook page</a>
                            </li>
                            <li>
                                <img src="images/youtube.png" alt="youtube" />
                                <a href="http://www.youtube.com">Our channel in youtube</a>
                            </li>
                        </ul>
                    </div><!--- end footerIn--->
                </div><!--- end footer--->
            </div><!--- end warpper--->
        </div><!--- end container--->
    </body>
</html>

