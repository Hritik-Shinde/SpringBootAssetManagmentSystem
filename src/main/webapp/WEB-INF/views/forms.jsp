<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Bootstrap Material Admin by Bootstrapious.com</title>
<meta name="description" content="">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="robots" content="all,follow">
<!-- Google fonts - Poppins -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Poppins:300,400,700">
<!-- Choices CSS-->
<link rel="stylesheet"
	href="./assets/vendor/choices.js/public/assets/styles/choices.min.css">
<!-- theme stylesheet-->
<link rel="stylesheet" href="./assets/css/style.default.css"
	id="theme-stylesheet">
<!-- Custom stylesheet - for your changes-->
<link rel="stylesheet" href="./assets/css/custom.css">
<!-- Favicon-->
<link rel="shortcut icon" href="./assets/img/favicon.ico">
<!-- Tweaks for older IEs-->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script><![endif]-->
</head>
<body>
	<jsp:include page="index.jsp"></jsp:include>
	<!-- Form Elements -->
	<div class="col-lg-12">
		<div class="card">
			<div class="card-header">
				<div class="card-close">
					<div class="dropdown">
						<button class="dropdown-toggle text-sm" type="button"
							id="closeCard1" data-bs-toggle="dropdown" aria-expanded="false">
							<i class="fas fa-ellipsis-v"></i>
						</button>
						<div class="dropdown-menu dropdown-menu-end shadow-sm"
							aria-labelledby="closeCard1">
							<a class="dropdown-item py-1 px-3 remove" href="#"> <i
								class="fas fa-times"></i>Close
							</a><a class="dropdown-item py-1 px-3 edit" href="#"> <i
								class="fas fa-cog"></i>Edit
							</a>
						</div>
					</div>
				</div>
				<h3 class="h4 mb-0">All form elements</h3>
			</div>
			<div class="card-body">
				<form class="form-horizontal">
					<div class="row">
						<label class="col-sm-3 form-label">Normal</label>
						<div class="col-sm-9">
							<input class="form-control" type="text">
						</div>
					</div>
					<div class="border-bottom my-5 border-gray-200"></div>
					<div class="row">
						<label class="col-sm-3 form-label">Help text</label>
						<div class="col-sm-9">
							<input class="form-control" type="text"><small
								class="form-text">A block of help text that breaks onto
								a new line and may extend beyond one line.</small>
						</div>
					</div>
					<div class="border-bottom my-5 border-gray-200"></div>
					<div class="row">
						<label class="col-sm-3 form-label">Password</label>
						<div class="col-sm-9">
							<input class="form-control" type="password" name="password">
						</div>
					</div>
					<div class="border-bottom my-5 border-gray-200"></div>
					<div class="row">
						<label class="col-sm-3 form-label">Placeholder</label>
						<div class="col-sm-9">
							<input class="form-control" type="text" placeholder="placeholder">
						</div>
					</div>
					<div class="border-bottom my-5 border-gray-200"></div>
					<div class="row">
						<label class="col-sm-3 form-label">Disabled</label>
						<div class="col-sm-9">
							<input class="form-control" type="text" disabled=""
								placeholder="Disabled input here...">
						</div>
					</div>
					<div class="border-bottom my-5 border-gray-200"></div>
					<div class="row">
						<label class="col-sm-3 form-label">Checkboxes &amp; radios
							<br>
						<small class="text-primary">Custom elements</small>
						</label>
						<div class="col-sm-9">
							<div class="form-check">
								<input class="form-check-input" id="defaultCheck0"
									type="checkbox"> <label class="form-check-label"
									for="defaultCheck0">Option one</label>
							</div>
							<div class="form-check">
								<input class="form-check-input" id="defaultCheck1"
									type="checkbox" checked> <label
									class="form-check-label" for="defaultCheck1">Option two
									checked</label>
							</div>
							<div class="form-check">
								<input class="form-check-input" id="defaultCheck2"
									type="checkbox" checked disabled> <label
									class="form-check-label" for="defaultCheck2">Option
									three checked and disabled</label>
							</div>
							<div class="form-check">
								<input class="form-check-input" id="defaultCheck3"
									type="checkbox" disabled> <label
									class="form-check-label" for="defaultCheck3">Option
									four disabled</label>
							</div>
							<div class="form-check">
								<input class="form-check-input" id="defaultRadio0" type="radio"
									name="exampleRadios"> <label class="form-check-label"
									for="defaultRadio0">Option one</label>
							</div>
							<div class="form-check">
								<input class="form-check-input" id="defaultRadio1" type="radio"
									name="exampleRadios" checked> <label
									class="form-check-label" for="defaultRadio1">Option two
									checked</label>
							</div>
							<div class="form-check">
								<input class="form-check-input" id="defaultRadio2" type="radio"
									name="exampleRadios" checked disabled> <label
									class="form-check-label" for="defaultRadio2">Option
									three checked and disabled</label>
							</div>
							<div class="form-check">
								<input class="form-check-input" id="defaultRadio3" type="radio"
									name="exampleRadios" disabled> <label
									class="form-check-label" for="defaultRadio3">Option
									four disabled</label>
							</div>
						</div>
					</div>
					<div class="border-bottom my-5 border-gray-200"></div>
					<div class="row">
						<label class="col-sm-3 form-label">Select</label>
						<div class="col-sm-9">
							<select class="form-select mb-3" name="account">
								<option>option 1</option>
								<option>option 2</option>
								<option>option 3</option>
								<option>option 4</option>
							</select>
						</div>
						<div class="col-sm-9 offset-sm-3">
							<select class="form-select" multiple="">
								<option>option 1</option>
								<option>option 2</option>
								<option>option 3</option>
								<option>option 4</option>
							</select>
						</div>
					</div>
					<div class="border-bottom my-5 border-gray-200"></div>
					<div class="row">
						<label class="col-sm-3 form-label" for="formFile">File
							input</label>
						<div class="col-sm-9">
							<input class="form-control" id="formFile" type="file">
						</div>
					</div>
					<div class="border-bottom my-5 border-gray-200"></div>
					<div class="row">
						<label class="col-sm-3 form-label">Input with success</label>
						<div class="col-sm-9">
							<input class="form-control is-valid" type="text">
							<div class="valid-feedback">Looks good!</div>
						</div>
					</div>
					<div class="border-bottom my-5 border-gray-200"></div>
					<div class="row">
						<label class="col-sm-3 form-label">Input with error</label>
						<div class="col-sm-9">
							<input class="form-control is-invalid" type="text">
							<div class="invalid-feedback">Please provide your name.</div>
						</div>
					</div>
					<div class="border-bottom my-5 border-gray-200"></div>
					<div class="row">
						<label class="col-sm-3 form-label">Control sizing</label>
						<div class="col-sm-9">
							<input class="form-control form-control-lg mb-3" type="text"
								placeholder=".input-lg"> <input
								class="form-control mb-3" type="text"
								placeholder="Default input"> <input
								class="form-control form-control-sm mb-3" type="text"
								placeholder=".input-sm">
						</div>
					</div>
					<div class="border-bottom my-5 border-gray-200"></div>
					<div class="row">
						<label class="col-sm-3 form-label">Column sizing</label>
						<div class="col-sm-9">
							<div class="row">
								<div class="col-md-3">
									<input class="form-control" type="text" placeholder=".col-md-3">
								</div>
								<div class="col-md-4">
									<input class="form-control" type="text" placeholder=".col-md-4">
								</div>
								<div class="col-md-5">
									<input class="form-control" type="text" placeholder=".col-md-5">
								</div>
							</div>
						</div>
					</div>
					<div class="border-bottom my-5 border-gray-200"></div>
					<div class="row">
						<label class="col-sm-3 form-label">Material Inputs</label>
						<div class="col-sm-9">
							<div class="input-material-group mb-3">
								<input class="input-material" id="register-username" type="text"
									name="registerUsername" required value="Jason Doe"> <label
									class="label-material" for="register-username">Username</label>
							</div>
							<div class="input-material-group mb-3">
								<input class="input-material" id="register-email" type="email"
									name="registerEmail" required> <label
									class="label-material" for="register-email">Email
									Address </label>
							</div>
							<div class="input-material-group mb-3">
								<input class="input-material" id="register-password"
									type="password" name="registerPassword" required> <label
									class="label-material" for="register-password">Password
								</label>
							</div>
						</div>
					</div>
					<div class="border-bottom my-5 border-gray-200"></div>
					<div class="row">
						<label class="col-sm-3 form-label">Input groups</label>
						<div class="col-sm-9">
							<div class="input-group mb-3">
								<span class="input-group-text" id="basic-addon1">@</span> <input
									class="form-control" type="text" placeholder="Username"
									aria-label="Username" aria-describedby="basic-addon1">
							</div>
							<div class="input-group mb-3">
								<input class="form-control" type="text" placeholder="Username"
									aria-label="Username" aria-describedby="basic-addon2"><span
									class="input-group-text" id="basic-addon2">@</span>
							</div>
							<div class="input-group mb-3">
								<div class="input-group-text">
									<input class="form-check-input mt-0" type="checkbox"
										aria-label="Checkbox for following text input">
								</div>
								<input class="form-control" type="text"
									aria-label="Text input with checkbox">
							</div>
							<div class="input-group mb-3">
								<input class="form-control" type="text"
									aria-label="Text input with radio button">
								<div class="input-group-text">
									<input class="form-check-input mt-0" type="radio"
										aria-label="Radio button for following text input">
								</div>
							</div>
							<div class="input-group mb-3">
								<span class="input-group-text">$</span><span
									class="input-group-text">0.00</span> <input
									class="form-control" type="text"
									aria-label="Dollar amount (with dot and two decimal places)">
							</div>
							<div class="input-group">
								<input class="form-control" type="text"
									aria-label="Dollar amount (with dot and two decimal places)"><span
									class="input-group-text">$</span><span class="input-group-text">0.00</span>
							</div>
						</div>
					</div>
					<div class="border-bottom my-5 border-gray-200"></div>
					<div class="row">
						<label class="col-sm-3 form-label">Button addons</label>
						<div class="col-sm-9">
							<div class="input-group mb-3">
								<button class="btn btn-primary" id="button-addon1" type="button">Button</button>
								<input class="form-control" type="text" placeholder
									aria-label="Example text with button addon"
									aria-describedby="button-addon1">
							</div>
							<div class="input-group">
								<input class="form-control" type="text"
									placeholder="Recipient's username"
									aria-label="Recipient's username"
									aria-describedby="button-addon2">
								<button class="btn btn-primary" id="button-addon2" type="button">Button</button>
							</div>
						</div>
					</div>
					<div class="border-bottom my-5 border-gray-200"></div>
					<div class="row">
						<label class="col-sm-3 form-label">With dropdowns</label>
						<div class="col-sm-9">
							<div class="input-group">
								<button class="btn btn-outline-secondary dropdown-toggle"
									type="button" data-bs-toggle="dropdown" aria-expanded="false">Dropdown</button>
								<ul class="dropdown-menu shadow-sm">
									<li><a class="dropdown-item" href="#">Action</a></li>
									<li><a class="dropdown-item" href="#">Another action</a></li>
									<li><a class="dropdown-item" href="#">Something else
											here</a></li>
									<li><a class="dropdown-item" href="#">Separated link</a></li>
								</ul>
								<input class="form-control" type="text"
									aria-label="Text input with dropdown button">
							</div>
						</div>
					</div>
					<div class="border-bottom my-5 border-gray-200"></div>
					<div class="row">
						<div class="col-sm-9 ms-auto">
							<button class="btn btn-secondary" type="reset">Cancel</button>
							<button class="btn btn-primary" type="submit">Save
								changes</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
	<!-- JavaScript files-->
	<script src="./assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
	<script src="./assets/vendor/chart.js/Chart.min.js"></script>
	<script src="./assets/vendor/just-validate/js/just-validate.min.js"></script>
	<script
		src="./assets/vendor/choices.js/public/assets/scripts/choices.min.js"></script>
	<!-- Main File-->
	<script src="./assets/js/front.js"></script>
	<script>
		// ------------------------------------------------------- //
		//   Inject SVG Sprite - 
		//   see more here 
		//   https://css-tricks.com/ajaxing-svg-sprite/
		// ------------------------------------------------------ //
		function injectSvgSprite(path) {

			var ajax = new XMLHttpRequest();
			ajax.open("GET", path, true);
			ajax.send();
			ajax.onload = function(e) {
				var div = document.createElement("div");
				div.className = 'd-none';
				div.innerHTML = ajax.responseText;
				document.body.insertBefore(div, document.body.childNodes[0]);
			}
		}
		// this is set to BootstrapTemple website as you cannot 
		// inject local SVG sprite (using only 'icons/orion-svg-sprite.svg' path)
		// while using file:// protocol
		// pls don't forget to change to your domain :)
		injectSvgSprite('https://bootstraptemple.com/files/icons/orion-svg-sprite.svg');
	</script>
	<!-- FontAwesome CSS - loading as last, so it doesn't block rendering-->
	<link rel="stylesheet"
		href="https://use.fontawesome.com/releases/v5.7.1/css/all.css"
		integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr"
		crossorigin="anonymous">
</body>
</html>