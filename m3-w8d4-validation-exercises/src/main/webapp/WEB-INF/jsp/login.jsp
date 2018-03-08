<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<c:set var="pageTitle" value="Login"/>
<%@include file="common/header.jspf" %>

<h2>Login</h2>

<c:url var="loginUrl" value="/login" />
<form:form action="${loginUrl}" method="POST" modelAttribute="login">

	<div class="form-group">
		<label for="email">Email:</label>
		<form:input path="email" class="form-control" />
	</div>
	
	<div class="form-group">
		<label for="password">Password:</label>
		<form:input path="password" class="form-control" />
	</div>
	
	<input type="submit" value="Login!" class="btn btn-default">

</form:form>

<%@include file="common/footer.jspf" %>