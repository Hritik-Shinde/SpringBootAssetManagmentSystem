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

<title>Add Employee</title>
<style>
@charset "ISO-8859-1";

/*login page */

.login-body{
	background: #80808026;
}
.login-container{
	background: white;
	width:425px;
}
.login {
	font-size: xxx-large;
	font-weight: 700;
	margin: 0px 0px 20px 134px;
	
}

.login-form{
	border: 3px solid gray;
    border-radius: 8px;
    
}
.form{
	padding: 50px;		
}
/*dashbord-container*/
.dashbord-container{
	height: 350px;
	
}

.card{
	/*height: 350px;*/
	overflow: auto;
}

.row{
	/*height: 20px;*/
}

</style>
</head>
<body
	style='background-color: red:purple; background-image: url("/images/empRegBackground.jpg")'>
	<jsp:include page="adminDashboard.jsp"></jsp:include>

	<div class="container">
		<div class="card">
			<div class="card-body">
				<h4 class="card-title text-center text-primary pb-3">Employee
					Registration Form</h4>
				<div class="row">
					<div class="col-sm-5">
						<div class="row">
							<div class="col-sm-3">
								<label for="inputPassword6" class="col-form-label">First
									Name : </label>
							</div>
							<div class="col-sm-9">
								<input type="password" id="inputPassword6" class="form-control"
									aria-describedby="passwordHelpInline">
							</div>
						</div>

					</div>
					<div class="col-sm-1"></div>
					<div class="col-sm-5">
						<div class="row">
							<div class="col-sm-3">
								<label for="inputPassword6" class="col-form-label">Last
									Name : </label>
							</div>
							<div class="col-sm-9">
								<input type="password" id="inputPassword6" class="form-control"
									aria-describedby="passwordHelpInline">
							</div>
						</div>

					</div>
				</div>
				<br>
				<div class="row">
					<div class="col-sm-5">
						<div class="row">
							<div class="col-sm-3">
								<label for="inputPassword6" class="col-form-label">Mobile
									: </label>
							</div>
							<div class="col-sm-9">
								<input type="password" id="inputPassword6" class="form-control"
									aria-describedby="passwordHelpInline">
							</div>
						</div>

					</div>
					<div class="col-sm-1"></div>
					<div class="col-sm-5">
						<div class="row">
							<div class="col-sm-3">
								<label for="inputPassword6" class="col-form-label">Email
									: </label>
							</div>
							<div class="col-sm-9">
								<input type="password" id="inputPassword6" class="form-control"
									aria-describedby="passwordHelpInline">
							</div>
						</div>

					</div>
				</div>
				<br>
				<div class="row">
					<div class="col-sm-5">
						<div class="row">
							<div class="col-sm-3">
								<label for="inputPassword6" class="col-form-label"> DOB
								</label>
							</div>
							<div class="col-sm-9">
								<input type="password" id="inputPassword6" class="form-control"
									aria-describedby="passwordHelpInline">
							</div>
						</div>

					</div>
					<div class="col-sm-1"></div>
					<div class="col-sm-5">
						<div class="row">
							<div class="col-sm-3">
								<label for="inputPassword6" class="col-form-label">birth
									place : </label>
							</div>
							<div class="col-sm-9">
								<input type="password" id="inputPassword6" class="form-control"
									aria-describedby="passwordHelpInline">
							</div>
						</div>

					</div>
				</div>
				<div class="row ">
					<div class="col-sm-4">address</div>
					<div class="col-sm-4">state</div>
					<div class="col-sm-4">city</div>
				</div>
				<div class="row">
					<div class="col-sm-2">1</div>
					<div class="col-sm-2">2</div>
					<div class="col-sm-2">3</div>
					<div class="col-sm-2">4</div>
					<div class="col-sm-2">5</div>
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