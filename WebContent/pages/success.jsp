<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success!</title>
</head>
<body>
<%
  	String name = request.getParameter("name");
	String age = request.getParameter("age");
	String mobile = request.getParameter("mobile");
	String address = request.getParameter("address");
%>

<p>Registered Successfully!!!<br/>
Your details are Name is: <%=name%><br/>
Age is: <%=age%><br/>
Mobileno is: <%=mobile%><br/>
Address is: <%=address%><br/>


</body>
</html>