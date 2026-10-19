<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Student Registration</title>
</head>

<body>

<h2>Student Registration - JSP</h2>

<form method="post">

    Student Name:
    <input type="text" name="name" required>
    <br><br>

    Register Number:
    <input type="text" name="regno" required>
    <br><br>

    Department:
    <input type="text" name="department" required>
    <br><br>

    Year:
    <select name="year">
        <option value="1st Year">1st Year</option>
        <option value="2nd Year">2nd Year</option>
        <option value="3rd Year">3rd Year</option>
        <option value="4th Year">4th Year</option>
    </select>

    <br><br>

    <input type="submit" value="Register">

</form>

<%
String name = request.getParameter("name");

if (name != null) {

    String regno = request.getParameter("regno");
    String department = request.getParameter("department");
    String year = request.getParameter("year");
%>

<hr>

<h2>Registered Student Details</h2>

<table border="1" cellpadding="10">

<tr>
    <th>Student Name</th>
    <td><%= name %></td>
</tr>

<tr>
    <th>Register Number</th>
    <td><%= regno %></td>
</tr>

<tr>
    <th>Department</th>
    <td><%= department %></td>
</tr>

<tr>
    <th>Year</th>
    <td><%= year %></td>
</tr>

</table>

<%
}
%>

</body>
</html>