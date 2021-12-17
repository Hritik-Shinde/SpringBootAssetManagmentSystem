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
<body style='background-color: #F0F0F0; '>
<jsp:include page="sidebar.jsp"></jsp:include>
	<div class=container style="position: absolute; left: 100px; top: 40px;">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<h3 class="text-center text-primary">Edit Asset</h3>
						<form action="/editAssetDetails" method= "post" >
							<input type="hidden"value="${asset.getAssetId()}" name="assetId">
							<div class="form-group">
								<label> Asset Type</label> <input type="text"
									class="form-control" name="typeOfAsset"value="${asset.getTypeOfAsset()}">
							</div>
							<div class="form-group">
								<label>Number of Asset Avaliable</label> <input type="text"
									class="form-control" name="avaliablecount"value="${asset.getAvaliablecount()}">
							</div>
						
						<div class="form-group">
								<label>Brand*:</label> <input type="text"
									class="form-control" name="assetBrand"value="${asset.getAssetBrand()}">
							</div>
							<div class="form-group">
								 <input type="hidden"
									class="form-control" name="empName"value="${asset.getEmpName()}">
							</div>
							<div class="form-group">
								 <input type="hidden"
									class="form-control" name="empId"value="${asset.getEmpId()}">
							</div>
							<div class="form-group">
								<label>Expire Date of Asset*:</label> <input type="date"
									class="form-control" name="assetDate"value="${asset.getAssetDate()}">
							</div>
							<div class="form-group">
								<label>Product Id*:</label> <input type="text"
									class="form-control" name="productId"value="${asset.getProductId()}">
							</div>
							<div class="form-group">
								<label>Krios Product Id*:</label> <input type="text"
									class="form-control" name="kriosProductId"value="${asset.getKriosProductId()}">
							</div>
					
						
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