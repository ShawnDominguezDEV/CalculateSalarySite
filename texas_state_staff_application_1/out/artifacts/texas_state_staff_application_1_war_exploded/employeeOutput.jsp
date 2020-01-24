<%--
  Created by IntelliJ IDEA.
  User: Ya Boi
  Date: 9/20/2019
  Time: 7:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee Salary Output</title>
    <link href="CSS/style.css" rel="stylesheet"/>
</head>
<body>
<!-- Label to display the employees name and yearly salary -->

<!-- Include a button to go to the last page, is form action correct ? -->
<form action="employeeList" method="post">
    <input type="hidden" name="fromPage" value="end">
    <p><span>${myEmployee.firstName}</span>_<span>${myEmployee.lastName}</span>, your yearly salary is
        <span>${myEmployee.yearlySalary}</span></p><br>
    <input type="submit" value="Go to last page">
</form>
</body>
</html>
