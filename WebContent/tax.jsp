<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>TaxCalculator</title>
</head>
<body>
<h3>Initial salary: ${salary.initialSalary} </h3>
<table style="width:100%">
  <tr>
    <th><b>""</b></th>
    <th><b>Monthly</b></th>
  </tr>
  <tr>
    <td><b>20% Income Tax on</b></td>
    <td>${salary.partAtBasicTax}</td>
  </tr>
  <tr>
    <td><b>40% Income Tax on</b></td>
    <td>${salary.partAtHigherTax}</td>
  </tr>
  <tr>
    <td><b>45% Income Tax on</b></td>
    <td>${salary.partAtAdditionalTax}</td>
  </tr>
   <tr>
    <td><b>12% NI on</b></td>
    <td>${salary.partNILevel1}</td>
  </tr>
  <tr>
    <td><b>2% NI on</b></td>
    <td>${salary.partNILevel2}</td>
  </tr>
    <tr>
    <td><b>Income Tax Total</b></td>
    <td>${salary.deductionsIncomeTax}</td>
  </tr>
  <tr>
    <td><b>NI Total</b></td>
    <td>${salary.deductionsNI}</td>
  </tr>
  <tr>
    <td><b>NI Total</b></td>
    <td>${salary.salaryAfterTax}</td>
  </tr> 
</table>

</body>
</html>