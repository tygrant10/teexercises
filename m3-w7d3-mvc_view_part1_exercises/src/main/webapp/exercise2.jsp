<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 2 - Fibonacci 25</title>
		<style>
			li {
				list-style-type: none;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 2 - Fibonacci 25</h1>
		<ul>
			<%--
				Add a list item (i.e. <li>) for each of the first 25 numbers in the Fibonacci sequence
				
				See exercise2-fibonacci.png for example output
			 --%>
			 
			 
			 <c:set var = "fib1" value = "${0}" />
			 <c:set var = "fib2" value = "${1}" />
			 <c:forEach begin="1" end="25" var="nums">
			  <c:choose>
			   <c:when test="${nums <= 1}">
			   <li class="nums"><c:out value="${nums}"/></li>
			  </c:when>
			  
			  <c:otherwise>
			  <c:set var = "newFib" value = "${fib1 + fib2}" />
			  <c:set var = "fib1" value = "${fib2}" />
	
			  <c:set var = "fib2" value = "${newFib}" />
			  <li class="nums"><c:out value="${fib1 + newFib}"/></li>
			 
			 </c:otherwise>
			 </c:choose>
			  </c:forEach>
		</ul>
	</body>
</html>