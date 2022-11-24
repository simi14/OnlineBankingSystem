<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="city_list" value="${sessionScope.city_list}"></c:set>
<c:set var="length" value="${f:length(city_list)}"></c:set>
[
	<c:forEach var="i" items="${city_list}" varStatus="j">
	{
	"cityid":"${i.city_id}",
	"cityname":"${i.city_name}"
	}
	<c:if test="${j.count ne length }">,</c:if>
	</c:forEach>
]