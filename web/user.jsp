<%-- 
    Document   : user
    Created on : Jul 18, 2014, 2:00:42 PM
    Author     : salahdin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Enter your name and contact information</h1>
                                       
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
                                    <tr>
                                       <td><input type="submit" name="submit" value="SUBMIT"/><br><td><input type="reset" value="RESET"/></td>
                                       
                                    </tr>
                                    <br>
                                </table>
                            </form>
                        </ul>
    </body>
</html>
