<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!-- Janvhi patil -->
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
  background-color: #4682B4;
  overflow-x: hidden;
  transition: 0.5s;
  padding-top: 60px;
}

.sidebar a {
  padding: 8px 8px 8px 32px;
  text-decoration: none;
  font-size: 25px;
  color: #000000;
  display: block;
  transition: 0.3s;
}

.sidebar a:hover {
  color: #f1f1f1;
}

.sidebar .closebtn {
  position: absolute;
  top: 0;
  right: 25px;
  font-size: 36px;
  margin-left: 50px;
}

.openbtn {
  font-size: 20px;
  cursor: pointer;
  background-color: #4682B4;
  color: white;
  padding: 10px 15px;
  border: none;
}

.openbtn:hover {
  background-color: #444;
}

#main {
  transition: margin-left .5s;
  padding: 16px;
}

/* On smaller screens, where height is less than 450px, change the style of the sidenav (less padding and a smaller font size) */
@media screen and (max-height: 450px) {
  .sidebar {padding-top: 15px;}
  .sidebar a {font-size: 18px;}
}
</style>
</head>
<body style='background-color: #F0F0F0;'>


<div id="mySidebar" class="sidebar">
 <!--  <a href="javascript:void(0)" class="closebtn" onclick="closeNav() "><span class="glyphicon glyphicon-remove"></span> -->
  
  </a>
  <a href="/employeeregestrationform">Add Employee</a>
  <a href="/viewEmployee">View Employee</a>
  <a href="/assetRegestrationform">Add Assets</a>
  <a href="/viewTotalAssets">View Assets</a>
   <a href="/venderRegestrationform">Add Vender</a>
  <a href="/viewVender">View venders</a>
  <a href="/viewTicket">Status</a>
</div>

<div id="main">
  <button class="openbtn" onclick="openNav()"><span class="glyphicon glyphicon-th-list"></span>
  </button>  
  
</div>
<!-- <script>
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
 -->

 <script>
function openNav() {
  document.getElementById("mySidebar").style.width = "250px";
   document.getElementById("main").style.marginLeft = "250px"; 
}
</script>
<!-- function closeNav() {
  document.getElementById("mySidebar").style.width = "0";
  document.getElementById("main").style.marginLeft= "0";
}
</script> -->

</body>
</html> 