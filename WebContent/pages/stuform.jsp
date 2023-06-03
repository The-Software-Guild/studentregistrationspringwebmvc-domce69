<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
<h2>Registration Form</h2>

<form:form method="post" modelAttribute="s">
	Name:<form:input path="name"/><form:errors path="name"/><br/>
	Age:<form:input path="age"/><form:errors path="age"/><br/>
	Mobileno:<form:input path="mobile"/><form:errors path="mobile"/><br/>
	Address:<form:input path="address"/><form:errors path="address"/><br/>
	<input type="submit" value="Submit"/> <br/>
</form:form>
</body>
</html>