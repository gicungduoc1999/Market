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
        <link href="Css/Order.css" rel="stylesheet" type="text/css"/>
        <title>About</title>
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
                <h1>Order summary</h1>
                <h2>Shipping and billing address</h2>
                <div class="info">
                    <p>abc</p>
                    <p>abc</p>
                    <p>abc</p>
                    <p>abc</p>
                    <p>abc</p>
                    <p>abc</p>
                    <p>abc</p>
                </div>
                <div class="change">
                    <a href="" >Change</a>
                </div>
                <h2>Your order</h2>
                <!----table---->
                <table >
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
                    <!----item---->
                    <tr>
                        <td>
                            <!---item content--->
                            <div class="item">
                                <img src="Image/1.jpg" alt=""/>
                                <div class="content">
                                    <a href="">Product 1</a>
                                    <p>Delivery 1-2</p>
                                    <p>business days</p>
                                    <p>Size : one size</p>
                                </div>
                            </div>
                        </td>
                        <td ><p style="margin-top: -55px;">8.00usd</p></td>
                        <td ><p style="margin-top: -55px;">1</p></td>
                        <td >
                            <p style="margin-top: -55px;">8.00usd</p>
                        </td>
                    </tr>
                    <!----item---->

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
                        <td><p>16.000usd</p></td>

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
                        <td><p style="margin-top: -5px;" >16.000usd</p></td>
                    </tr>
                </table>
                <!---table--->
                <div class="term">
                      <input type="checkbox">I agree to the <a href="" >terms and conditions</a>
                </div>
                <div class="buttonFooter">
                     <button><a href="" >Go back</a></button>
                      <button><a href="" >Place order</a></button>
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
