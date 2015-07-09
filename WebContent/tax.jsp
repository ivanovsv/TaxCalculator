<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
table {
    width:100%;
}
table, th, td {
    border: 1px solid black;
    border-collapse: collapse; 

}
th, td {
    padding: 5px;
    text-align: left;
}
table tr:nth-child(even) {
    background-color: #eee;
}
table tr:nth-child(odd) {
   background-color:#fff;
}
table th	{
    background-color: #4C4C4C;
    color: white;
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>TaxCalculator</title>
</head>
<body>
<h3>Initial salary: ${salary} </h3>
<table style="width:50%">
  <tr>
    <th><b>Taxes</b></th>
    <th><b>Monthly</b></th>
  </tr>
  <tr>
    <td><b>NI Contributions</b></td>
    <td>${contributionsNI}</td>
  </tr>
  <tr>
    <td><b>Income Tax</b></td>
    <td>${incomeTax}</td>
  </tr>
  <tr>
    <td><b>Salary After Taxes</b></td>
    <td>${salaryAfterTax}</td>
  </tr>
</table>

</body>
</html>