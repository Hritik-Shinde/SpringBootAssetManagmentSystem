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

<body style='background-color: #F0F0F0; '>
	<jsp:include page="sidebar.jsp"></jsp:include>
	<div class=container style="position: absolute; left: 150px; top: 40px;">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<h3 class="text-center text-primary">Add Assets</h3>
						<form action="/assetRegister" th:action="@{/register}"
							th:object="${Asset}" method="post">
							<div class="row">
								<div class="form-group col">
									<label>Enter Name Of Asset</label> <input type="text"
										class="form-control" name="typeOfAsset"
										th:field="*{typeOfAsset}" placeholder="Asset Name"
										class="form-control" />
								</div>
								<div class="form-group col">
									<label>Enter asset brand</label> <input type="text"
										class="form-control" name="assetBrand"
										th:field="*{assetBrand}" placeholder="Brand">
								</div>
							</div>
							<div class="row">
								<div class="form-group col">
									<label>Enter Avaliable stock of asset</label> <input
										type="number" class="form-control" name="avaliablecount"
										th:field="*{avaliablecount}" placeholder="avaliable stock">
								</div>
								<div class="form-group col">
									<label>Expire date of Asset</label> <input
										name="assetexpiredate" type="date"
										th:field="*{assetexpiredate}" class="form-control" />
								</div>
							</div>
							<div class="row">
								<div class="form-group col">
									<label>Enter the Name of Employee</label> <input
										type="text" class="form-control" placeholder="Employee Name" name="empName"
										th:field="*{empName}">
								</div>
								<div class="form-group col">
									<label>Enter Employee ID</label> <input
										name="empId" type="text"
										th:field="*{empId}" placeholder="Employee Id" class="form-control" />
								</div>
							</div>
								<div class="row">
								<div class="form-group col">
									<label>Enter The product Id</label> <input
										type="text" class="form-control" name="productId"
										th:field="*{productId}" placeholder="Product Id">
								</div>
								<div class="form-group col">
									<label>Enter krios Product Id</label> <input
										name="kriosProductId" type="text"
										th:field="*{kriosProductId}"placeholder="Krios Product Id" class="form-control" />
								</div>
							</div>

							<!-- 							<input type="submit" onclick="check()" value="Login"> -->
							<input type="submit" class="btn btn-success" value="Save">
							<input type="reset" class="btn btn-primary" value="Reset">
						</form>

					</div>
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