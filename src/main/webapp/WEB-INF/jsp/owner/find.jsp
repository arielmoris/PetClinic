<%@ include file="../include.jsp" %>
<c:url var="actionUrl" value="${page.request.contextPath}/owners" />
<form:form action="${actionUrl}" method="post" modelAttribute="owner">
	<label for="ownerId">Last Name</label> : <form:input path="lastName" />
	<br>
	<input type="submit" value="Find Owner" />	
</form:form>
