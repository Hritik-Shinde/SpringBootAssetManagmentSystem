<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="Index.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
    <title>Employee Registration</title>
    
</head>
<body>
    <nav class="navbar navbar-light bg-light">
        <div class="container-fluid">
          <a class="navbar-brand" href="#" >
            <img src="images/kriosLogo.jpg" alt="" width="50" height="50" class="d-inline-block align-text-middle">
          Employee Registration 
        </a>
          
        </div>
      </nav>
    <form>
        <div class="row cus_margin">
            <div class="col-2"> 
                <h5> Enter full name*</h5>
             </div>
          <div class="col">
            <input type="text" class="form-control" placeholder="First name">
          </div>
          <div class="col">
            <input type="text" class="form-control" placeholder="Middle name">
          </div>
          <div class="col">
            <input type="text" class="form-control" placeholder="Last name">
          </div>
        </div>
        <div class="row cus_margin">
            <div class="col-2">   
               <h5> Enter DOB and Place*</h5>
            </div>
            <div class="row form-row">
              <label for="date" class="col-sm-1 col-form-label"></label>    
              <div class="col-sm-9">
                <div class="input-group date" id="datetimepicker">
                  <input type="text" class="form-control">
                  <span class="input-group-append"> 
                      <span class="input-group-text bg-light d-block">
                        <i class="fa fa-calendar"></i>
                      </span>
                  </span>
              </div>
            </div>
            </div>
            <div class="col-2"> 
                <input type="text" class="form-control" placeholder="Place">
            </div>
        </div>
        <div class="row cus_margin">
            <div class="col-2   "> 
               <h5>Personal Details</h5>
            </div>
            <div class="col-3"> 
                <input type="text" class="form-control" placeholder="Mobile No.">
            </div>
            <div class="col-3"> 
              <input type="text" class="form-control" placeholder="Phone No.">
          </div>
            <!-- <div class="col"> 
                <input type="text" class="form-control" placeholder="Marital Status">
            </div> -->
            <div class="col-3"> 
                <input type="text" class="form-control" placeholder="Email ID">
            </div>
        </div>
        <div class="row cus_margin">
            <div class="col-2"> 
               <h5> Address *</h5>
            </div>
            <div class="col-4 "> 
                <input type="text" class="form-control" placeholder="Street, Appartment, Area">
            </div>
            </div>
        <div class="row cus_margin">
            <div class="col-2"> 
               <h5> Blood group *</h5>
            </div>
            <div class="col-2"> 
                <input type="text" class="form-control" placeholder="">
                </div>
            </div>
            <div class="row cus_margin">
                <div class="col-2"> 
                   <h5> Enter Password </h5>
                </div>
                <div class="col-2"> 
                    <input type="text" class="form-control" placeholder="Should contain special characters">
                    </div>
                </div>
                <div class="row cus_margin">
                    <div class="col-2"> 
                       <h5> Department* </h5>
                    </div>
                    <div class="dropdown">
                        <button class="btn btn-info dropdown-toggle btn-md" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                          Select
                        </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                          <a class="dropdown-item" href="#">Java</a>
                          <a class="dropdown-item" href="#">Dot Net</a>
                          <a class="dropdown-item" href="#">SAP</a>
                          <a class="dropdown-item" href="#">Data Science</a>
						   <a class="dropdown-item" href="#">Salesforce</a>
                        </div>
                      </div>
                      </div>
                      <div class="row cus_margin"> 
                        <div class="col-2"> 
                    <h5> Gender *</h5></div>
                    <div class="form-check margin_rght">
                      <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1">
                      <label class="form-check-label" for="flexRadioDefault1">
                        Male
                      </label>
                    </div>
                    <div class="form-check">
                      <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault2" checked>
                      <label class="form-check-label" for="flexRadioDefault2">
                        Female
                      </label>
                    </div>
                </div>
            </div>
            <div class="row cus_margin"> 
              <div class="col-2"> 
          <h5> Marital Status* </h5></div>
          <div class="form-check margin_rght">
            <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1">
            <label class="form-check-label" for="flexRadioDefault1">
              Married
            </label>
          </div>
          <div class="form-check">
            <input class="form-check-input " type="radio" name="flexRadioDefault" id="flexRadioDefault2" checked>
            <label class="form-check-label " for="flexRadioDefault2">
              Unmarried
            </label>
          </div>
      </div>
  </div>
            <div class="row cus_margin">
                <div class="col-2"> 
                   <h5> Select Country </h5>
                </div>
                <div class="dropdown">
                    <button class="btn btn-info dropdown-toggle btn-md" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                      Select
                    </button>
                    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                      <a class="dropdown-item" href="#">India</a>
                      <a class="dropdown-item" href="#">Australia</a>
                      <a class="dropdown-item" href="#">Germany</a>
                      <a class="dropdown-item" href="#">Brazil</a>
                    </div>
                  </div>
                  </div>
                  <div class="row cus_margin"> 
                    <div class="col-2"> 
                <h5> State and City</h5></div>
                <div class="col-2"> 
                    <input type="text" class="form-control" placeholder="State">
                    </div>
                    <div class="col-2"> 
                        <input type="text" class="form-control" placeholder="City">
                        </div>
            </div>
			<div class = "col">
			<button position="center">Submit</button>
			</div>
      		  </div>                                          
      </form>
      <script type="text/javascript">
        $(function() {
            $('#datetimepicker').datepicker();
        });
    
        </script>
</body>
</html>