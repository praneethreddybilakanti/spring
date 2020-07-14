<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>  
<html>  
<head>  
    <title>Reservation Form</title>  
</head>  
<h3>Railway Reservation Form</h3>  
<body>  
    <form:form action="submit" modelAttribute="res">  
        First name: <form:input path="firstName" />         
        <br><br>  
        Last name: <form:input path="lastName" />  
        <br><br>  
        Gender:   
        Male<form:radiobutton path="Gender" value="Male"/>  
        Female<form:radiobutton path="Gender" value="Female"/>  
        <br><br>  
        Meals:  
        BreakFast<form:checkbox path="Food" value="BreakFast"/>  
        Lunch<form:checkbox path="Food" value="Lunch"/>  
        Dinner<form:checkbox path="Food" value="Dinner"/>  
        <br><br>  
        <input type="submit" value="Submit" />  
    </form:form>  
</body>  
</html>  