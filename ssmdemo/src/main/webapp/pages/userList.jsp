<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>title</title>
</head>
<body>
    我是userList界面
    展示user信息
    <table border="1px">
        <tr>
            <th>id</th>
            <th>username</th>
            <th>birthday</th>
            <th>sex</th>
            <th>address</th>
        </tr>

            <c:forEach items="${userList}" var="user">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.username}</td>
                    <td>${user.birthday}</td>
                    <td>${user.sex}</td>
                    <td>${user.address}</td>
                </tr>
            </c:forEach>

    </table>
</body>
</html>
