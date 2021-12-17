<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.com">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>


<title>View Assets</title>

</head>
<style>
.card {
	box-shadow: 0 8px 12px;
	transition: 0.3s;
	width: 30%;
	height: 40%;
	border-radius: 5px;
	background-color: #4682B4;
}

.card:hover {
	box-shadow: 0 10px 20px;
	background-color: #4682B4;
}

.container {
	padding: 25px 40px;
}

.a {
	font-size: 25px;
	background-color: #444;
}
</style>
<body style='background-color: #F0F0F0;'>
	<jsp:include page="sidebar.jsp"></jsp:include>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<div style="position: absolute; left: 375px; top: 200px;">


		<div class="row">
			<!-- <div class="col-sm-5"></div> -->
			<div class="card">

				<div class="container">

					<h4>
						<b>View Allocated Assets </b>
					</h4>
					<br> <b><a href="/viewAsset"> view Asset</a></b>
				</div>
				
			</div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;


			<div class="card">
				<div class="col-sm-5">
					<div class="container">
						<h4>
							<b>View All Assets </b>
						</h4>
						<br> <b><a href="/viewAsset"> view Asset</a></b>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>