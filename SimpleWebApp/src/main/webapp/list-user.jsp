<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="org.sample.dto.User"%>

<%
    List<User> listUser = (List<User>) request.getAttribute("listUser"); 
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Application</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="list-user.css">
</head>
<body>
	<div class="container" style="font-size: 12px;">
		<h3 class="text-center">List of Users</h3>
		<hr>
		<div class="container text-left">
			<a href="<%=request.getContextPath()%>/UserRegistration"
				class="btn btn-success">Add New User</a>
			<a href="<%=request.getContextPath()%>/loginServlet"
				class="btn btn-success">Log Out</a>
		</div> 
		<br>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>ID</th>
					<th>FirstName</th>
					<th>LastName</th>
					<th>Email</th>
					<th>UserName</th>
					<th>Password</th>
					<th>RegDate</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<% if (listUser != null && !listUser.isEmpty()) { 
                        for (User user : listUser) { %>

				<tr>
					<td><%= user.getId() %></td>
					<td><%= user.getFirstName() %></td>
					<td><%= user.getLastName() %></td>
					<td><%= user.getEmail() %></td>
					<td><%= user.getUsername() %></td>
					<td><%= user.getPassword() %></td>
					<td><%=user.getDate()%></td>
					<td>
						<a href="update.jsp?id=${user.id}" class="btn btn-primary">Update</a>
						<a href="<%=request.getContextPath()%>/DeleteUserServlet?id=<%=user.getId()%>"
							class="btn btn-danger">Delete</a></td>
				</tr>
				<%
				}
				} else {
				%>
				<tr>
					<td colspan="6">No users available</td>
				</tr>
				<% } %>

			</tbody>
		</table>
	</div>
</body>
</html>
