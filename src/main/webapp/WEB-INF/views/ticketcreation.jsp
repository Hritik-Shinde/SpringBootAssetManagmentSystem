<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <title>Bootstrap modal</title>
    <style>
       .modal-header{
         background:#8AC7DB;
        }
        </style>
</head>
<body>
<div class="modal-header">
 <h5 class="modal-title">New ticket</h5>

                    <button type ="button" class="btn-close" data-bs-dismiss="modal" > </button> 

                </div>
                <div class="modal-body"> 
                  <form>
                      <div>
                          <label class="form-label"> Issue raise </label>
                          <input type="text" class="form-control">
                      </div>
                      <div>
                        <label class="form-label"> Assets Name </label>
                        <input type="text" class="form-control">
                    </div>
                    <div>
                      <label class="form-label"> Emplyoee Name </label>
                      <input type="text" class="form-control">
                  </div>
                  <div>
                    <label class="form-label"> Emplyoee ID </label>
                    <input type="text" class="form-control"><br>
                </div>
                <div>
                  <label class="form-label"> Date </label>
                  <input type="date" id="birthday" name="birthday"><br><br>
              </div>
              <button type="button" class="btn btn-primary"  >Send</button>
              <button type="button" class="btn btn-danger" data-bs-dismiss="modal" >Cancel</button>
                      </form>

                </div>
                </div>
                </div>
            </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

   
   
  </body>
</html>