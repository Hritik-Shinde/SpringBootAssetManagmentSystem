<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
	<meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
	
<style>
body {
	font-family: "Lato", sans-serif;
}

.sidebar {
	height: 100%;
	width: 0;
	position: fixed;
	z-index: 1;
	top: 0;
	left: 0;
	background-color: #4682B4; # B0E0E6;
	overflow-x: hidden;
	transition: 0.5s;
}

.sidebar a {
	padding: 8px 8px 8px 32px;
	text-decoration: none;
	font-size: 25px;
	color: #000000;
	display: block;
	transition: 0.3s;
	font-family: "Times New Roman", Times, serif;
}

.sidebar a:hover {
	color: #f1f1f1;
}

.sidebar .closebtn {
	position: absolute;
	top: 0;
	right: 25px;
	font-size: 36px;
	margin-left: 300px;
}

.openbtn {
	font-size: 20px;
	cursor: pointer;
	background-color: #AAB7B8;
	color: white;
	padding: 10px 15px;
	border: none;
}

.openbtn:hover {
	background-color: #AAB7B8;
}

#main {
	transition: margin-left .5s;
	padding: 16px;
}

/* On smaller screens, where height is less than 450px, change the style of the sidenav (less padding and a smaller font size) */
@media screen and (max-height: 450px) {
	.sidebar {
		padding-top: t5px;
	}
	.sidebar a {
		font-size: 18px;
	}
}

.header {
	overflow: hidden;
	background-color: #4682B4;
	padding: 20px 10px;
}

.header a {
	float: left;
	color: black;
	text-align: center;
	padding: 12px;
	text-decoration: none;
	font-size: 30px;
	line-height: 25px;
	border-radius: 4px;
}

@media screen and (max-width: 500px) {
	.header a.logo {
		font-size: 25px;
		font-weight: bold;
		background-color: black;
		color: red;
		float: none;
		display: #000000;
		text-align: left;
	}
}
}
</style>
</head>

<body
	style='background-color: #F0F0F0; '>
<div id="mySidebar" class="sidebar">
<a href="#default" class="logo"><img src="images/logo.jpg"
			width="100" height="40"> Krios </a><br><br>

 
  <a href="/viewEmpAssets">View Asset</a>
  <a href="/raiseTicket">Raise ticket</a>
 
</div>

<div id="main">
  <button class="openbtn" onclick="openNav()"><span class="glyphicon glyphicon-th-list"></span>
  </button>  
  
</div>

<script>
function openNav() {
	if(document.getElementById("mySidebar").style.width == "250px")
		{
		document.getElementById("mySidebar").style.width = "0";
		  document.getElementById("main").style.marginLeft= "0";
		}
	else{
		document.getElementById("mySidebar").style.width = "250px";
		  document.getElementById("main").style.marginLeft = "250px";
	}
  
}

</script>
   
</body>
</html> 