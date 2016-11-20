<%-- 
    Document   : HomePage
    Created on : 19 févr. 2014, 11:05:43
    Author     : salahdin
--%>


<%-- 
    Document   : index
    Created on : 2 août 2013, 14:40:26
    Author     : salahdin
--%>
<%@ page import="java.io.*,java.util.*" %>
<html>
    <head>
        <title>Restaurant Maxima</title>
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
        <script type="text/javascript" src="js/jquery.cycle.all.js"></script>
        <script type="text/javascript" src="js/code.js"></script>
        <script type="text/javascript" src="js/googleMap.js"></script>
        <script src="http://maps.googleapis.com/maps/api/js?key=AIzaSyDY0kkJiTPVd2U7aTOAwhc9ySH6oHxOIYM&sensor=false">
        </script>
        <script>
            function initialize()
            {
                var mapProp = {
                    center: new google.maps.LatLng(51.816582, 4.678012),
                    zoom: 5,
                    mapTypeId: google.maps.MapTypeId.ROADMAP
                };
                var map = new google.maps.Map(document.getElementById("googleMap"), mapProp);
            }

            google.maps.event.addDomListener(window, 'load', initialize);
        </script>
    </head>
    <body>
        <div id="container">
            <div id="header">
                <h1>Project Test Restaurant</h1>
                <p>Project Test </p>
                <img src="images/pizzasalahdin.jpg" alt="logo" width="250"/>
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
                    <div id="nav">
                        <div id="googleMap" style="width:500px;height:380px;"></div>

                        <form action="MenuPage.jsp" method="post">
                            <ul>
                                <p> Lorem ipsum dolor sit amet,</p>
                                <br>
                                <p>consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi. Nam eget dui.</p>
                                <br>
                                <p>Click hier :</p>
                                <tr>
                                    <td><input type="submit" value="Menu" name="submit"/></td>
                                </tr>
                            </ul>
                        </form>
                        <form action="RestaurantFotos.jsp" method="post"><p>Fotos:<input type="submit" value="Fotos"></p></form>
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




