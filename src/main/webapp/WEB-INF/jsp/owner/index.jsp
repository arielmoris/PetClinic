<%@ include file="../include.jsp" %>

<table>
	<thead>
		<tr>
			<td>Id</td>
			<td>Name</td>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="owner" items="${ownerList}">
			<tr>
				<td>${owner.id}</td>
				<td>${owner.firstName} ${owner.lastName}</td>
			</tr>	
		</c:forEach>
	</tbody>
</table>