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
<body
	style='background-color: red:purple; background-image: url("/images/empRegBackground.jpg")'>
	<jsp:include page="dashboard.jsp"></jsp:include>
	<div align="center">
		<h2>Add Asset</h2>
		<br>
		<%-- <form action="<%=request.getContextPath()%>/register" method="post"> --%>
		<form action="/assetregister" method="post">
			<table style="with: 80%">
				
				
				

				<tr>
					<th>Asset Type:*</th>
					<td><select name="typeOfAsset" id="typeOfAsset">
							<option value="1">Choose option</option>
							<option value="Laptop">Laptop</option>
							<option value="Mouse">Mouse</option>
							<option value="Keyboard">Keyboard</option>
							<option value="HeadPhone">Headphone</option>
							<option value="Charger">Charger</option>

					</select></td>
				</tr>
				
					<tr>
					<th>Number of Asset Avaliable *:</th>
					<td><input type="number" name="avaliablecount" /></td>
				</tr>
				
				<tr>
					<th>Asset Brand :*</th>
					<td><select name="assetBrand" id="assetBrand">
							<option value="1">Choose option</option>
							<option value="MackBook">MacBook</option>
							<option value="Dell">Dell</option>
							<option value="lenovo">lenovo</option>
							<option value="Hp">Hp</option>
							<option value="Asus">Asus</option>
							
					</select></td>
				</tr>
				
					<tr>
					<th>Expire Date of Asset*:</th>
					<td><input type="date" name="assetDate" /></td>
				</tr>
			</table>
			<br>
			<br>
			<button type="submit" class="btn btn-success" name="Save">Save
			</button>
		</form>
		<form action="/viewassetform">
			<button type="submit "class="btn btn-danger" value="viewassetform" />View asset</button>
		</form>
	</div>

</body>
</html>