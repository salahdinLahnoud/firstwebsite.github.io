<%-- 
    Document   : Checkout
    Created on : Jul 21, 2014, 12:19:04 PM
    Author     : salahdin
--%>

<%@page import="model.User"%>
<%@page import="model.Product"%>
<%@page import="java.util.Iterator"%>
<%@page import="model.Checkout"%>
<%@page import="controle.CheckoutBeans"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%
            CheckoutBeans cb;
            if (request.getAttribute("model") != null) {
                cb = (CheckoutBeans) request.getAttribute("model");

            } else {
                cb = new CheckoutBeans();

            }


        %>

        <h1>Uw bestellingen Zijn :</h1>
        
        
        
        <%
        
        Iterator<Checkout> it = cb.getCheckoutlijst().iterator();
        while(it.hasNext()){
        
            Checkout c = it.next();
            int nummber = c.getCheckoutNumber();
            Product product = c.getProduct();
            User user = c.getUser();
            
            String code = product.getCode();
            String description = product.getDescription();
            double price = product.getPrice();
            int qty = product.getQty();
            
            
            
        
        
        
        %>
        
        
          <tr>    
                                
                                    <td><%= code%></td>
                                    <input type="hidden" name= "code" value='<%= code %>'>
                                    
                                    <td><%= description%></td>
                                    <input type="hidden" name= "description" value='<%= description %>'>

                                    <td><%= price%></td>
                                    <input type="hidden" name= "price" value='<%= price %>'>

                                    <td><%= qty%></td>
                                    <input type="hidden" name= "qty" value='<%= qty %>'>
                                    
                                    
                                    <% } %>
                                    
                                     </tr>
    </body>
</html>
