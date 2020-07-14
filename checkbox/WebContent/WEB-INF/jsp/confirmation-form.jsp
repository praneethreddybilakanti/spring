<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html>  
<html>  
<body>  
<p>Your reservation is confirmed successfully. Please, re-check the details.</p>  
First Name : ${res.firstName} <br>  
Last Name : ${res.lastName} <br>  
Gender: ${res.gender}<br>  
Meals:   
<ul>  
<c:forEach var="meal" items="${res.food}">  
<li>${meal}</li>  
</c:forEach>  
</ul>  
</body>
</html>