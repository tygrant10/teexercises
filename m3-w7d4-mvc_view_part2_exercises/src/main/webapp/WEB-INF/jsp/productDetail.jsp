<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="Product Detail View" />

<%@ include file="common/header.jspf"%>

<div class='productDetail'>
	
	<div class="productImage">
		<c:url var="imageUrl" value="/img/${product.imageName}" />
			<c:url var="productUrl" value="/productDetail" />
		
		<img src="${imageUrl}" />
	</div>
	
	<div class="rightOfImage">

	<h4><c:out value="${product.name}" />
	
			<c:choose>
			<c:when test="${productVar.topSeller}">
			<c:out value="BEST SELLER!" />
			</c:when>
			</c:choose>
			</h4>
	<c:out value="${product.manufacturer}" />
	<br> 
	<br>
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
		<br>
		
			<c:out value="$ ${product.price}" />

	<br>
			<c:out value="${product.weightInLbs} lbs" />
<br>
<strong>Description: </strong>
	<c:out value="${product.description}" />
</div>



</div>


<%@ include file="common/footer.jspf"%>
