<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="Product List View" />

<%@ include file="common/header.jspf"%>

<h1 style="font-size: 40px">Toy Department</h1>

 <table >
        <tr>
        <td></td>
        <c:forEach var="productVar" items="${productList}">
         <td>
         	<c:url var="productUrl" value="/productDetail">
	
	<c:param name="productId" value="${productVar.productId}" />
	</c:url>
        <c:url var="imageUrl" value="/img/${productVar.imageName}" />
        <a href="${productUrl}"><img src="${imageUrl}" style="width: 60%;" />	
        </a>
        </td>
        </c:forEach>
        
        <tr>
            <td></td>
            <c:forEach var="productVar"
                    items="${productList}">
                    <td style="background-color: white; color:red">
                    <c:choose>
			<c:when test="${productVar.topSeller}">
			<c:out value="BEST SELLER!" />
			</c:when>
			</c:choose>
                    </td>
                </c:forEach>
        </tr>
        


 <tr>
            <td>Name</td>
            <c:forEach var="productVar"
                    items="${productList}">
                    <td style="background-color: lightgrey;">
                    <c:out value="${productVar.name}" />
                    </td>
                </c:forEach>
        </tr>
 <tr>
            <td>Rating</td>
            <c:forEach var="productVar"
                    items="${productList}">
                    <td style="background-color: white; text-align: center;"><c:choose>
                        <c:when test="${productVar.averageRating >4 }">
                            <c:url var="imageUrl" value="/img/5-star.png" />
                            <img src="${imageUrl}" style="width: 20%;" />
                        </c:when>
                        <c:when test="${productVar.averageRating >3 }">
                            <c:url var="imageUrl" value="/img/4-star.png" />
                            <img src="${imageUrl}" style="width: 20%;" />
                        </c:when>
                        <c:when test="${productVar.averageRating >2 }">
                            <c:url var="imageUrl" value="/img/3-star.png" />
                            <img src="${imageUrl}" style="width: 20%;" />
                        </c:when>
                        <c:when test="${productVar.averageRating >1 }">
                            <c:url var="imageUrl" value="/img/2-star.png" />
                            <img src="${imageUrl}" style="width: 20%;" />
                        </c:when>
                        <c:otherwise>
                            <c:url var="imageUrl" value="/img/1-star.png" />
                            <img src="${imageUrl}" style="width: 20%;" />
                        </c:otherwise>
                    </c:choose></td>
                </c:forEach>
        </tr>

 <tr>
            <td>Mfr</td>
            <c:forEach var="productVar"
                    items="${productList}">
                    <td style="background-color: lightgrey;">
                    <c:out value="${productVar.manufacturer}" />
                    </td>
                </c:forEach>
        </tr>
        <tr>
                    <td>Price</td>
            <c:forEach var="productVar"
                    items="${productList}">
                    <td style="background-color: white; color: red">
                    <c:out value="${productVar.price}" />
                    </td>
                </c:forEach>
        </tr>
        
         <tr>
                    <td>wt. (in lbs)</td>
            <c:forEach var="productVar"
                    items="${productList}">
                    <td style="background-color: lightgrey;">
                    <c:out value="${productVar.weightInLbs}" />
                    </td>
                </c:forEach>
        </tr>

</table>


<%@ include file="common/footer.jspf"%>