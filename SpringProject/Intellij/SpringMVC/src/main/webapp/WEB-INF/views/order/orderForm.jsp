<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-12
  Time: 오후 3:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Order Form</title>
</head>
<body>
    <h1>Order</h1>
    <hr>

    <form method="POST">
        <h3>상품 1</h3>
        ID - <input type="text" name="orderItems[0].itemId"><br>
        Number - <input type="number" name="orderItems[0].number"><br>
        Remark - <input type="text" name="orderItems[0].remark"><br>
        <br>
        <h3>상품 2</h3>
        ID - <input type="text" name="orderItems[1].itemId"><br>
        Number - <input type="number" name="orderItems[1].number"><br>
        Remark - <input type="text" name="orderItems[1].remark"><br>
        <br>
        <h3>상품 2</h3>
        ID - <input type="text" name="orderItems[2].itemId"><br>
        Number - <input type="number" name="orderItems[2].number"><br>
        Remark - <input type="text" name="orderItems[2].remark"><br>
        <br>
        <h3>배송지 주소</h3>
        zipcode - <input type="text" name="address.zipcode"><br>
        address1 - <input type="text" name="address.address1"><br>
        address2 - <input type="text" name="address.address2"><br>
        <br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
