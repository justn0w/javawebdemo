<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>title</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/user/save" method="post">
    id<input type="text" name="id">
    username<input type="text" name="username"><br>
    birthday<input type="date" name="birthday"><br>
    sex<input type="text" name="sex"><br>
    address<input type="text" name="address"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
