<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration</title>
    <link rel="stylesheet" type="text/css" href="register.css">
</head>
<body>
    <div class="container">
        <h2>Registration</h2>
        <form method="post" action="UserRegistration">
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
                    <td><input type="email" name="email" required></td>
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
                        <input type="submit" value="Submit">
                        <input type="reset" value="Reset">
                    </td>
                </tr>
                <tr>
                    <td colspan="2">Already registered? <a href="index.jsp">Login Here</a></td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
