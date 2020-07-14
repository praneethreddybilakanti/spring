<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head><title>Create User</title></head>
<body>
  <form:form action="createUser" method="post" commandName='user'>
	   Enter User Name:<form:input  path="name"/>
	   <font color="red"> <form:errors path="name"></form:errors></font><br/>
	   Enter age :<form:input path="age"/>
	   <font color="red"><form:errors path="age"></form:errors></font><br/>
	   Enter location :<form:input path="location"/>
	   <font color="red"><form:errors path="location" ></form:errors></font><br/>
	   <input type="submit">
  </form:form>
</body>
</html>