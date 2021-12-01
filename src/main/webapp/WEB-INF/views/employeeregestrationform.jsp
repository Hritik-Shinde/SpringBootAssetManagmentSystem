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
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<head>
</head>
<style>
	h2{
	 color: white;
	}
	th{
	color:white;
	font size: 40px;
	}
	.form-check{
	 color: white;
	 font-size:20px;
	}
	
	input, select{
	  height:30%;
	  width: 100%;
	  
	}

</style>
<body style='background-color: red:purple; background-image:url("/images/empRegBackground.jpg")'>
	<jsp:include page="dashboard.jsp"></jsp:include>
	<div align="center">
		<h2>Employee Registration Form</h2>
		<br>
		<%-- <form action="<%=request.getContextPath()%>/register" method="post"> --%>
		<form action="/register" method="post">
			<table style="with: 80%">
				<tr>
					<th>Employee First Name*:</th>
					<td><input type="text" name="empName" /></td>
				</tr>
				<tr>
					<th>Employee Last Name:*</th>
					<td><input type="text" name="empLastName" /></td>
				</tr>
				 <tr>
				   <th>Mobile Number:*</th>
				   <td><input type ="number" name="mobileNo"></td>
				  </tr>
				  <tr>
					<th>Employee EmailId:*</th>
					<td><input type="text" name="emailId" /></td>
				</tr>
				<tr>
					<th>Date of Birth:*</th>
					<td><input type="date" name="dateOB" /></td>
				
					
				</tr>
				<tr>
					<th>Place of Birth:*</th>
					<td><input type="text" name="dateOBPlace" /></td>
				</tr>
				<tr>
					<th>Address:*</th>
					<td><input type="text" name="address" /></td>
				</tr>
				<tr>
					<th>Gender:*</th>
					<td>
						<div class="form-check">
						  <input class="form-check-input" type="radio" name="gender" id="flexRadioDefault1" style="height:15px; width:15px;">
						  <label class="form-check-label" for="flexRadioDefault1">
							Male
						  </label>
						</div>
						<div class="form-check">
						  <input class="form-check-input" type="radio" name="gender" id="flexRadioDefault2" checked style="height:15px; width:15px;">
						  <label class="form-check-label" for="flexRadioDefault2">
						   Female
						  </label>
						</div>
					</td>			
				</tr>
				<tr>
					<th>Blood Group:*</th>
					<td>
                     <select name="bloodGroup" id="bloodGroup">
						 <option value="1" >Choose option</option>
						<option value="A+">A+</option>
						<option value="A-">A-</option>
						<option value="B+">B+</option>
						<option value="B-">B-</option>
						<option value="O+">O+</option>
						<option value="O-">O-</option>
						<option value="AB+">AB+</option>
						<option value="AB-">AB-</option>
                     </select>
                    </td>
				
				</tr>
				
				<tr>
					<th>Department:*</th>
					<td>
                     <select name="department" id="department">
						 <option value="1" >Choose option</option>
						 <option value="java">Java</option>
						 <option value="dotnet">DotNet</option>
						 <option value="salesforce">Salesforce</option>
						 <option value="sap">SAP</option>
						 <option value="datascience">DataScience</option>
                     </select>
                    </td>
				
				</tr>
				<tr>
					<th>Country:*</th>
					<td>
					<select name="country" id="country">
					    <option value="1" >Choose option</option>
						<option value="IN">INDIA</option>
						<option value="US">US</option>
						<option value="ZA">South Africa</option>

					</select>
					</td>
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
					<th>Password:*</th>
					<td><input type="password" name="password" /></td>
				</tr>
				
				<tr>
					<th>Employee Joining Date:*</th>
					<td><input type="date" name="joiningDate" /></td>
				</tr>
			</table>
			<br><br>
			<button type="submit" class="btn btn-success"  name="Save" >Save </button>
		</form>
	</div>
	
</body>
</html>