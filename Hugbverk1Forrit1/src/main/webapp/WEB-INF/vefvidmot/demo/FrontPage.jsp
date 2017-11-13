<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
	<title>Icelandic for Beginners</title>
	<meta charset="UTF-8">
	<meta name="description" content="Learn Icelandic for Beginners">
	<meta name="keywords"
		content="Icelandic, Beginners' Icelandic, Learn Icelandic">
	<meta name="author" content="Arnór Kristmundsson">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<style type="text/css">
/* global style */
        html {
        	box-sizing: border-box;
        	-ms-text-size-adjust: 100%;
        	-webkit-text-size-adjust: 100% height: 100%;
        	height: 100%;
        	overflow-x: hidden;
        }

        *, *:before, *:after {
        	box-sizing: inherit
        }

        body {
        	height: 100%;
        	margin: 0;
        }

        hr {
        	box-sizing: content-box;
        	height: 0;
        	overflow: visible
        }

        /* containers */
        div.display-container {
        	position: relative;
        }

        div.display-middle {
        	text-align: center;
        	position: absolute;
        	top: 50%;
        	left: 50%;
        	transform: translate(-50%, -50%);
        	-ms-transform: translate(-50%, -50%);
        }

        /* fonts */
        * {
        	font-family: Verdana, sans-serif;
        	font-size: 15px;
        	line-height: 1.5;
        }

        h1, h2 {
        	font-weight: 400;
        	margin: 10px 0;
        }

        h1 {
        	font-size: 52px;
        }

        label {
            font-weight: bold;
        }

        .text-white {
        	color: #fff !important;
        }

        /* buttons */

        /* Set a style for all buttons */
        button, .button {
            color: white;
            margin: 8px 0;
            border: none;
            cursor: pointer;
        }

        /* Set a style for all buttons */
        button, .button {
        	border: none;
        	display: inline-block;
        	outline: 0;
        	vertical-align: middle;
        	overflow: hidden;
        	text-decoration: none;
        	color: #fff;
        	background-color: inherit;
        	text-align: center;
        	cursor: pointer;
        	white-space: nowrap;
        	-webkit-touch-callout: none;
        	-webkit-user-select: none;
        	-khtml-user-select: none;
        	-moz-user-select: none;
        	-ms-user-select: none;
        	user-select: none;
        }

        /*
        button:disabled, .button:disabled {
        	cursor: not-allowed;
        	opacity: 0.3;
        }
        */

        button:hover, .button:hover {
        	text-decoration: none;
        }


        button.openModal {
        	padding: 8px 16px;
        	margin: 0 auto;
        }

        button.openModal:hover {
        	color: #000;
        	background-color: #ccc;
        }

        /* Set a style for submit buttons */
        button.submit {
        	margin: 8px 0;
            background-color: #4CAF50 !important;
            padding: 14px 20px;
            width: 100%;
        }

        /* Extra style for the cancel button (red) */
        button.cancel {
            width: auto;
            padding: 10px 18px;
            background-color: #f44336;
        }

        /* Add a hover effect for buttons */
        button.submit:hover, button.cancel:hover {
            opacity: 0.8;
        }

        /* forms */
        form {
            border: 3px solid #f1f1f1;
            max-width: 600px;
            margin: 5% auto;
        }

        	/* Full-width inputs */
        input[type=text], input[type=password] {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            box-sizing: border-box;
        }

        /* Add padding to the form body */
        .formbody {
            padding: 16px;
        }

        /* Style the footer of the form */
        .formfooter {
            background-color: #f1f1f1;
            padding: 20px;
        }

        /* The "Forgot password" text */
        span.password {
            float: right;
            padding-top: auto;
            padding-bottom: auto;
        }

        /* The Modal (background) */
        .modalForm {
            display: none; /* Hidden by default */
            position: fixed; /* Stay in place */
            z-index: 1; /* Sit on top */
            left: 0;
            top: 0;
            width: 100%; /* Full width */
            height: 100%; /* Full height */
            overflow: auto; /* Enable scroll if needed */
            background-color: rgb(0,0,0); /* Fallback color */
            background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
            padding-top: 60px;
        }

        /* Modal Content/Box */
        .modal-content {
            background-color: #fefefe;
            margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
            border: 1px solid #888;
            width: 80%; /* Could be more or less, depending on screen size */
        }

        /* Position the close button */
        .closeModal-container {
            margin: 24px 0 12px 0;
            position: relative;
        }

        /* The Close Button (x) */
        .closeModal {
            position: absolute;
            right: 25px;
            top: 0;
            color: #000;
            font-size: 35px;
            font-weight: bold;
        }

        .closeModal:hover,
        .closeModal:focus {
            color: red;
            cursor: pointer;
        }

        /* Add Zoom Animation */
        .animate {
            -webkit-animation: animatezoom 0.6s;
            animation: animatezoom 0.6s
        }

        @-webkit-keyframes animatezoom {
            from {-webkit-transform: scale(0)} 
            to {-webkit-transform: scale(1)}
        }
            
        @keyframes animatezoom {
            from {transform: scale(0)} 
            to {transform: scale(1)}
        }

        /* Change styles for span and cancel button on extra small screens */
        @media screen and (max-width: 300px) {
            span.password {
                display: block;
                padding-top: 16px;
                float: none;
            }
            .cancel {
                width: 100%;
            }
        } 

        /* animations */ 
        .animate-opacity {
        	animation: opac 0.8s;
        }

        .animate-top {
        	position: relative;
        	animation: animatetop 0.4s;
        }

        /* main page */

        /* background picture */
        .bgimg {
        	background-image: url('Iceland.jpg');
        	min-height: 100%;
        	background-position: center;
        	background-size: cover;
        }

        /* the line between the title and the buttons */
        hr {
        	border-color: #bbb;
        	margin: auto;
        	width: 40%;
        }

        p {
        	font-size: 18px;
        	text-align: center;
        }
	</style>

	<!--link rel="stylesheet" href="style.css"-->
	<body>
		<div
			class="bgimg display-container animate-opacity">
			<div class="display-middle">
				<h1 class="animate-top text-white">LEARN ICELANDIC</h1>
				<hr>
				<button class="openModal" id="openLoginForm">Login</button>
				<button class="openModal" id="openSignupForm">Signup</button>
			</div>
		</div>

		<div class="modalForm" id="loginForm">
			<form method="POST" class="modal-content animate" action="/demo/Login">
				<div class="closeModal-container">
					<span class="closeModal" id="closeLoginForm" title="Close Login Form">
						&times;
					</span>
				</div>

				<div class="formbody">
					<label>Username</label>
					<input type="text" placeholder="Enter Username" name="loginInfo" required>
					<label>Password</label>
					<input type="password" placeholder="Enter Password" name="loginInfo" required>
					<button type="submit" class="submit">Login</button>
					<input type="checkbox" checked="checked">
					Remember me
				</div>

				<div class="formfooter">
					<button class="cancel" id="cancelLogin">Cancel</button>
					<span class="password">Forgot <a href="#">password?</a></span>
				</div>
			</form>
		</div>

		<div class="modalForm" id="signupForm">
			<form method="POST" class="modal-content animate" action="/demo/Signup">
				<div class="closeModal-container">
					<span class="closeModal" id="closeSignupForm" title="Close Signup Form">
						&times;
					</span>
				</div>

				<div class="formbody">
					<label>Email</label>
					<input type="text" placeholder="Enter Email" name="signupInfo" required>
					<label>Username</label>
					<input type="text" placeholder="Enter Username" name="signupInfo" required>
					<label>Password</label>
					<input type="password" placeholder="Enter Password" name="signupInfo" required>
					<label>Repeat Password</label>
					<input type="password" placeholder="Repeat Password" name="signupInfo" required>
					<button type="submit" class="submit">Signup</button>
					<input type="checkbox" checked="checked">
					Remember me
				</div>

				<div class="formfooter">
					<button class="cancel" id="cancelSignup">Cancel</button>
				</div>
			</form>
		</div>

		<script type="text/javascript"	>
			// Get the openLogin button
			var openLoginBtn = document.getElementById('openLoginForm');

			//Get the closeLogin button
			var closeLoginBtn = document.getElementById('closeLoginForm');

			//Get the cancelLogin button
			var cancelLoginBtn = document.getElementById('cancelLogin');

			// Get the modalLoginForm
			var loginForm = document.getElementById('loginForm');

			// Get the openSignup button
			var openSignupBtn = document.getElementById('openSignupForm');

			//Get the closeSignup button
			var closeSignupBtn = document.getElementById('closeSignupForm');

			//Get the cancelSignup button
			var cancelSignupBtn = document.getElementById('cancelSignup');

			// Get the modalSignupForm
			var signupForm = document.getElementById('signupForm');

			openForm = function(form){
				form.style.display = "block";
			}

			closeForm = function(form){
				form.style.display = "none";
			}

			// When the user clicks on the openLogin button, open the modalLoginForm
			openLoginBtn.onclick = function() {
				openForm(loginForm);
			}

			//When the user clicks on the closeLogin button, close the modalLoginForm
			closeLoginBtn.onclick = function() {
				closeForm(loginForm);
			}

			//When the user clicks on the cancelLogin button, close the modalLoginForm
			cancelLoginBtn.onclick = function() {
				closeForm(loginForm);
			}

			// When the user clicks on the openSignup button, open the modalSignupForm
			openSignupBtn.onclick = function() {
				openForm(signupForm);
			}

			//When the user clicks on the closeSignup button, close the modalSignupForm
			closeSignupBtn.onclick = function() {
				closeForm(signupForm);
			}

			//When the user clicks on the cancelSignup button, close the modalSignupForm
			cancelSignupBtn.onclick = function() {
				closeForm(signupForm);
			}

			// When the user clicks anywhere outside of the form, close it
			window.onclick = function(event) {
				if (event.target == loginForm)
					closeForm(loginForm);
				if (event.target == signupForm)
					closeForm(signupForm);
			}
		</script>
	</body>
</html>
<title>Icelandic for Beginners</title>
<meta charset="UTF-8">
<meta name="description" content="Learn Icelandic for Beginners">
<meta name="keywords"
	content="Icelandic, Beginners' Icelandic, Learn Icelandic">
<meta name="author" content="Arnór Kristmundsson">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="style.css">
<body>
	<div class="bgimg display-container animate-opacity">
		<div class="display-middle">
			<h1 class="animate-top text-white">LEARN ICELANDIC</h1>
			<hr>
			<button class="openModal" id="openLoginForm">Login</button>
			<button class="openModal" id="openSignupForm">Signup</button>
		</div>
	</div>

	<div class="modalForm" id="loginForm">
		<form method="POST" class="modal-content animate" action="/demo/Login">
			<div class="closeModal-container">
				<span class="closeModal" id="closeLoginForm"
					title="Close Login Form"> &times; </span>
			</div>

			<div class="formbody">
				<label>Username</label>
				<input type="text" placeholder="Enter Username" name="loginInfo" required>
				<label>Password</label>
				<input type="password" placeholder="Enter Password" name="loginInfo" required>
				<button type="submit" class="submit">Login</button>
				<input type="checkbox" checked="checked">
				Remember me
			</div>

			<div class="formfooter">
				<button class="cancel" id="cancelLogin">Cancel</button>
				<span class="password">Forgot <a href="#">password?</a></span>
			</div>
		</form>
	</div>

	<div class="modalForm" id="signupForm">
		<form method="POST" class="modal-content animate" action="/demo/Signup">
			<div class="closeModal-container">
				<span class="closeModal" id="closeSignupForm" title="Close Signup Form"> 
					&times;
				</span>
			</div>

			<div class="formbody">
				<label>Email</label>
				<input type="text" placeholder="Enter Email" name="signupInfo" required>
				<label>Username</label>
				<input type="text" placeholder="Enter Username" name="signupInfo" required>
				<label>Password</label>
				<input type="password" placeholder="Enter Password" name="signupInfo" required><label>Repeat Password</label>
				<input type="password" placeholder="Repeat Password" name="signupInfo" required>
				<button type="submit" class="submit">Signup</button>
				<input type="checkbox" checked="checked"> Remember me
			</div>

			<div class="formfooter">
				<button class="cancel" id="cancelSignup">Cancel</button>
			</div>
		</form>
	</div>

	<script type="text/javascript">
		var openLoginBtn = document.getElementById('openLoginForm');
		var closeLoginBtn = document.getElementById('closeLoginForm');
		var cancelLoginBtn = document.getElementById('cancelLogin');
		var loginForm = document.getElementById('loginForm');
		var openSignupBtn = document.getElementById('openSignupForm');
		var closeSignupBtn = document.getElementById('closeSignupForm');
		var cancelSignupBtn = document.getElementById('cancelSignup');
		var signupForm = document.getElementById('signupForm');

		openForm = function(form) {
			form.style.display = "block";
		}

		closeForm = function(form) {
			form.style.display = "none";
		}

		openLoginBtn.onclick = function() {
			openForm(loginForm);
		}

		closeLoginBtn.onclick = function() {
			closeForm(loginForm);
		}

		cancelLoginBtn.onclick = function() {
			closeForm(loginForm);
		}

		openSignupBtn.onclick = function() {
			openForm(signupForm);
		}

		closeSignupBtn.onclick = function() {
			closeForm(signupForm);
		}

		cancelSignupBtn.onclick = function() {
			closeForm(signupForm);
		}

		// When the user clicks anywhere outside of the form, close it
		window.onclick = function(event) {
			if (event.target == loginForm)
				closeForm(loginForm);
			if (event.target == signupForm)
				closeForm(signupForm);
		}
	</script>
</body>
</html>
