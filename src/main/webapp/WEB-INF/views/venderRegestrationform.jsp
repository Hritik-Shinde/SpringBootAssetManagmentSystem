<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
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
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
	

<title>Add Employee</title>
</head>

<body style='background-color: #DCDCDC;'>
<jsp:include page="sidebar.jsp"></jsp:include>
	<div class=container style="position: absolute; left: 220px; top: 20px;">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<h3 class="text-center text-primary">Add Vender</h3>
						<form action="/venderRegister" th:action="@{/register}"
							th:object="${vender}" method="post">
							
							<div class="form-group col">
								<label >Enter First Name Of Vender</label> <input type="text"
									class="form-control" name="empName" th:field="*{venderName}"
									placeholder="name" class="form-control" />
							</div>
							<div class="form-group col">
								<label>Enter Last Name Of vender</label> <input type="text"
									class="form-control" name="venderLastName"
									placeholder="venderLastName"
									th:field="*{empLastName}">
							</div>
							
							
							<div class="form-group col">
								<label>EmailId</label> <input type="text"
									class="form-control"placeholder="Email Id" name="venderemailId" th:field="*{venderemailId}">
							</div>
							<div class="form-group col">
								<label>vender Status</label>
								<input name="venderStatus" type="text" placeholder="Status" th:field="*{venderStatus}" class="form-control" />
							</div>
							
							
							<div class="form-group col">
								<label>Enter Phone Number of vender</label>
								<input name="venderMobileNo" type="number"placeholder="MobileNo" th:field="*{venderMobileNo}" class="form-control" />
							</div>
							
							<div class="form-group col">
								<label>Enter Address  of vender</label> <input
									 name="address" type="text" placeholder="address" th:field="*{address}" class="form-control"/>
							</div>
							
						
							<div class="form-group col">
								<label>Enter country  of vender</label> <input
									 name="country" type="text" placeholder="Country" th:field="*{country}" class="form-control"/>
							</div>
							<div class="form-group col">
								<label>Enter state  of vender</label> <input
									 name="state" type="text" placeholder="state" th:field="*{state}" class="form-control"/>
							</div>
							
							<div class="form-group col">
								<label>Enter city  of vender</label> <input
									 name="city" type="text" placeholder="city" th:field="*{city}" class="form-control"/>
							</div>
						
							<!-- <input type="submit" onclick="check()" value="Login"> -->
							<input type="submit" class="btn btn-success" value="Save">
							<input type="reset" class="btn btn-primary" value="Reset">
						</form>

					</div>
				</div>

			</div>
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