<%-- 
    Document   : Login
    Created on : Jul 17, 2014, 9:53:34 PM
    Author     : salahdin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
        <script type="text/javascript" src="js/jquery.cycle.all.js"></script>
        <script type="text/javascript" src="js/code.js"></script>
        <script type="text/javascript" src="js/LoginValidation.js"></script>
        <title>J.S.P Page</title>
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
                    <div id="nav">
                        <h1>Login : </h1>
                        <form action="LoginAdminServlet" method="GET" onsubmit="checkForBlank()">
                            <table border="0" cellpadding="0" cellspacing="0" align="center">


                                <tr>
                                <td><p>Username : </p></td><td><input type="text" id="username" name="username" value="" onmouseover=""></td></tr>
                                <tr><td><p>Password : </p></td><td><input type="password" id="password" name="password" value="" onmouseover=""></td>
                                    
                                    
                                <tr><td><input type="submit" name="submit" value="Submit">
                                        <input type="reset" value="CLEAR" id="reset"></td>
                                </tr>
                            </table>
                        </form>


                    </div><!--end nav--->
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
