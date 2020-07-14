<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<style>
.error {
	color: red;
	font-weight: bold;
}
</style>
<form:form action="login" commandName="userForm">
	Email: <form:input path="email" size="30" /><br>
	<form:errors path="email" cssClass="error" /><br>
	
	Password: <form:password path="password" size="30" /><br>
	<form:errors path="password" cssClass="error" /><br>

	<input type="submit" value="Login" /><br>
</form:form>

</body>
</html>