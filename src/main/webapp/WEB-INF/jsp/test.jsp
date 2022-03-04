<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
    table{
     border: 10px solid yellow;
    }

        td{
            width: 150px;
            height: 40px;
            text-align: center;
            color:blue;
        }
    </style>
</head>
<body>

<center>
<h2>
首个*Spring MVC*页面
</h2>
</center>
<div class="container">

    <table bgcolor="pink" border-color="red" class="table table-bordered text-center"
     border="1" cellpadding="0" cellspacing="0" align="center">
        <tr>
         <td>ID</td>
            <td>数字</td>
            <td>性别</td>


        </tr>
        <c:forEach items="${msg}" var="msg">
            <tr>
              <td>${msg.id}</td>
                <td>${msg.number}</td>
                <td>${msg.sex}</td>



            </tr>
        </c:forEach>
    </table>

</div>

</body>
</html>