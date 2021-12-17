<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<!-- @SWati Khairnar -->
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


<title>Add Employee</title>
<style type="text/css">

/* Popup container - can be anything you want */
.popup {
	position: relative;
	display: inline-block;
	cursor: pointer;
	-webkit-user-select: none;
	-moz-user-select: none;
	-ms-user-select: none;
	user-select: none;
}

/* The actual popup   #555*/
.popup .popuptext {
	visibility: hidden;
	width: 160px;
	background-color:red;
	color: #fff;
	text-align: center;
	border-radius: 6px;
	padding: 8px 0;
	position: absolute;
	z-index: 1;
	bottom: 125%;
	left: 50%;
	margin-left: -80px;
	
}

/* Popup arrow */
.popup .popuptext::after {
	content: "";
	position: absolute;
	top: 100%;
	left: 50%;
	margin-left: -5px;
	border-width: 5px;
	border-style: solid;
	border-color: #555 transparent transparent transparent;
}

/* Toggle this class - hide and show the popup */
.popup .show {
	visibility: visible;
	-webkit-animation: fadeIn 1s;
	animation: fadeIn 1s;
}

/* Add animation (fade in the popup) */
@
-webkit-keyframes fadeIn {
	from {opacity: 0;
}

to {
	opacity: 1;
}

}
@
keyframes fadeIn {
	from {opacity: 0;
}

to {
	opacity: 1;
}
}
</style>
</head>

<body style='background-color: #F0F0F0; '>
	<jsp:include page="sidebar.jsp"></jsp:include>
	<div class=container
		style="position: absolute; left: 150px; top: 20px;">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<h3 class="text-center text-primary">Add Employee</h3>
						<form action="/register" th:action="@{/register}"
							th:object="${employee}" method="post">
							<div class="row">
								<div class="form-group col">
									<label>Enter First Name Of Employee</label> <input type="text"
										pattern="[A-Za-z]*" class="form-control" name="empName"
										th:field="*{empName}" placeholder="name" class="form-control" />
								</div>
								<div class="form-group col">
									<label>Enter Last Name Of Employee</label> <input type="text"
										pattern="[A-Za-z]*" class="form-control" name="empLastName"
										placeholder="Lastname" th:field="*{empLastName}">
								</div>
								
							</div>
							<div class="row">
								<div class="form-group col">
									<label>EmailId</label> <input type="text" class="form-control"
										name="emailId" placeholder="Enter valid email id"
										th:field="*{emailId}" required />
								</div>
								
								<div class="form-group col">
									<div class="popup" onclick="myFunction()">
										<label>Password</label> <span class="popuptext" id="myPopup">
											Please Enter Write Password should be 8 Character at least
											1no./1 Upper Case/1 Lower Case letter Ex.1998Sw@ti </span> 
											<input name="password"
											type="password" placeholder="EmployeePassword"
											pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
											th:field="*{password}" class="form-control" required />
									</div>
								</div>
								
							</div>
							<script>
									// When the user clicks on div, open the popup
									function myFunction() {
										var popup = document
												.getElementById("myPopup");
										popup.classList.toggle("show");
									}
								</script>
							
							<div class="row">
								<div class="form-group col">
									<label>Enter Phone Number of Employee</label> <input
										name="mobileNo" type="number" placeholder="mobilenumber"
										pattern="[0-9]{10}" th:field="*{mobileNo}"
										class="form-control" required />
								</div>
								<div class="form-group col">
									<label>Enter Name Assets to allocate to Employee</label> <input
										name="assets" type="text" placeholder="AssetName"
										th:field="*{assets}" class="form-control" required />
								</div>
							</div>
							<div class="row">
								<div class="form-group col">
									<label>Enter Date of Birth of Employee</label> <input
										name="dateOB" type="date" th:field="*{dateOB}"
										class="form-control" required />
								</div>
								<div class="form-group col">
									<label>Enter Address of Employee</label> <input name="address"
										type="text" placeholder="Address" th:field="*{address}"
										class="form-control" required />
								</div>
							</div>
							<div class="row">
								<div class="form-group col">

									<label> gender of Employee</label> <select name="gender"
										id="gender" class="form-control"  th:field="*{gender}" required>
										<option value="male">---select here---</option>
										<option value="male">Male</option>
										<option value="femal">Female</option>
										<option value="other">Other</option>
									</select>
								</div>

								<div class="form-group col">
									<label>Enter Blood Group of Employee</label> <select
										name="bloodGroup" id="bloodGroup" class="form-control"
										th:field="*{bloodGroup}" required>
										<option value="1">---select here---</option>
										<option value="A+">A+</option>
										<option value="A-">A-</option>
										<option value="B+">B+</option>
										<option value="B-">B-</option>
										<option value="O+">O+</option>
										<option value="O-">O-</option>
										<option value="AB+">AB+</option>
										<option value="AB-">AB-</option>
									</select>
								</div>
							</div>
							<div class="row">
								<div class="form-group col">
								<div class="form-holder select">
									<label>Enter Department of Employee</label> <select
										name="department" id="department" th:field="*{department}"
										class="form-control" required>
										<option value="male">---select here---</option>
										<option value="java">Java</option>
										<option value="dotnet">DotNet</option>
										<option value="salesforce">SalesForce</option>
										<option value="sap">SAP</option>
										<option value="datascience">DataScience</option>
									</select>
									</div>
								</div>
								<div class="form-group col">
									<label>Enter country of Employee</label> <input name="country"
										type="text" placeholder="country" th:field="*{country}"
										class="form-control" required />
								</div>
							</div>
							<div class="row">
								<div class="form-group col">
									<label>Enter state of Employee</label> <input name="state"
										type="text" placeholder="state" th:field="*{state}"
										class="form-control" required />
								</div>
								<div class="form-group col">
									<label>Enter city of Employee</label> <input name="city"
										type="text" placeholder="City" th:field="*{city}"
										class="form-control" required />
								</div>
							</div>
							<div class="row">
								<div class="form-group col">
									<label>Enter joining date of Employee</label> <input
										name="joiningDate" type="date" th:field="*{joiningDate}"
										class="form-control" required />
								</div>

								<div class="form-group col">
									<label>Role</label> <input type="text" placeholder="role"
										class="form-control" name="role" th:field="*{role}" required />
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