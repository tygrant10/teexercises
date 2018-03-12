<%@ page import="java.util.Date" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="today" value="<%=new Date()%>"/>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Review Post</title>
    <c:url value="/css/reviewPost.css" var="cssHref" />
    <link rel="stylesheet" href="${cssHref}">
</head>


<section class="centeredPanel">
	<h1 class="centered">New Review</h1>
	<form method="POST" action="${formAction}">
		<div>
			<label for="username">Username</label> <input type="text"
				name="username" id="username">
		</div>
		<div>
			<label for="rating">Rating</label>
			<c:out value="Star Rating" />
			<select name="rating" class="tab">
				<option value="0">0 Stars</option>
				<option value="1">1 Star</option>
				<option value="2">2 Stars</option>
				<option value="3">3 Stars</option>
				<option value="4">4 Stars</option>
				<option value="5">5 Stars</option>
			</select>
		</div>
		<div>
			<label for="title">Review Title</label> <input type="text"
				name="title" id="title">
		</div>

		<div>
			<label for="text">Review Text</label>
			<textarea name="text" id="text" cols="50" rows="10"></textarea>
			<input type="submit" value="Submit" />
		</div>
		<div>
			<input type = "hidden" name ="dateSubmitted" value = "${today}" >
		</div>

	</form>





</section>
</html>
