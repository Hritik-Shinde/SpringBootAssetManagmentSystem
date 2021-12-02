<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<link href="font-awesome-4.1.0/css/font-awesome.min.css" rel="stylesheet">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<head>
</head>
<style>
	h2{
	 color:#666699;
	}
	th{
	color:white;
	font size: 40px;
	}
	.form-check{
	 color: black;
	 font-size:20px;
	}
	
	input, select{
	  height:30%;
	  width: 100%;
	  
	}
	#inputdefault {
  margin-bottom: 5px; 
}
</style>
<body style='background-color: red:purple; background-image:url("/images/empRegBackground.jpg")'>
	<jsp:include page="dashboard.jsp"></jsp:include>
	<div align="center">
		<h2> Ticket Status</h2>
		<br>
		<form action="<%=request.getContextPath()%>/register" method="post">
			<table style="with: 80%">
				<tr>
					<th>Employee ID:</th>
					<td><input type="text" id="inputdefault"  name="empId" readOnly="true" /></td>
				</tr>
				<tr>
					<th>Employee Name:<span class="mandatorty"> </span></th>
					<td><input type="text"  id="inputdefault"  name="contact" readOnly="true"/></td>
				</tr>
				<tr>
					<th> Asset Name:<span class="mandatorty"> </span></th>
					<td><input type="text"  id="inputdefault"  name="empmiddleName" readOnly="true"/></td>
				</tr>
			
				<tr>
					<th>Replace Date<span class="mandatorty"> </span></th>
					<td><input type="date"  id="inputdefault"  name="dateOFPlace" readOnly="true"/></td>	
				</tr>
				<tr>
					<th>Status<span class="mandatorty"> </span></th>
					<td><input type="text"  id="inputdefault"  name="contact" readOnly="true"/></td>
				</tr>
			
		</form>
	</div>
	
</body>
</html>