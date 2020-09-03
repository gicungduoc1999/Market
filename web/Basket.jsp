<%-- 
    Document   : Home
    Created on : 08-06-2020, 01:08:22
    Author     : Mr D
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Css/Basket.css" rel="stylesheet" type="text/css"/>
        <title>Basket</title>
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
                <table >
                    <tr>
                        <td>
                            <h1 style="margin-left: 20px;">Your Basket</h1>
                        </td>
                        <td></td>
                        <td colspan="2">
                            <div class="buttonNomal">
                                <button><a href="home" >Buy more</a></button>
                                <button><a href="Checkout.jsp" >Checkout</a></button>
                            </div>
                        </td>
                    </tr>
                    <!----tite----->
                    <tr>
                        <td style="width: 450px;" >
                            <h3 style="margin-left: 20px;" >Product</h3>
                        </td>
                        <td style="width: 120px;">
                            <h3>Price</h3>
                        </td>
                        <td style="width: 120px;">
                            <h3>Quality</h3>
                        </td >
                        <td style="width: 120px;" >
                            <h3>Total</h3>
                        </td>
                    </tr>
                    <!---line-->
                    <tr style="margin-top: 200px;" >
                        <td colspan="4">
                            <div class="line">
                            </div>
                        </td>
                    </tr>
                    
                    <c:forEach var="f" items="${sessionScope.order.item}" >
                        <!----item---->
                    <tr>
                        <td>
                            <!---item content--->
                            <div class="item">
                                <img src="Image/${f.product.image}" alt=""/>
                                <div class="content">
                                    <a href="">${f.product.name}</a>
                                    <p>${f.product.delivery}</p>
                                    <p>business days</p>
                                    <p>Size : ${f.product.size}</p>
                                </div>
                            </div>
                        </td>
                        <td ><p style="margin-top: -55px;">${f.price}</p></td>
                        <td ><p style="margin-top: -55px;">${f.quality}</p></td>
                        <td >
                            <div class="total">
                                <p style="margin-top: -55px;">${f.total}</p>
                                <button style="margin-top: -55px;" ><a href="remove?id=${f.product.id}" >x</a></button>
                            </div>
                        </td>
                    </tr>
                    <!----item---->
                    </c:forEach>
                    <!----line---->
                    <tr style="margin-top: 200px;" >
                        <td colspan="4">
                            <div class="line2">
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td ><p>Subtotal</p></td>
                        <td></td>
                        <td><p>${order.subtotal}</p></td>
                            
                    </tr>
                    <tr  >
                        <td></td>
                        <td><p>Shipping</p></td>
                        <td></td>
                        <td><p>16.000usd</p></td>
                    </tr>
                     <!----line---->
                    <tr  >
                        <td colspan="4">
                            <div class="line3">
                            </div>
                        </td>
                    </tr>
                     <tr >
                        <td></td>
                        <td><h3 style="margin-top: -5px;">Total</h3></td>
                        <td></td>
                        <td><p style="margin-top: -5px;" >${order.subtotal+16000}usd</p></td>
                    </tr>
                </table>

            </div>
            <!----footer---->
            <div class="footerSpace">
                
            </div>
            <div class="lineFooter">
            </div>
            <div class="footer">
                <p>This website was created with Simple site</p>
                <a href="">Get your own FREE website.Click here!</a>
            </div>
        </div>
    </body>
</html>
