<%-- 
    Document   : Home
    Created on : 08-06-2020, 01:08:22
    Author     : Mr D
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Css/Detail.css" rel="stylesheet" type="text/css"/>
        <title>Home</title>
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
            <jsp:useBean class="entity.ProductDao" id="u" />
            <div class="body">
                <!---left--->
                <div class="left">
                    <h1>${product.name}</h1>
                    <!----product--->
                    <div class="product">
                        <img src="Image/${product.image}" alt=""/>
                        <!----product detail--->
                        <div class="productDetail">
                            <table>
                                <tr>
                                    <td><h3>Price :</h3></td>
                                    <td><h3>${product.price}<h3></td>
                                                </tr>
                                                <form action="basket">
                                                <tr>
                                                    <td><p>Quality : </p></td>
                                                    <td><input name="quality" type="number" value="1"></td>
                                                </tr>
                                                <tr>
                                                    <td><p>Size :</p> </td>
                                                    <td>
                                                        <select name="size">
                                                            <c:forEach items="${u.getSizeProduct(product.name)}"
                                                                       var="f1" >
                                                                <option>${f1}</option>
                                                            </c:forEach>
                                                        </select>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td>
                                                         <button type="submit" name="id" value="${product.id}">Add to basket</button>
                                                    </td>
                                                </tr>
                                                </form>
                                                </table>
                                                <br><br>
                                                <!---description--->
                                                <h4>Description</h4>
                                                <p>
                                                    ${product.description}
                                                </p>
                                                <br>
                                                <h4>Delivery: ${product.delivery}</h4>
                                                </div>
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
