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
	

<title>Home Page</title>
</head>
<body style='background-color: #DCDCDC;'>
<jsp:include page="sidebar.jsp"></jsp:include>
	<div class=container style="position: absolute; left: 100px; top: 40px;">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<h3 class="text-center text-primary">Edit Employee</h3>
						<form action="/editEmpDetails" method= "post" >
							<input type="hidden"value="${emp.getEmpId()}" name="empId">
							<div class="form-group">
								<label>Enter  First Name Of Employee</label> <input type="text"
									class="form-control" name="empName"value="${emp.getEmpName()}">
							</div>
							<div class="form-group">
								<label>Enter Last Name Of Employee</label> <input type="text"
									class="form-control" name="empLastName"value="${emp.getEmpLastName()}">
							</div>
						
							<div class="form-group">
								<label>Enter Email id Of Employee</label> <input type="text"
									class="form-control" name="emailId"value="${emp.getEmailId()}">
							</div>
							<div class="form-group">
								<label>Enter Employee Password</label> <input type="password"
									class="form-control" name="password"value="${emp.getPassword()}">
							</div>
					
							<div class="form-group">
								<label>Enter Phone Number of Employee</label> <input
									type="number" class="form-control" name="mobileNo"value="${emp.getMobileNo()}" >
							</div>
							<div class="form-group">
								<label>Enter Date of Birth of Employee</label> <input
									type="date" class="form-control" name="dateOB"value="${emp.getDateOB()}">
							</div>
							<div class="form-group">
								<label>Enter Address  of Employee</label> <input
									type="text" class="form-control" name="address"value="${emp.getAddress()}">
							</div>
							<div class="form-group">
								<label>Enter  gender  of Employee</label> <input
									type="text" class="form-control" name="gender"value="${emp.getGender()}">
							</div>
							
							<div class="form-group">
								<label>Enter Bloodgroup  of Employee</label> <input
									type="text" class="form-control" name="bloodGroup"value="${emp.getBloodGroup()}">
							</div>
							<div class="form-group">
								<label>Enter depatment of Employee</label> <input
									type="text" class="form-control" name="department"value="${emp.getDepartment()}">
							</div>
							<div class="form-group">
								<label>Enter country  of Employee</label> <input
									type="text" class="form-control" name="country"value="${emp.getCountry()}">
							</div>
							<div class="form-group">
								<label>Enter state  of Employee</label> <input
									type="text" class="form-control" name="state"value="${emp.getState()}">
							</div>
							<div class="form-group">
								<label>Enter city  of Employee</label> <input
									type="text" class="form-control" name="city"value="${emp.getCity()}">
							</div>
							<div class="form-group">
								<label>Enter Role</label> <input
									type="text" class="form-control" name="role" value="${emp.getRole()}">
							</div>
							<div class="form-group">
								<label>Enter joining date  of Employee</label> <input
									type="date" class="form-control" name="joiningDate" value="${emp.getJoiningDate()}">
						</div><br>
						<!--  	<button class="btn btn-dark btn-block">Submit
								Employee Details</button>-->
						<input type="submit" class="btn btn-success" value="Submit">
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