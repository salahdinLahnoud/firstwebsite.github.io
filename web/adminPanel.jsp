<%-- 
    Document   : adminPanel
    Created on : Jul 26, 2014, 6:10:10 PM
    Author     : salahdin
--%>

<%@page import="java.util.Iterator"%>
<%@page import="model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="css/style.css" />
    <script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="js/jquery.cycle.all.js"></script>
    <script type="text/javascript" src="js/code.js"></script>
    <title>Administrator Panel</title>
</head>
<body>
    <div id="container">
        <div id="header">
            <img src="images/pizzasalahdin.jpg" alt="logo" width="250"/>
        </div>
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
            </div>
            <div id="contant">
                
                    <div id="All_rec_s" >


                        <ul>
                            <li>
                                <div class="rec_s_f">
                                    <h1>Administrator Panel</h1>
                                    
                                        <table border="0" width="100%" >
                                        <tr>
                                            <td>CODE</td>
                                            <td>DESCRIPTION</td>
                                            <td>IMAGE</td>
                                            <td>PRICE</td>
                                            <td>QUANTITY</td>
                                            <td>Edit</td>
                                            <td>Delete</td>
                                            <td>Add</td>
                                        </tr>
                                    </table>
                                         </div><!--- end rec_s--->
                            </li>


                                    <%

                                        ArrayList producten = model.Product.getAll();
                                        Iterator<Product> it = producten.iterator();
                                        while (it.hasNext()) {

                                            Product p = (Product) it.next();
                                            String code = p.getCode();
                                            String description = p.getDescription();
                                            String image = p.getImage();
                                            double price = p.getPrice();
                                            int qty = p.getQty();


                                    %>
                                    <li>
                                    <div class="rec_s">
                                    <table border="0" >
                                        <tr>
                                            <td><%= code%></td>
                                            <td><%= description%></td>
                                            <td><%= image%></td>
                                            <td><%= price%></td>
                                            <td><%= qty%></td>
                                            <td><input type=submit value=Update name=<%= code%>></td>
                                            <td><input type=submit value=Delete name=<%= code%>></td>
                                            <td><input type=submit value=Add name=<%= code%>></td>  
                                        </tr>
                                    </table>
                                    </div>
                                    </li>
                                    

                                    <% }%>
                                    </ul>
                                </div><!--end nav--->
            
                                <form action="UsersBestellingen.jsp" method="post"><p>UsersBestellingen<input type="submit" value="UsersBestellingen"></p></form>
                                </div><!--- end contant--->
                                
            
        
                                <div id="footer">
                                    <div id="footerIn">
                                        <%
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
                                        %>

                                        <p>Total number of visits: <%= hitsCount%></p>
                                        <p>All the right received copyright &copy 2014</p>
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