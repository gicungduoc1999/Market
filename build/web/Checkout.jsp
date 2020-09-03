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
        <link href="Css/Checkout.css" rel="stylesheet" type="text/css"/>
        <title>Checkout</title>
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
                <h1>Checkout</h1>
                <br>
                <h2>Shipping address</h2>
                <form action="checkout" onsubmit="return  checForm()">

                    <!---bodyContent--->
                    <div class="bodyContent">
                        <div class="left">
                            <p>Name *</p>
                            <input required="" name="name" id="name" class="input1" type="text" >
                            <p>Company</p>
                            <input name="company" id="company" class="input1" type="text" >
                            <p>Address line 1 *</p>
                            <input required="" name="address1" id="address1" class="input1" type="text" >
                            <p>Address line 2 </p>
                            <input name="address2" id="address2" class="input1" type="text" >
                            <!----content2---->
                            <div class="content2">
                                <!---left1--->
                                <div class="left1">
                                    <p>Zip *</p>
                                    <input required="" name="zip" id="zip" class="input2" type="text" >
                                    <p>State *</p>
                                    <select required="" name="state" id="state">
                                        <option>1</option>
                                        <option>2</option>
                                        <option>3</option>
                                    </select>
                                    <p>Phone</p>
                                    <input name="phone" id="phone" class="input2" type="number" >
                                </div>
                                <!----right1--->
                                <div class="right1">
                                    <p>City *</p>
                                    <input required="" name="city" id="city" class="input2" type="text" >
                                    <p>Country</p>
                                    <p>United States</p>
                                    <p style="margin-top:  28px;">Email *</p>
                                    <input name="email" id="email"  class="input2" type="text" >
                                </div>
                            </div>
                        </div>
                        <!----right--->
                        <div class="right">
                            <p>Conment</p>
                            <input name="comment" id="comment" type="text" >
                            <p class="required">* Required</p>
                        </div>
                    </div>


                    <!----line--->
                    <div class="line">
                    </div>
                    <h1>Billing address</h1>
                    <input id="same" name="bill" type="radio" onclick="showInfomation()" >Same as shipping address
                    <input id="diff" name="bill" type="radio" >Different
                    </div>
                    <!---footer button---->
                    <div class="footerButton">
                        <button><a href="Basket.jsp" >Go back</a></button>
                        <button type="submit"><a>Continue</a></button>
                    </div>
                </form>
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
        //set value 
        document.getElementById('name').value = '${sessionScope.order.customer.name}';
        document.getElementById('company').value = '${sessionScope.order.customer.company}';
        document.getElementById('address1').value = '${sessionScope.order.customer.address1}';
        document.getElementById('address2').value = '${sessionScope.order.customer.address2}';
        document.getElementById('zip').value = '${sessionScope.order.customer.zip}';
        document.getElementById('state').value = '${sessionScope.order.customer.state}';
        document.getElementById('phone').value = '${sessionScope.order.customer.phone}';
        document.getElementById('city').value = '${sessionScope.order.customer.city}';
        document.getElementById('email').value = '${sessionScope.order.customer.email}';
        document.getElementById('comment').value = '${sessionScope.order.customer.comment}';

        //set text null
        document.getElementById('diff').onclick = function () {
            document.getElementById('name').value = '';
            document.getElementById('company').value = '';
            document.getElementById('address1').value = '';
            document.getElementById('address2').value = '';
            document.getElementById('zip').value = '';
            document.getElementById('state').value = '';
            document.getElementById('phone').value = '';
            document.getElementById('city').value = '';
            document.getElementById('email').value = '';
            document.getElementById('comment').value = '';

        };
        //set value if same
        function showInfomation() {
            //set value in sesion
            document.getElementById('name').value = '${sessionScope.order.customer.name}';
            document.getElementById('company').value = '${sessionScope.order.customer.company}';
            document.getElementById('address1').value = '${sessionScope.order.customer.address1}';
            document.getElementById('address2').value = '${sessionScope.order.customer.address2}';
            document.getElementById('zip').value = '${sessionScope.order.customer.zip}';
            document.getElementById('state').value = '${sessionScope.order.customer.state}';
            document.getElementById('phone').value = '${sessionScope.order.customer.phone}';
            document.getElementById('city').value = '${sessionScope.order.customer.city}';
            document.getElementById('email').value = '${sessionScope.order.customer.email}';
            document.getElementById('comment').value = '${sessionScope.order.customer.comment}';

        }
        //check number phone 
        function checForm() {
            //check email
            var email = document.getElementById('email').value;
            var regex = /[a-z,0-9]+@[a-z]+.[a-z]+/g;
            var result = email.match(regex);
            if (result == null) {
               alert("Please Enter format email");
               return false;

            }
            //check phone
            var phone = document.getElementById('phone').value;
            if (phone == '') {
                  alert("please enter phone");
                return false;
            }

        }
        //check mess when input information
        var mess = '${mess}'
        if (mess != '')
        {
            alert(mess);
        }


    </script>
</html>
