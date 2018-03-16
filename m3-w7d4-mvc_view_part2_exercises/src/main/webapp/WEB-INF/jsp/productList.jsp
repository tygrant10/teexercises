<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="Product List View" />
<%@ include file="common/header.jspf"%>


<h1 style="font-size: 40px">Toy Department</h1>

<section style="display: block;  vertical-align: top; text-align: center;
">


<c:forEach var="productVar" items="${productList}">

<div style="display: inline-block;
	width: 100%;
	height: 50%;">
<div style="display: inline;
	float: left;
	height: 100%;
	width:30%;">

	<c:url var="productUrl" value="/productDetail">
	
	<c:param name="productId" value="${productVar.productId}" />
</c:url>
<c:url var="imageUrl" value="/img/${productVar.imageName}" />
		<a href="${productUrl}"><img src="${imageUrl}" />
</a>
</div>

<div style="	display: inline;
	padding: 10px;
	width: 65%;
	float: left;
	font-size: 1.4em;">
<strong><c:out value="${productVar.name}" /></strong>
<c:choose>
			<c:when test="${productVar.topSeller}">
			<c:out value="BEST SELLER!" />
			</c:when>
			</c:choose>
</div>

<div style="display: inline;
	padding: 10px;
	width: 65%;
	float: left;
	font-size: 1.4em;">
<c:out value="by ${productVar.manufacturer}" />

</div>

<div style="display: inline;
	padding: 10px;
	width: 65%;
	float: left;
	font-size: 1.4em; color: red">
<c:out value="$ ${productVar.price}" />

</div>

<div style="display: inline;
	padding: 10px;
	width: 65%;
	float: left;
	font-size: 1.4em;">
<strong>Weight</strong>
<c:out value=" ${productVar.weightInLbs} lbs." />
</div>
<div style="display: inline;
	padding: 10px;
	width: 65%;
	float: left;
	font-size: 1.4em; color: blue">
			<c:choose>
			<c:when test="${productVar.remainingStock < 3}">
			<c:out value="Only ${productVar.remainingStock} left" />
			</c:when>
			</c:choose>
		</div>

<div style="display: inline;
	padding-left: 175px;
	width: 30%;
	float: left;
	font-size: 1.4em;">
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
</section>

<%@ include file="common/footer.jspf"%>