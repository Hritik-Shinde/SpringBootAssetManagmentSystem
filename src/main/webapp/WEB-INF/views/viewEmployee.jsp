<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.com">
<head>
<!-- Required meta tags -->
<meta charset= "utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Home Page</title>
</head>
<style>
.th{
	color:white
}
</style>

<body style='background-color: red:purple; background-image:url("/images/empRegBackground.jpg")'>
<jsp:include page="adminDashboard.jsp"></jsp:include>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

		<div class="container p-5">
		<table class="table table-striped">
			<thead class="bg-dark text-white">

	
				<tr>
					<th >Id</th>
					<th >Name</th>
					<!-- <th >last Name</th> -->
					<th >Email Id</th>
					<th >Phone No</th>
					<!-- <th >BloodGroup</th> -->
					<th >department</th>
					<th >password</th>
					<!-- <th >address</th>
					<th >country</th>
					<th >state</th>
					<th >city</th>
					<th >DateOB</th>
					<th >Birthplace</th> -->
					<th >joiningDate</th>
					<th>  Select  </th>
				</tr>
		
			
			<c:forEach items="${empList}" var="e">
			
				<tr>
					<th> ${e.getEmpId()}</th>
					<td> ${e.getEmpName()}</td>
					<%-- <td> ${e.empLastName}</td> --%>
					<td> ${e.emailId}</td>
					<td> ${e.mobileNo}</td>
					<%-- <td> ${e.bloodGroup}</td> --%>
					<td> ${e.department}</td>
					<td> ${e.password}</td>
					<%-- <td> ${e.address}</td>
					<td> ${e.country}</td>
					<td> ${e.state}</td>
					<td> ${e.city}</td>
					<td> ${e.dateOB}</td>
					<td> ${e.dateOBPlace}</td> --%>
					<td> ${e.joiningDate}</td>
				
					<td>
					<a class="btn btn-sm btn-primary" href="/editEmp/${e.empId}">Edit</a>
					<button onclick="myFunction("'${e.empId}'")">Click me</button>
					<a class="btn btn-sm btn-danger" href="/deleteemployee/${e.empId}">Delete</a>
					</td>
					
				</tr>
				</c:forEach>
				</thead>
				
		</table>
			
</div>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>