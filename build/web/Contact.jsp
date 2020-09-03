<%-- 
    Document   : Home
    Created on : 08-06-2020, 01:08:22
    Author     : Mr D
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Css/Contact.css" rel="stylesheet" type="text/css"/>
        <title>Contact</title>
    </head>
    <body>
        <div class="all">
            <div class="header">
                <!-----header---->
                <div class="text">
                    <h1>Handmade by Catherine</h1>
                    <p>Welcome to My Online Store </p>
                </div>
            </div>
            <!----menu=---->
            <div class="menu">
             <a href="home">Online Store</a>
                <a href="About.jsp">About </a>
                <a href="Contact.jsp">Contact</a>
            </div>
            <!-----body---->
            <div class="body">
                <!---left--->
                <div class="left">
                    <div class="contact">
                        <h1>Contact</h1>
                        <h2>Handmade by Catherine</h2>
                        <p>Address: abc</p>
                        <p>City: abc123</p>
                        <p>Country: abc123</p>
                        <p>Tel: 123456</p>
                        <p>Email: your-email@your-email.com</p>
                        <img src="Image/con1.jpg" alt=""/>
                    </div>
                </div>
                <!----right--->
                <div class="right">
                    <!----basket---->
                    <div class="basket">
                        <div class="text">
                            <img src="Image/g.png" alt=""/>
                            <a href="Basket.jsp" >Your basket (${sessionScope.order.count})</a>
                        </div>
                        <button><a href="" >Checkout</a></button>
                    </div>
                    <!----share----->
                    <div class="share">
                        <h3>
                            Share this page
                        </h3>
                        <img src="Image/6.jpg" alt=""/>
                        <a href="">Share on Facebook</a>
                        <br>
                        <img src="Image/7.jpg" alt=""/>
                        <a href="">Share on Facebook</a>
                        <br>
                        <img src="Image/8.jpg" alt=""/>
                        <a href="">Share on Facebook</a>
                    </div>
                    <!------ads----->
                    <div class="ads">
                        <h3>Create a website</h3>
                        <p>Everybody can create a website, it's easy</p>
                        <button><a href="" >Try it for FREE now</a></button>
                    </div>
                </div>
            </div>
            <!----footer---->
            <div class="lineFooter">
            </div>
            <div class="footer">
                <p>This website was created with Simple site</p>
                <a href="">Get your own FREE website.Click here!</a>
            </div>
        </div>
    </body>
</html>
