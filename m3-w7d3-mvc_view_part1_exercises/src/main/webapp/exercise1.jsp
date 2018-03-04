<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 1 - FizzBuzz</title>
		<style>
			li {
				list-style-type: none;
			}
			
			.fizz {
				color: blue;
			}
			
			.buzz {
				color: red;
			}
			
			.fizzbuzz {
				color: purple;
				font-size: 150%;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 1 - FizzBuzz</h1>
		<ul>
		
			<%--
				Add a list item (i.e. <li>) containing each of the numbers from 1 to 100.
				
				if the number is divisible by 3, show "Fizz!" instead and style the item using the "fizz" class
				
				if the number is divisible by 5, show "Buzz!" instead and style the item using the "buzz" class
				
				if the number is divisible by both 3 and 5, show "FizzBuzz!" instead  and style the item using the "fizzbuzz" class
				
				see exercise1-fizzbuzz.png for example output
			 --%>
			 
			 <c:forEach begin="1" end="100" var="nums">
			 <c:set var="rowClassAttribute" value=""/> 
			 <c:choose>
			 <c:when test="${nums % 3 == 0 && nums % 5 == 0 }">
			 <li class="fizzbuzz"><c:out value="FizzBuzz!"/></li>
			</c:when>
			 <c:when test="${nums % 3 == 0}">
			  <li class="fizz"><c:out value="Fizz!"/></li>
			  </c:when>
			   <c:when test="${nums % 5 == 0}">
			  <li class="buzz"><c:out value="Buzz!"/></li>
			  </c:when>
			  
			  <c:otherwise>
			  <li class="nums"><c:out value="${nums}"/></li>
			  </c:otherwise>
			  </c:choose>
			  </c:forEach>
			
		</ul>
		
	</body>
</html>