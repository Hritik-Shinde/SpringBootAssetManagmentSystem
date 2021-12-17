
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.com">
<head>
<!-- Required meta tags -->
<meta charset= "utf-8">
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
	

<title>View Assets</title>
<script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
</head>
<style>
#myTable {
  border-collapse: collapse;
  border-spacing: 0;
  width: 70%;
  border: 2px solid black ;
  font-size: 18px;
}

#myTable th, #myTable td{
  text-align: left;
  padding: 8px;
   
 
}
#myTable{
border: 2px solid black;

}
#myTable tr.header, #myTable tr:hover {
  backgr
}
#myInput {
  background-image: url('images/searchicon.png');
  background-position: 10px 10px;
  background-repeat: no-repeat;
  width: 30%;
  font-size: 16px;
  padding: 12px 20px 12px 40px;
  border: 2px solid black;
  margin-bottom: 10px;
  margin-left: 400px;
   float: left;
}



tr:nth-child(even){background-color:white}

</style>

<body style='background-color: #F0F0F0; '>
<jsp:include page="sidebar.jsp"></jsp:include>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for names.." title="Type in a name">


		<div class="container p-5"  style="position: absolute; left: 375px; top: 120px;">
		<table class="table table-striped"  id="myTable" >
			<!--  <thead class="bg-dark text-white">-->

	
				<tr>
					<th >Id</th>
					<th >Asset Name</th>
					<th >Asset Brand</th>
					<th >Avaliable stock</th>
					<th >Employee name</th>
					<th >Emp Id</th>
					<th>Product Id</th>
					<th>Krios Product Id</th>
				
				
					<th>  Select  </th>
					<th>
					</th>
				</tr>
		
			
			<c:forEach items="${assets}" var="e">
			
				<tr>
					<th> ${e.getAssetId()}</th>
					<td> ${e.getTypeOfAsset()} </td>
					<td> ${e.getAssetBrand()} </td>
					<td> ${e.getAvaliablecount()}</td>
					<td> ${e.getEmpName()}</td>
					<td> ${e.getEmpId()}</td>
					<td> ${e.getProductId()}</td>
					<td> ${e.getKriosProductId()}</td>
				
				
					<td>
					<a class="btn btn-sm btn-primary" href="/editasset/${e.assetId}"><i class='fas fa-edit' style='font-size:20px'></i></a></td>
					<td>
					<a class="btn btn-sm btn-danger" href="/deleteasset/${e.assetId}"><i class='fa fa-trash' style='font-size:20px'></i></a>
					</td>
					
				</tr>
				</c:forEach>
				</thead>
				
		</table>
			
</div>

<!-- Search Bar Code -->
<script >
	function myFunction() {
  var input, filter, table, tr, td, i, txtValue,thead;
  input = document.getElementById("myInput");
  filter = input.value.toUpperCase();
  table = document.getElementById("myTable");
  tr = table.getElementsByTagName("tr");
  for (i = 0; i < tr.length; i++) {
    td = tr[i].getElementsByTagName("td")[0];
    if (td) {
      txtValue = td.textContent || td.innerText;
      if (txtValue.toUpperCase().indexOf(filter) > -1) {
        tr[i].style.display = "";
      } else {
        tr[i].style.display = "none";
      }
    }       
  }
}
</script>
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

