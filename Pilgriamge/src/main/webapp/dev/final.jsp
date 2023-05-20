<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<center>
<h2>Table Data</h2>
<table border="1px">
<tr>
<th>ID</th>
<th>Name</th>
<th>Email</th>
<th>Number</th>
</tr>

<c:forEach var="a" items="${r}">
<tr>
<td>${a.id}</td>
<td>${a.name}</td>
<td>${a.email}</td>
<td>${a.number}</td>
</tr>
</c:forEach>

</table>
</center>
	