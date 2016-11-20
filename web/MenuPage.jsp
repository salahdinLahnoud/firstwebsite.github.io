<%-- 
    Document   : ShowAll
    Created on : 3 août 2013, 12:16:46
    Author     : salahdin
--%>

<%@page import="javax.naming.spi.DirStateFactory.Result"%>
<%@page import="java.util.Iterator"%>
<%@page import="controle.ProductBeans"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Product"  session = "true"%>
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
            ProductBeans pb ;
            if(request.getAttribute("model")!= null){
                pb = (ProductBeans) request.getAttribute("model");
            }else{
                pb = new ProductBeans();
            } 
        %>
        <div id="container">
            <div id="header">
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

                        <ul>
                            <li>
                                <div class="rec_s_f">
                                    <table border="0" width="100%" >
                                        <tr>
                                            <td>Menu Code</td>
                                            <td>Description</td>
                                            <td>Price</td>
                                            <td>Image</td>
                                            <td>Quantity</td>
                                            <td>Add To Cart</td>
                                            
                                       
                                         
                                        </tr>
                                    </table>
                                </div><!--- end rec_s--->
                            </li>
                            <%

                                ArrayList allProducten = model.Product.getAll();
                                for (int i = 0; i < allProducten.size(); i++) {
                                    Product st = (Product) allProducten.get(i);
                                    String id = st.getCode();
                                    String description = st.getDescription();
                                    double price = st.getPrice();
                                    String image = st.getImage();
                            %>
                            <li>
                                <div class="rec_s">
                                    <form action="MenuServlet" method="post">
                                     
                                    <table border="0" >
                                        <tr>
                                            <td name ="code"><%= id%></td>
                                            <input type="hidden" name= "code" value='<%= id %>'>
                                            <td name ="description"><%= description%></td>
                                            <input type="hidden" name= "description" value='<%= description%>'>
                                            <td name ="price"><%= price%>Euro</td>
                                            <input type="hidden" name= "price" value='<%= price%>'>
                                            <td name ="image"><%= image%></td>
                                            <input type="hidden" name= "image" value='<%= image%>'>
                                            <td><input type="text" value="0" name="qty" size="3"></td>
                                            <td input type="text" value="0" name="qty"></td>
                                            <td><input type=submit value= '+'  name="action"></td>
                                           
                                           
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

