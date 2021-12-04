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
	height: 30%;
	width: 100%;
}
</style>
<body
	style='background-color: red:purple; background-image: url("/images/empRegBackground.jpg")'>
	<jsp:include page="dashboard.jsp"></jsp:include>
	<div align="center">
		<h2>Ticket Creation Form</h2>
		<br>
		<%-- <form action="<%=request.getContextPath()%>/register" method="post"> --%>
		<form action="/ticketregister" method="post">
			<table style="with: 80%">
				<tr>
					<th>Status*:</th>
					<td><input type="text" name="status" /></td>
				</tr>
				<tr>
					<th>Issue :*</th>
					<td><input type="text" name="issueDesc" /></td>
				</tr>
				<tr> 
					<th>ticket Raise Date:*</th>
					<td><input type="date" name="ticketRaiseDate"></td>
				</tr>
				
			</table>
			<br>
			<br>
			<button type="submit" class="btn btn-success" name="Save">Raise ticket
			</button>
		</form>
		<!-- <form action="/">
			<button type="submit "class="btn btn-danger" value="" />View ticket</button>
		</form> -->
	</div>

</body>
</html>