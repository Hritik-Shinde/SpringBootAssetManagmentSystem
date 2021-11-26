<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
		<title>Registration Form</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="author" content="colorlib.com">

		<!-- MATERIAL DESIGN ICONIC FONT -->
		<link rel="stylesheet" href="fonts/material-design-iconic-font/css/material-design-iconic-font.css">

		<!-- STYLE CSS -->
		<link rel="stylesheet" href="css/style.css">
<meta charset="ISO-8859-1">
<title>Employee Registration Form</title>
</head>
<body>
<div class="wrapper">
            <form action="" id="wizard">
        		<!-- SECTION 1 -->
                <h2></h2>
                <section>
                    <div class="inner">
						<div class="image-holder">
							<img src="images/register2.jpg" alt="">
						</div>
						<div class="form-content" >
							<div class="form-header">
								<h3>Employee Registration Form</h3>
							</div>
							<p>Please fill with your details</p>
							<div class="form-row">
								<div class="form-holder">
									<input type="text" placeholder="First Name" class="form-control">
								</div>
								<div class="form-holder">
									<input type="text" placeholder="Middle Name" class="form-control">
								</div>
								<div class="form-holder">
									<input type="text" placeholder="Last Name" class="form-control">
								</div>
							</div>
							<div class="form-row">
								<div class="form-holder">
									<input type="text" placeholder="Your Email" class="form-control">
								</div>
								<div class="form-holder">
									<input type="text" placeholder="Telephone Number" class="form-control">
								</div>
								<div class="form-holder">
									<input type="text" placeholder="Mobile Number" class="form-control">
								</div>
							</div>
							<div class="form-row">
								<div class="form-holder">
									<input type="text" placeholder="Date of Birth" class="form-control">
								</div>
								
								<div class="form-holder" style="align-self: flex-end; transform: translateY(4px);">
									<div class="checkbox-tick">
										<label class="married">
											<input type="radio" name="maritalstatus" value="married" checked> Married<br>
											<span class="checkmark"></span>
										</label>
										<label class="unmarried">
											<input type="radio" name="maritalstatus" value="unmarried"> Unmarried<br>
											<span class="checkmark"></span>
										</label>
									</div>
								</div>
								<div class="form-holder" style="align-self: flex-end; transform: translateY(4px);">
									<div class="checkbox-tick">
										<label class="male">
											<input type="radio" name="gender" value="male" checked> Male<br>
											<span class="checkmark"></span>
										</label>
										<label class="female">
											<input type="radio" name="gender" value="female"> Female<br>
											<span class="checkmark"></span>
										</label>
									</div>
								</div>
							</div>
							
						</div>
					</div>
                </section>

				<!-- SECTION 2 -->
                <h2></h2>
                <section>
                    <div class="inner">
						<div class="image-holder">
							<img src="images/register2.jpg" alt="">
						</div>
						<div class="form-content">
							<div class="form-header">
								<h3>Employee Registration Form</h3>
							</div>
							<p>Please fill with additional info</p>
							<div class="form-row">
								<div class="form-holder w-100">
									<input type="text" placeholder="Address" class="form-control">
								</div>
							</div>
							<p>ID Proof Details</p>
							<div class="form-row">
								<div class="form-holder">
									<input type="text" placeholder="AadharCardNumber" class="form-control">
								</div>
								<div class="form-holder">
									<input type="text" placeholder="PanCardNumber" class="form-control">
								</div>
							</div>

							<div class="form-row">

								<div class="form-holder"></div>
							</div>
						</div>
					</div>
                </section>

               
            </form>
		</div>

		<!-- JQUERY -->
		<script src="js/jquery-3.3.1.min.js"></script>

		<!-- JQUERY STEP -->
		<script src="js/jquery.steps.js"></script>
		<script src="js/main.js"></script>
		<!-- Template created and distributed by Colorlib -->
</body>
</body>
</html>