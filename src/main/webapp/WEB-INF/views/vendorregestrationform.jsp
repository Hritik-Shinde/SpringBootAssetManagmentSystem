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
		<h2>Vender Registration Form</h2>
		<br>
		<%-- <form action="<%=request.getContextPath()%>/register" method="post"> --%>
		<form action="/venderregister" method="post">
			<table style="with: 80%">
				<tr>
					<th>Vender Name*:</th>
					<td><input type="text" name="venderName" /></td>
				</tr>
				<tr>
					<th>Vender Last Name:*</th>
					<td><input type="text" name="venderLastName" /></td>
				</tr>
				<tr>
					<th>Vender Mobile Number:*</th>
					<td><input type="number" name="venderMobileNo"></td>
				</tr>
				<tr>
					<th>Vender EmailId:*</th>
					<td><input type="text" name="venderemailId" /></td>
				</tr>


				<tr>
					<th>Address:*</th>
					<td><input type="text" name="address" /></td>
				</tr>

				<tr>
					<th>Country:*</th>
					<td><select name="country" id="country">
							<option value="1">Choose option</option>
							<option value="IN">INDIA</option>
							<option value="US">US</option>
							<option value="ZA">South Africa</option>

					</select></td>
				</tr>
				<tr>
					<th>State:*</th>
					<td><input type="text" name="state" /></td>
				</tr>
				<tr>
					<th>City:*</th>
					<td><input type="text" name="city" /></td>
				</tr>
				<tr>
					<th>Status:*</th>
					<td><select name="venderStatus" id="venderStatus">
							<option value="1">Choose option</option>
							<option value="Active">Active</option>
							<option value="Inactive">InActive</option>


					</select></td>
				</tr>
			</table>
			<br>
			<br>
			<button type="submit" class="btn btn-success" name="Save">Save
			</button>
		</form>
	</div>

</body>
</html>