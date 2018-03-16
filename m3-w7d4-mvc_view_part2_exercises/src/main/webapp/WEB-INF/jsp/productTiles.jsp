<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<c:set var="pageTitle" value="Product List View" />

<%@ include file="common/header.jspf"%>
<h1 style="font-size: 40px">Toy Department</h1>

<br>
<c:forEach var="productVar" items="${productList}">

	<div class="productImage">
	
	<c:url var="productUrl" value="/productDetail">
	
	<c:param name="productId" value="${productVar.productId}" />
	
	</c:url>
	<div class="productImage">
		<c:url var="imageUrl" value="/img/${productVar.imageName}" />
		<a href="${productUrl}"><img src="${imageUrl}" />
		</a>
</div>



<br>
		<div class="productName" style="font-size: 20px">
			<strong><c:out value="${productVar.name}" /></strong>
			<c:choose>
			<c:when test="${productVar.topSeller}">
			<c:out value="BEST SELLER!" />
			</c:when>
			</c:choose>
		</div>
<br>
		<div class="productName" style="font-size: 20px">
			<c:out value="by ${productVar.manufacturer}" />
		</div>
	<br>	
		<div class="productName" style="font-size: 20px; color: blue">
			<c:choose>
			<c:when test="${productVar.remainingStock < 3}">
			<c:out value="Only ${productVar.remainingStock} left" />
			</c:when>
			</c:choose>
		</div>

		<div class="productName" style="font-size: 20px; color: red">
			<c:out value="$ ${productVar.price}" />
		</div>
<br>
		<div class="productName" style="font-size: 20px">
		<strong>Weight</strong>
			<c:out value="${productVar.weightInLbs} lbs" />
		</div>
<br>
<div style="float: left; width: 30%; display: inline; position: relative; right: -100px">
		<c:choose>
			<c:when test="${productVar.averageRating >4 }">
				<c:url var="imageUrl" value="/img/5-star.png" />
				<img src="${imageUrl}" width='30%'/>
			</c:when>
			<c:when test="${productVar.averageRating >3 }">
				<c:url var="imageUrl" value="/img/4-star.png" />
				<img src="${imageUrl}" width='30%'/>
			</c:when>
			<c:when test="${v.averageRating >2 }">
				<c:url var="imageUrl" value="/img/3-star.png" />
				<img src="${imageUrl}" width='30%'/>
			</c:when>
			<c:when test="${productVar.averageRating >1 }">
				<c:url var="imageUrl" value="/img/2-star.png" />
				<img src="${imageUrl}" width='30%'/>
			</c:when>
			<c:otherwise>
				<c:url var="imageUrl" value="/img/1-star.png" />
				<img src="${imageUrl}" width='30%'/>
			</c:otherwise>
		</c:choose>
</div>

	</div>
</c:forEach>
<%@ include file="common/footer.jspf"%>