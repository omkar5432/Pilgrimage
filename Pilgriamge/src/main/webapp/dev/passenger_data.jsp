<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<center>
<h2>Schedule Data</h2>
<table border="1px">
<tr>
<th>ID</th>
<th>Name</th>
<th>Email</th>
<th>Date</th>
<th>Family Member</th>
<th>Destination</th>
<th>Edit</th>
</tr>

<c:forEach var="a" items="${r}">
<tr>
<td>${a.id}</td>
<td>${a.name}</td>
<td>${a.email}</td>
<td>${a.date}</td>
<td>${a.number}</td>
<td>${a.destination}</td>
<td>
<a href="del?id=${a.id}">DELETE</a>
<a href="edit?id=${a.id}">EDIT</a>
</td>
</tr>
</c:forEach>

</table>
</center>
	