<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="update" modelAttribute="driver">

 <form:hidden path="driverId"/>
DriverName : <form:input path="driverName"/><br><br>

DriverAge  : <form:input path="driverAge"/><br><br>

DriverContact  : <form:input path="driverContact"/><br><br>

DriverLicense  : <form:input path="driverLicense"/><br><br>

<input type="submit" value="EditDriver">



</form:form>


<a href="viewAll">ViewAllDrivers </a>
</body>
</html>