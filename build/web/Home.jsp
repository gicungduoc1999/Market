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
        <link href="Css/Home.css" rel="stylesheet" type="text/css"/>
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
                    <h2>Online Store</h2>
                    <div class="productMenu">
                        <c:forEach var="f" items="${list}" >
                            <!----product---->
                            <div class="product">
                                <img src="Image/${f.image}" alt=""/>
                                <br>
                                <a href="detail?id=${f.id}"><h3>${f.name}</h3></a>
                                <p>${f.price}</p>
                                 <form action="basket">
                                <p>Size:  
                               
                                    <select name="size" >
                                        <c:forEach items="${u.getSizeProduct(f.name)}"
                                                   var="f1" >
                                            <option >${f1}</option>
                                        </c:forEach>
                                    </select>
                                
                                </p>
                                <button type="submit" name="id" value="${f.id}">Add to basket</button>
                                </form>
                            </div>
                            <!----product---->
                        </c:forEach>
                    </div>
                    <!----page---->
                    <div class="page" >
                        <c:forEach begin="1" end="${num}" var="f">
                                <button><a class="button" href="home?page=${f}" >${f}</a></button>
                        </c:forEach>
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
                        <button><a href="Checkout.jsp" >Checkout</a></button>
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
    <script>
         //check mess when input information
        var mess = '${mess}'
        if (mess != '')
        {
            alert(mess);
        }
    </script>
</html>
