<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<link href="font-awesome-4.1.0/css/font-awesome.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<head>
</head>
<style>
h2 {
	height: 80%;
	color: white;
}

th {
	color: white;
	font size: 40px;
}

.form-check {
	color: white;
	font-size: 20px;
}

input, select {
	height: 80%;
	width: 100%;
}
</style>

<body style='background-color: red:purple; background-image:url("/images/empRegBackground.jpg")'>
<jsp:include page="dashboard.jsp"></jsp:include>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

		<div class="container p-5">
		<table class="table table-striped">
			<thead class="bg-dark text-white">

	
				<tr>
					<th >Ticket Id</th>
					<th >Ticket status</th>
					<th >Issue description: </th>
					<th >ticketRaiseDate</th>
					
					<th> Select </th>
				</tr>
		
			
			<c:forEach items="${ticketList}" var="t">
			
				<tr>
					<th> ${t.ticketId}</th>
					<td> ${v.status}</td>
					<td> ${v.issueDesc}</td>
					<td> ${v.ticketRaiseDate}</td>
				
					<td>
					<a class="btn btn-sm btn-danger" href="/deleteticket/${v.ticketId}">Delete</a>
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