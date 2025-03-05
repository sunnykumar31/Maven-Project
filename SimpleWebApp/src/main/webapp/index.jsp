<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="index.css">
        <title>JSP Example</title>
    </head>
    <body bgcolor="silver">
    	<div class="container">
        <h2>Login</h2>
        <form method="post" action="<%= request.getContextPath() %>/loginServlet">
            <label for="userId">User ID:</label>
            <input type="text" id="userId" name="userName" required><br><br>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required><br><br>
            <button type="submit" >Login</button>
            <button type="reset" value="Reset">Reset</button>
        </form>
        <a href="register.jsp">Register Yourself</a><br>
        <form method="post" action="<%= request.getContextPath()%>/AllUserServlet">
            <center>
                <input type="submit" value="All User List" id="allServlet">
            </center>
        </form>
    </div>
</html>