<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form action= "ChangeUsernameServlet" method="post">
<table>
<tr><td>Enter Your Email:</td><td><input type="text" name="email"></td></tr>
<tr><td>Enter Your Password:</td><td><input type="text" name="Password"></td>
<tr><td>Enter Your Previous UserName:</td><td><input type="text" name="username"></td></tr>
<tr><td><input type="submit" value="submit"></td></tr>
<tr><td><a href="LoginForm.jsp">Cancel</a></td></tr>
</table>
</form>
</center>
</body>
</html>