<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update User Information</title>
    <link rel="stylesheet" type="text/css" href="update.css">
</head>
<body>
    <div class="container">
        <h2>Update Your Information</h2>
        <form method="post" action="UpdateUserServlet">
            <table>
                <tr>
                    <td>First Name:</td>
                    <td><input type="text" name="firstName" required></td>
                </tr>
                <tr>
                    <td>Last Name:</td>
                    <td><input type="text" name="lastName" required></td>
                </tr>
                <tr>
                    <td>Email:</td>
                    <td><input type="text" name="email" required></td>
                </tr>
                <tr>
                    <td>User Name:</td>
                    <td><input type="text" name="userName" required></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="password" required></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Update">
                    </td>
                </tr>
            </table>
        </form>
		<form method="post" action="<%= request.getContextPath()%>/AllUserServlet">
            <center>
                <input type="submit" value="All User List">
            </center>
        </form>
    </div>
</body>
</html>
