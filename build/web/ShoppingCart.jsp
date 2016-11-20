<%-- 
    Document   : details
    Created on : 11 déc. 2013, 16:43:53
    Author     : salahdin
--%>
<%@page import="model.User"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="controle.ProductBeans"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<%@ page language = "java" session = "true" %>
<%@page import="model.Product"%>
<%@ page import = "java.text.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  

    <head> 
        <title>Details</title>
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <link rel="stylesheet" type="text/css" href="css/Show.css" />
        <script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
        <script type="text/javascript" src="js/jquery.cycle.all.js"></script>
        <script type="text/javascript" src="js/code.js"></script>
        <script type="text/javascript" src="js/increment.js"></script>
        <script type="text/javascript" src="js/UpdateQty.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  

    </head>  
    <body>  







        <%
            ProductBeans pb;
            if (request.getAttribute("model") != null) {
                pb = (ProductBeans) request.getAttribute("model");

            } else {
                pb = new ProductBeans();

            }


        %>
        <div id="container">
            <div id="header">
                <h5>Welkom : </h5>
                <h1>Project Test Restaurant</h1>
                <p>Project Test </p>  

                <img src="images/menukaart2.jpg" alt="logo2" />
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

                        <div class="rec_s"> 
                            <form action="UserServlet" method="post">
                                <table border="0" width="100%">  
                                    <tr>  
                                        <th>Code</th> 
                                        <th>Description</th> 
                                        <th>Price</th> 
                                        <th>Image</th> 
                                        <th>QTY</th> 
                                        <th>Subtotaal</th>
                                        <th>Update QTY</th>

                                    </tr>

                                    <%  double update = 0.0;
                                        double subtotaal = 0.0;
                                        double totaal = 0.0;
                                        int subCart = 0;
                                        int totaalCart = 0;
                                        int qty = 0;
                                        String description = "";

                                        Iterator<Product> iterator = pb.getProductlijst().iterator();
                                        while (iterator.hasNext()) {
                                            Product p = iterator.next();
                                            String code = p.getCode();
                                            description = p.getDescription();
                                            double price = p.getPrice();
                                            String image = p.getImage();
                                            qty = p.getQty();
                                            subtotaal = price * qty;
                                            subCart = qty;
                                            totaalCart += subCart;
                                            totaal += subtotaal;

                                    %>


                                    <tr>    

                                        <td><%= code%></td>
                                    <input type="hidden" name= "code" value='<%= code%>'>

                                    <td><%= description%></td>
                                    <input type="hidden" name= "description" value='<%= description%>'>

                                    <td><%= price%></td>
                                    <input type="hidden" name= "price" value='<%= price%>'>

                                    <td><%= image%></td>
                                    <input type="hidden" name= "image" value='<%= image%>'>

                                    
                                    <input type="hidden" name= "qty" value='<%= qty%>'>
                                    <td><div id="count" style="font-size: xx-large;">
                                            <td><%= qty%></td>
                                    </div></td>
                                  

                                    <td><%= subtotaal%></td>
                                   <form method="post">
                                        <td><button type="button" onClick="increment();">+</button></td>
                                        <td><button type="button" onClick="decrement();">-</button></td>

                                    </form>
                                    

                                    <input type="hidden" name="subtotaal" value='<%= subtotaal%>'>
                                             
                                            
                                    <input type="hidden" name="qty" value='<%= qty%>'>
                                  

                                    </tr>
                                    <% }%>

                                    </tr>
                                    <tr>
                                    <input type="hidden" name= "totaal" value='<%= totaal%>'>

                                </table>
                            </form>


                            <div id="All_rec_s" >

                                <div class="rec_s"> 

                                    <table border="0" width="100%">  
                                        <tr>  
                                            <th>Totaal</th>
                                            <th>Your Sopping Cart</th>


                                        </tr>
                                        <tr>
                                            <td align="center"><%= totaal%></td>
                                        <input type="hidden" name= "totaal" value='<%= totaal%>'>
                                        <td align="center">(<%= totaalCart%>)<img src="images/ShoppingCartButton.png" alt="logo"/></td>
                                        </tr>

                                    </table> 


                                </div>

                            </div>
                            <div id="contant">

                                <div id="nav">
                                    <ul>
                                        <form action="Login.jsp" method="post">
                                            <p>Ik heb al een account</p><input type="submit" value="Login" name="Login"></form>


                                        <form  id="theForm" action="UserServlet"  method="post">


                                            <form  id="theForm" action="UserServlet"  method="post">


                                                <table border="0" width="100%">

                                                    <tr><td>ID<span class="red">*</span></</td>
                                                        <td><input id ="name" type="text" name="id"/></td>
                                                        <td id="nameError" class="red">&nbsp;</td></tr>
                                                    </tr>
                                                    <tr><td>Firstname<span class="red">*</span></</td>
                                                        <td><input id ="name" type="text" name="voornaam"/></td>
                                                        <td id="nameError" class="red">&nbsp;</td></tr>
                                                    </tr>
                                                    <tr><td>Lastname<span class="red">*</span></td>
                                                        <td><input id ="lname" type="text" name="achternaam"/></td>
                                                        <td id="lnameError" class="red">&nbsp;</td></tr>
                                                    </tr>
                                                    <tr><td>Street<span class="red">*</span></td>
                                                        <td><input id="street" type="text" name="adres"/></td>
                                                        <td id="streetError" class="red">&nbsp;</td></tr>
                                                    </tr>
                                                    </tr>
                                                    </tr>
                                                    <tr><td>Phone<span class="red">*</span></td>
                                                        <td><input id="phone" type="text" name="telefoon"/></td>
                                                        <td id="phoneError" class="red">&nbsp;</td></tr>
                                                    </tr>
                                                    <tr><td>ZipCode<span class="red">*</span></td>
                                                        <td><input id="zipcode" type="text" name="postcode"/></td>
                                                        <td id="zipcodeError" class="red">&nbsp;</td></tr>
                                                    </tr>
                                                    <input type="hidden" name="subtotaal" value='<%= subtotaal%>'>
                                                    <input type="hidden" name="qty" value='<%= qty%>'>
                                                    <input type="hidden" name= "description" value='<%= description%>'>
                                                    <tr>
                                                        <td><input type="submit" name="submit" value="SUBMIT"/><br><td><input type="reset" value="RESET"/></td>

                                                    </tr>
                                                    <br>
                                                </table>
                                            </form>
                                    </ul>
                                </div><!--end nav--->
                            </div><!--- end contant--->                 

                        </div><!--- end All_rec_s --->
                    </div><!--- end contant--->
                </div>
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
